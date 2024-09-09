package com.TTS7.Activity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.os.StrictMode;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.TTS7.Fragment.PasswordFragment;
import com.TTS7.Fragment.UsernameFragment;
import com.TTS7.R;
//import com.TTS7.ViewModel.loginViewModel;

public class LoginActivity extends AppCompatActivity {
    //private loginViewModel loginViewModel;
    private Button btnLogin, btnRegister;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);
        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);

        btnLogin = (Button) findViewById(R.id.buttonSignin);
        btnRegister = (Button) findViewById(R.id.buttonRegister);

        if (savedInstanceState == null) {
            loadFragment(new UsernameFragment(),R.id.username_fragment);
            loadFragment(new PasswordFragment(),R.id.password_fragment);
        }

        btnLogin.setOnClickListener(view -> {
            btnLogin.setBackgroundColor(Color.GRAY);
            //will need to login from backendservice;
            btnLogin.setBackgroundResource(android.R.drawable.btn_default);
        });

        btnRegister.setOnClickListener(view -> {


        } );

    }

    private void loadFragment(Fragment fragment, int containerId){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(containerId, fragment);
        fragmentTransaction.commit();
    }
}
