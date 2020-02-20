package com.example.bikerepairoo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

import com.google.android.material.textfield.TextInputLayout;

public class Activity3 extends AppCompatActivity {
    private TextInputLayout mEmailLayout,mPasswordLayout,mUsernameLayout;
    private Button buttonvalidate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        mEmailLayout = (TextInputLayout)findViewById(R.id.et_email);
        mPasswordLayout = (TextInputLayout)findViewById(R.id.et_password);
        mUsernameLayout = (TextInputLayout)findViewById(R.id.et_username);
        buttonvalidate = (Button)findViewById(R.id.btn_validate);



    }
}
