package com.example.bharatd.retrofitexample.util;

import com.example.bharatd.retrofitexample.network.APIService;
import com.example.bharatd.retrofitexample.network.RetrofitClient;

/**
 * Created by BharatD on 01-09-2018.
 */


public class ApiUtils {

    private ApiUtils() {}

    public static final String BASE_URL = "http://jsonplaceholder.typicode.com/";

    public static APIService getAPIService() {

        return RetrofitClient.getClient(BASE_URL).create(APIService.class);
    }
}