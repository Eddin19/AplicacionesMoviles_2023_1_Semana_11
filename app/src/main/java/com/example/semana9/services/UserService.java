package com.example.semana9.services;

import com.example.semana9.entities.User;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface UserService{
    @GET("users")
    Call<List<User>> getAllUser();

    @GET("users/{id}")
    Call<User> findUser(@Path("id") int id);

    @POST("users")
    Call<User> create(@Body User users);

    @PUT("users/{id}")
    Call<User> update(@Path("id") int id, @Body User users);

    @DELETE("users/{id}")
    Call<Void> delete(@Path("id") int id);
}