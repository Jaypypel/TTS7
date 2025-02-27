package com.TTS7.Fragment;



import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.TTS7.R;

public class UsernameFragment extends Fragment {
    private EditText username;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.username_fragment,container, false);
        username = (EditText) view.findViewById(R.id.editTextUsername);
        return view;
    }


    public String getUsername() {
        return username.getText().toString();
    }
}
