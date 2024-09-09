package com.TTS7.UIState;


public class LoginUIState {

        private boolean isUserLoggedIn;
        private boolean isLoading;
        private  UserCredentialUIState userCredentialUIState;


        public LoginUIState(UserCredentialUIState userCredentialUIState) {
                this.userCredentialUIState = userCredentialUIState;
                this.isUserLoggedIn = false; // Default value
                this.isLoading = true;
        }


        public void setUserCredentialUIState(UserCredentialUIState userCredentialUIState) {
                this.userCredentialUIState = userCredentialUIState;
        }

        public UserCredentialUIState getUserCredentialUIState() {
                return userCredentialUIState;
        }

        public void setUserLoggedIn(boolean userLoggedIn) {
                isUserLoggedIn = userLoggedIn;
        }

        public void setLoading(boolean loading) {
                isLoading = loading;
        }

        public boolean isLoading() {
                return isLoading;
        }


        public boolean isUserLoggedIn() {
                return isUserLoggedIn;
        }

}
