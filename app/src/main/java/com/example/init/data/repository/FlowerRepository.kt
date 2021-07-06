package com.example.init.data.repository

import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.example.init.api.ApiService
import com.example.init.api.RetrofitClient
import com.example.init.data.model.Hit
import com.example.init.resource.Resource
import kotlinx.coroutines.*
import retrofit2.await

class FlowerRepository : FlowerDataSource {
    private  val TAG = "FlowerRepository"
    val api = RetrofitClient.retrofit.create(ApiService::class.java)
    val job = Job()
    val ioScope = CoroutineScope(Dispatchers.IO + job)
    val getListFlowerResult = MutableLiveData<Resource<List<Hit>?>?>(null)

    override fun getListFlower() {
        ioScope.launch {
            try{
                val result = api.getFlower().await()
                if (result.isSuccessful()) {
                    getListFlowerResult.postValue(Resource.Success(result.hits))
                    Log.d(TAG, "getListFlower: "+result.hits?.size)
                } else {
                    getListFlowerResult.postValue(Resource.Error("Get list flower error"))
                }
            }catch (e:Exception){
                e.stackTrace
            }

        }
    }

    companion object {
        val instant = FlowerRepository()
    }
}