package com.example.zmq162.retrifitlibdemo.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by zmq162 on 3/5/17.
 */
public class User {
    @SerializedName("name")
    public String name;
    @SerializedName("job")
    public String job;
    @SerializedName("id")
    public String id;
    @SerializedName("createdAt")
    public String createdAt;

    public User(String name, String job){
        this.name = name;
        this.job = job;
    }

}
