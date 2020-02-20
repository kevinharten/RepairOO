package com.example.bikerepairoo;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    public static int splash =2000;
    ImageView imageView1;
    Animation fadeIn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        new Handler().postDelayed(()-> {
            Intent i = new Intent(MainActivity.this,Activity2.class);
            startActivity(i);
            finish();
        },splash);

        imageView1  = (ImageView)findViewById(R.id.imageView1) ;


        fadeIn = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fadein);
        imageView1.startAnimation(fadeIn);




    }
}
