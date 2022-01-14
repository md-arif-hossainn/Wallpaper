package com.example.wallpaper;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiUtilities {

    private static  Retrofit retrofit = null;
    public static final String API = "563492ad6f91700001000001bc5fb0967ed34dc5bd764357b7370973";

    public static ApiInterface getApiInterface()
    {
        if(retrofit == null)
        {
            retrofit = new Retrofit.Builder().baseUrl(ApiInterface.BASE_URL).addConverterFactory(GsonConverterFactory.create()).build();

        }
        return retrofit.create(ApiInterface.class);
    }

}
