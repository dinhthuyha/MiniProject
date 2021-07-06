package com.example.init.ui

import androidx.lifecycle.ViewModel
import com.example.init.data.repository.FlowerRepository

class MainViewModel : ViewModel() {
    val flowerResult = FlowerRepository.instant.getListFlowerResult

    init {
        FlowerRepository.instant.getListFlower()
    }
}