package com.example.bikerepairoo;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;

public class Activity3 extends AppCompatActivity {
    private TextInputLayout mEmailLayout,mPasswordLayout,mUsernameLayout;
    private Button mBtnSignIn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();


        mEmailLayout = (TextInputLayout)findViewById(R.id.et_email);
        mPasswordLayout = (TextInputLayout)findViewById(R.id.et_password);
        mUsernameLayout = (TextInputLayout)findViewById(R.id.et_username);
        mBtnSignIn = (Button)findViewById(R.id.btn_validate);

        mBtnSignIn.setOnClickListener(this::submitData);

        mEmailLayout.setErrorTextColor(ColorStateList.valueOf(Color.BLUE ));




    }
    private boolean validateEmailAdress() {
        String email = mEmailLayout.getEditText().toString().trim();
        if(email.isEmpty()) {
            mEmailLayout.setError("Email is Required, Cant be Empty!");
            return false;
        }else {
            mEmailLayout.setError(null);
            return true;
        }

    }
    private boolean validatePassword() {
        String password = mPasswordLayout.getEditText().toString().trim();
        if(password.isEmpty()) {
            mPasswordLayout.setError("Password is Required, Cant be Empty!");
            return false;
        }else if(password.length()<12) {
            mPasswordLayout.setError("Password is short, 12 Charachters are required");
            return false;
        }
        else {
            mPasswordLayout.setError(null);
            return true;
        }
    }

    private boolean validateUsername() {
        String username = mUsernameLayout.getEditText().toString().trim();
        if(username.isEmpty()) {
            mUsernameLayout.setError("Username is Required, Cant be Empty!");
            return false;
        }else if(username.length()<10){
            mUsernameLayout.setError("Username is short,10 Charachters are required");
            return true;
        }
        else {
            mUsernameLayout.setError(null);
            return true;
        }
    }


    private void submitData(View view) {
        if(!validateEmailAdress() || !validatePassword() || !validateUsername()) {
            return;
        }

        String data = mEmailLayout.getEditText().getText().toString().trim() +"\n"+
                mUsernameLayout.getEditText().getText().toString().trim()+"\n"+
                mPasswordLayout.getEditText().getText().toString();

        Toast.makeText(this,data, Toast.LENGTH_LONG).show();
    }
}
