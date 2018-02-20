package com.example.sowmyaram.retrofit;

/**
 * Created by sowmyaram on 11/14/2017.
 */

import retrofit2.Call;
import retrofit2.http.GET;
public interface ApiService {

    /*
    Retrofit get annotation with our URL
    And our method that will return us the List of ContactList
    */
    //http://pratikbutani.x10.mx
    // json_data.json

    @GET("/json_data.json")
    Call<ContactList> getMyJSON();
}