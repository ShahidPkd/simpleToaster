package com.demo.mapsaddress;

import com.demo.mapsaddress.model.SendLocation;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface ApiInterface {

    //http://local.ezytm.com/App/Webservice/GetLocation

    String BASE_URL = "http://local.ezytm.com/App/Webservice/";


    @FormUrlEncoded
    @POST("GetLocation")
    Call<SendLocation> sendLocation(@Field("DeviceData") String DeviceData, @Field("Latitude") String Latitude, @Field("Longitude") String Longitude, @Field("Addess") String Address);

}
