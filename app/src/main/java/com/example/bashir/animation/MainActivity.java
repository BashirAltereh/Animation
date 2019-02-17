package com.example.bashir.animation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = findViewById(R.id.tImage);
    }

    public void buFade(View view) {
        Animation animation = AnimationUtils.loadAnimation(this,R.anim.fadr_out);
        imageView.setAnimation(animation);
        imageView.startAnimation(animation);
    }

    public void buFadeIn(View view) {
        Animation animation = AnimationUtils.loadAnimation(this,R.anim.fade_in);
        imageView.startAnimation(animation);
    }

    public void buBlink(View view) {
        Animation animation = AnimationUtils.loadAnimation(this,R.anim.blink);
        imageView.startAnimation(animation);

    }

    public void buZoomIn(View view) {
        Animation animation = AnimationUtils.loadAnimation(this,R.anim.zoom_in);
        imageView.startAnimation(animation);
    }

    public void buZoomOut(View view) {
        Animation animation = AnimationUtils.loadAnimation(this,R.anim.zoom_out);
        imageView.startAnimation(animation);
    }

    public void buRotate(View view) {
        Animation animation = AnimationUtils.loadAnimation(this,R.anim.rotate);
        imageView.startAnimation(animation);
    }

    public void buMoveDown(View view) {
        Animation animation = AnimationUtils.loadAnimation(this,R.anim.move);
        imageView.startAnimation(animation);
    }

    public void buMoveRight(View view) {
        Animation animation = AnimationUtils.loadAnimation(this,R.anim.move_right);
        imageView.startAnimation(animation);
    }

    public void buSlideUp(View view) {
        Animation animation = AnimationUtils.loadAnimation(this,R.anim.slide_up);
        imageView.startAnimation(animation);

    }

    public void buSlideRight(View view) {
        Animation animation = AnimationUtils.loadAnimation(this,R.anim.slide_right);
        imageView.startAnimation(animation);
    }

    public void buZoomWithRotate(View view) {
        Animation animation = AnimationUtils.loadAnimation(this,R.anim.zoon_rotate);
        imageView.startAnimation(animation);
    }

    public void buFall(View view) {
        Animation animation = AnimationUtils.loadAnimation(this,R.anim.fall);
        imageView.startAnimation(animation);
    }
}
