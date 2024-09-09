package com.TTS7.DataLayer;

import com.TTS7.UIState.UserUIState;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class UserRepository {
   private UserAPI userAPI;

   public UserRepository() {
       Retrofit retrofit = RetrofitClient.getRetrofitInstance();
       userAPI = retrofit.create(UserAPI.class);
   }

   public void registerUser(UserUIState userUIState){
       Call<String> call = userAPI.registerUser(userUIState);
       call.enqueue(new Callback<String>() {
           @Override
           public void onResponse(Call<String> call, Response<String> response) {
               if(response.isSuccessful()) {
                   String answwer = "user register successfully";
               }
           }

           @Override
           public void onFailure(Call<String> call, Throwable t) {
               throw new RuntimeException( "user already exists");
           }
       });
   }

   public void loginUser(String username, String password){
       Call<String> call = userAPI.loginUser(username,password);
       call.enqueue(new Callback<String>() {
           @Override
           public void onResponse(Call<String> call, Response<String> response) {
                String answer = "user logged in successfully";
           }

           @Override
           public void onFailure(Call<String> call, Throwable t) {
                throw new RuntimeException("login failed");
           }
       });
   }
}
