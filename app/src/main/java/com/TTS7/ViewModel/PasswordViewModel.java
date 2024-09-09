package com.TTS7.ViewModel;


import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.TTS7.UIState.UserPasswordUIState;

public class PasswordViewModel extends ViewModel {

    UserPasswordUIState uiState = new UserPasswordUIState();
    private final MutableLiveData<UserPasswordUIState> inputUserPassword = new MutableLiveData<UserPasswordUIState>(new UserPasswordUIState());



    public LiveData<UserPasswordUIState> getInputUserPassword() {
        return inputUserPassword;
    }


    public void setInputUserPassword(String password){
        if(isPasswordMinEightCharacter(password) && isPasswordInCorrectFormat(password)){
        uiState.setUserPassword(password);  // Assuming UserPasswordUIState has a setPassword() method
        inputUserPassword.setValue(uiState);}
    }

    public boolean isPasswordInCorrectFormat(String inputPswrd) {
        return !inputPswrd.isBlank() && !inputPswrd.isEmpty();
    }

    public boolean isPasswordMinEightCharacter(String inputPswrd) {
        return inputPswrd.length() >= 8;
    }

}
