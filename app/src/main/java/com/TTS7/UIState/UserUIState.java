package com.TTS7.UIState;

public class UserUIState {
    private String fullName;
    private UserNameUIState userNameUIState;
    private UserPasswordUIState userPasswordUIState;
    private String mobileNo;
    private String emailId;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public UserNameUIState getUserName() {
        return userNameUIState;
    }

    public void setUserName(UserNameUIState userNameUIState) {
        this.userNameUIState = userNameUIState;
    }

    public UserPasswordUIState getUserPasswordUIState() {
        return userPasswordUIState;
    }

    public void setUserPasswordUIState(UserPasswordUIState userPasswordUIState) {
        this.userPasswordUIState = userPasswordUIState;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
}
