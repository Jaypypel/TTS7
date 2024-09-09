package com.TTS7.Fragment;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ToggleButton;

import androidx.fragment.app.Fragment;


import com.TTS7.R;
import com.TTS7.ViewModel.PasswordViewModel;


public class PasswordFragment extends Fragment {
    private PasswordViewModel passwordViewModel;
    private EditText password;
    private ToggleButton togglePassword;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstance){

        View view = inflater.inflate(R.layout.password_fragment, container, false);
        password = (EditText) view.findViewById(R.id.editTextPassword);
//        togglePassword.setVisibility(View.VISIBLE);
//        togglePassword = view.findViewById(R.id.toggleButton);
//        password.addTextChangedListener(new TextWatcher() {
//            @Override
//            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
//                togglePassword.setVisibility(View.INVISIBLE);
//            }
//
//            @Override
//            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
//
//            }
//
//            @Override
//            public void afterTextChanged(Editable editable) {
//                togglePassword.setVisibility(View.VISIBLE);
//                String pass = getPasswordFromFragment().trim().replaceAll("\\s+","");
//                if(pass.isEmpty() && pass.isBlank()){togglePassword.setVisibility((View.INVISIBLE));
//                }
//            }
//        });
//
//        togglePassword.setOnClickListener(v -> {
//            if(togglePassword.isChecked()) {
//            password.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
//            int pos = password.getText().length();
//            password.setSelection(pos);
//            }
//            password.setTransformationMethod(PasswordTransformationMethod.getInstance());
//            int pos = password.getText().length();
//            password.setSelection(pos);
//        });
        return view;
    }

    public String getPasswordFromFragment() {
        return password.getText().toString();
    }


}
