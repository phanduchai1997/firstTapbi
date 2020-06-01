package com.atcb.firstproject.api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class DataApi {
    public static Retrofit mRetrofit;

    public static Retrofit getmRetrofit(){
        if(mRetrofit == null){
            mRetrofit = new Retrofit.Builder()
                    .baseUrl("http://contents.amberweather.com/1/item/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

        }
        return  mRetrofit;
    }
    public static Service getmService() {
        return getmRetrofit().create(Service.class);
    }
}
