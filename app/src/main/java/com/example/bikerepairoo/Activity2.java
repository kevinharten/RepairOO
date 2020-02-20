package com.example.bikerepairoo;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.EditText;
import android.widget.ImageView;

public class Activity2 extends AppCompatActivity {
    private ImageView imageView2;
    private EditText editText,editText2;
    long duration = 1000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        editText = (EditText)findViewById(R.id.editText);




        imageView2 = (ImageView)findViewById(R.id.imageView2);

        //Animator
        ObjectAnimator objAnime = ObjectAnimator.ofFloat(imageView2,"y",250f);
        objAnime.setDuration(duration);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objAnime);
        animatorSet.start();
    }
}
