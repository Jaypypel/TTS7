package com.TTS7.ViewModel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.TTS7.UIState.UserNameUIState;

public class UsernameViewModel extends ViewModel {
    private UserNameUIState userNameUIState;
    private MutableLiveData<UserNameUIState> inputUserName = new MutableLiveData<>();

    public MutableLiveData<UserNameUIState> getInputUserName() {
        return inputUserName;
    }

    public void setInputUserName(MutableLiveData<UserNameUIState> inputUserName) {
        this.inputUserName = inputUserName;
    }


    public void setUsername(String username){
        username = removeWhiteFromUsername(username);
        if(checkForBlankUsername(username)){
        userNameUIState.setUsername(username);
        inputUserName.postValue(userNameUIState);}
    }


    //get whitespace removed username
    public String removeWhiteFromUsername(String inputUsername ){
        return inputUsername.trim().replaceAll("\\s+","");
    }


    //take care username mustn't be empty
    public boolean checkForBlankUsername(String inputUsername){
        return !inputUsername.isBlank();
    }


}
