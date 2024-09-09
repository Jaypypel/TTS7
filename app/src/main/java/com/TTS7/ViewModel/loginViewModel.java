package com.TTS7.ViewModel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.TTS7.UIState.LoginUIState;

import java.util.Objects;

public class loginViewModel extends ViewModel {
    private  LoginUIState loginUIState;
    private MutableLiveData<LoginUIState> loginMutableLiveData = new MutableLiveData<>();
    private UserCredentialViewModel userCredentialViewModel;

    public void setUserLogin(){
        if(userCredentialViewModel != null){
            loginUIState.setLoading(false);
            loginUIState.setUserLoggedIn(true);

        }
    }
//    public UserCredentialViewModel getUserCredentialViewModel() {
//        return userCredentialViewModel;
//    }
//
//    public void setUserCredentialViewModel(UserCredentialViewModel userCredentialViewModel) {
//        this.userCredentialViewModel = userCredentialViewModel;
//    }
//
//    private UserCredentialViewModel userCredentialViewModel;
//
//    public loginViewModel(UserCredentialViewModel userCredentialViewModel) {
//        this.userCredentialViewModel = userCredentialViewModel;
//    }
//
//    public boolean isLoggedIn(){
//        Objects.requireNonNull(loginMutableLiveData.getValue()).isUserLoggedIn(true);
//        return userCredentialViewModel.checkForValidUserCredentials(userCredentialViewModel.usernameViewModel,  userCredentialViewModel.passwordViewModel);
//    }



//    private MutableLiveData<LoginFormState> loginFormState = new MutableLiveData<>();
//    private MutableLiveData<LoginResult> loginResult = new MutableLiveData<>();
//
//    private LoginRespository loginRepository;
//    public LoginViewModel() {
//        this.loginRepository = LoginRepository.getInstance(new LoginDataSource());
//
//    }
//
//    public LiveData<LoginFormState> getLoginFormState() {
//        return loginFormState;
//    }
//
//    public LiveData<LoginResult> getLoginResult() {
//        return loginResult;
//    }
//
//    public void loginDataChanged(String username, String password) {
//        if(!isUserNameValid(username)){
//            loginFormState.setValue(new LoginFormState(R.string.invalid_username, null));
//        }
//        if(!isPasswordValid(password)){
//            loginFormState.setValue(new LoginFormState(null, R.string.invalid_pasword));
//        }
//    }
//
//    public void login(String username, String password) {
//        loginRepository.login(username, password, new LoginRepository.LoginCallback(){
//            @Override
//            public void onLoginSuccess(LoggedInUser loggedInUser){
//                loginResult.setValue(new LoginResult(new LogggedInUserView(loggedInUser.getDisplayName())));
//            }
//
//            @Override
//            public void onLoginFailed() {
//                loginResult.setValue(new LoginResult(R.string.login));
//            }
//        });
//    }
//
//    public boolean isUserNameValid(String userName){
//        return userName != null &&  userName.contains("@");
//    }
//
//    public boolean isPasswordValid(String password){
//        return password != null && password.trim().length() > 5;
//    }
}
