package com.TTS7.UIState;

public class UserCredentialUIState {


    private boolean isCredentialPresent;

    public UserCredentialUIState() {
        this.isCredentialPresent = false;
    }


    public boolean isCredentialPresent() {
        return isCredentialPresent;
    }

    public void setCredentialPresent(boolean credentialPresent) {
        isCredentialPresent = credentialPresent;
    }
}
