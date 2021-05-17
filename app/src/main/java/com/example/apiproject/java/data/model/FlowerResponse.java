package com.example.apiproject.java.data.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class FlowerResponse {
    @SerializedName("hits")
    @Expose
    public List<Hits> hits;

    public FlowerResponse(List<Hits> hits) {
        this.hits = hits;
    }

    public List<Hits> getHits() {
        return hits;
    }

    public static class Hits{
        @SerializedName("webformatURL")
        @Expose
        private String url;

        public Hits(String url) {
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }
    }
}
