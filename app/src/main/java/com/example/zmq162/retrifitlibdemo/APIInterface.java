package com.example.zmq162.retrifitlibdemo;

import com.example.zmq162.retrifitlibdemo.model.MultipleResource;
import com.example.zmq162.retrifitlibdemo.model.User;
import com.example.zmq162.retrifitlibdemo.model.UserList;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * Created by zmq162 on 3/5/17.
 */
public interface APIInterface {
    @GET("/api/unknown")
    Call<MultipleResource> doGetListResources();

    @POST("/api/users")
    Call<User> createUser(@Body User user);

    @GET("/api/users?")
    Call<UserList> doGetUserList(@Query("page") String page);

    @FormUrlEncoded
    @POST("/api/users?")
    Call<UserList> doCreateUserWithField(@Field("name") String name, @Field("job") String job);
}