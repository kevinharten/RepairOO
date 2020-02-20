package com.example.bikerepairoo;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.google.android.material.textfield.TextInputLayout;

public class Activity2 extends AppCompatActivity {
    private ImageView imageView2;
    private EditText email,pass;
    private Button signUp;
    long duration = 1000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        email = (EditText) findViewById(R.id.email);
        pass = (EditText)findViewById(R.id.pass);
        signUp = (Button)findViewById(R.id.SignUp);

        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Activity2.this,Activity3.class);
                startActivity(i);
            }
        });







        imageView2 = (ImageView)findViewById(R.id.imageView2);

        //Animator
        ObjectAnimator objAnime = ObjectAnimator.ofFloat(imageView2,"y",250f);
        objAnime.setDuration(duration);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objAnime);
        animatorSet.start();
    }
}
