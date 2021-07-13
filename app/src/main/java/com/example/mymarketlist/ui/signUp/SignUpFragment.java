package com.example.mymarketlist.ui.signUp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.mymarketlist.R;


public class SignUpFragment extends Fragment {

    View view;
    EditText emailEt;
    EditText passwordEt;
    Button enterBtn;
    TextView newAccountTv;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Initialize
        view = inflater.inflate(R.layout.fragment_sign_up, container, false);
        emailEt= view.findViewById(R.id.sign_up_email_address_et);
        passwordEt= view.findViewById(R.id.sign_up_password_et);
        enterBtn= view.findViewById(R.id.sign_up_enter_btn);
        newAccountTv= view.findViewById(R.id.sign_up_have_an_account_tv);

        //ViewModel:


        //Listeners:


        return view;
    }
}