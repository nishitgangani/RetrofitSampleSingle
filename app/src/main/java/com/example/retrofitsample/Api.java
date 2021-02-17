package com.example.retrofitsample;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface Api {
//    https://jsonplaceholder.typicode.com/comments?postId=1
    String BASE_URL = "https://jsonplaceholder.typicode.com/";

//      @GET("comments?postId=1")
//        Call<List<Model>> getmodel();

    @GET("comments")
    Call<List<Model>> getmodel(@Query("postId")int postId);

}