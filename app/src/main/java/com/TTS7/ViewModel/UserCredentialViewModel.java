package com.TTS7.ViewModel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.TTS7.UIState.UserCredentialUIState;
import com.TTS7.UIState.UserNameUIState;
import com.TTS7.UIState.UserPasswordUIState;

import java.util.Objects;

public class UserCredentialViewModel extends ViewModel {
    private UserCredentialUIState userCredentialUIState;
    MutableLiveData<UserCredentialUIState> userLoginDetails = new MutableLiveData<>();
//    MutableLiveData<UserNameUIState> userNameMutableLiveData = new MutableLiveData<>();
//    MutableLiveData<UserPasswordUIState> userPasswordMutableLiveData = new MutableLiveData<>();
    UsernameViewModel usernameViewModel;
    PasswordViewModel passwordViewModel;

//    public boolean checkForValidUserCredentials(UsernameViewModel usernameViewModel, PasswordViewModel passwordViewModel){
        //        String userName = usernameViewModel.removeWhiteFromUsername(Objects.requireNonNull(userNameMutableLiveData.getValue()).getUsername());
//        boolean checkForBlankUsername = ((UsernameViewModel)userName).checkForBlankUsername(userName);
//        if(!((UsernameViewModel)userName).checkForBlankUsername)

//          if(usernameViewModel.removeWhiteFromUsername(userNameMutableLiveData.getValue().getUsername())){
//              return true;
//        }
//        return usernameViewModel.checkForBlankUsername(Objects.requireNonNull(userNameMutableLiveData.getValue()).getUsername()) && passwordViewModel.isPasswordInCorrectFormat(Objects.requireNonNull(userPasswordMutableLiveData.getValue()).getUserPassword()) && passwordViewModel.isPasswordMinEightCharacter(userPasswordMutableLiveData.getValue().getUserPassword());
//
//    }

    public void checkUserCredentials(){
        if(usernameViewModel != null & passwordViewModel !=null){
            userCredentialUIState.setCredentialPresent(true);
        }
        userLoginDetails.postValue(userCredentialUIState);
    }

}
