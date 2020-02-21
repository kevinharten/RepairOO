package com.example.bikerepairoo;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.google.android.material.textfield.TextInputLayout;

import org.w3c.dom.Text;

public class Activity2 extends AppCompatActivity {
    private ImageView imageView2;
   // private EditText email,password;
    private TextInputLayout memail,mpassword;
    private Button signUp;
    long duration = 1000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

//        email = (EditText) findViewById(R.id.email);
//        password = (EditText)findViewById(R.id.password);
        memail=(TextInputLayout)findViewById(R.id.memail);
        mpassword=(TextInputLayout)findViewById(R.id.mpassword);
        signUp = (Button)findViewById(R.id.SignUp);

        memail.setErrorTextColor(ColorStateList.valueOf(Color.RED));
        mpassword.setErrorTextColor(ColorStateList.valueOf(Color.RED));





        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Activity2.this,Activity3.class);
                startActivity(i);
            }
        });








        imageView2 = (ImageView)findViewById(R.id.imageView2);

        //Animator
        ObjectAnimator objAnime = ObjectAnimator.ofFloat(imageView2,"y",195f);
        objAnime.setDuration(duration);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objAnime);
        animatorSet.start();


    }

    private boolean validateEmail() {
        String email = memail.getEditText().getText().toString().trim();
        if (email.isEmpty()){
            memail.setError("Email is Required, Cant be Empty !");
            return false;
        } else {
            memail.setError(null);
            return true;
        }
    }

    private boolean validePassword() {
        String pass = mpassword.getEditText().getText().toString().trim();
        if (pass.isEmpty()) {
            mpassword.setError("Password is required, Cant be empty!");
            return false;
        }
        else {
            mpassword.setError(null);
            return true;
        }
    }
}
