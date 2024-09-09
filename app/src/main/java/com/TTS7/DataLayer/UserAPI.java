package com.TTS7.DataLayer;

import com.TTS7.UIState.UserUIState;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface UserAPI {

    @POST("app/user/register")
    Call<String> registerUser(@Body UserUIState userUIState);

    @GET("app/user/login/{username}{password}")
    Call<String> loginUser(@Path("username") String username, @Path("password") String password);

}
