package com.example.bharatd.retrofitexample.network;

/**
 * Created by BharatD on 01-09-2018.
 */

import com.example.bharatd.retrofitexample.model.Post;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface APIService {

    @POST("/posts")
    @FormUrlEncoded
    Call<Post> savePost(@Field("title") String title,
                        @Field("body") String body,
                        @Field("userId") long userId);
}