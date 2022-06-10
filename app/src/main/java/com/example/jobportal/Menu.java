package com.example.jobportal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu extends AppCompatActivity {

    Button course,hire,apply,therapist,ngo,buy;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        course = findViewById(R.id.course);
        hire = findViewById(R.id.Hire);
        apply = findViewById(R.id.Apply);
        therapist = findViewById(R.id.therapist);
        ngo = findViewById(R.id.ngo);
        buy = findViewById(R.id.buy);

        course.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Menu.this, Courses.class);
                startActivity(intent);
            }
        });

        hire.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotourl("https://sites.google.com/karostartup.com/akshana-vision-for-vision-less/hire-with-us?authuser=0");
            }
        });
        apply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotourl("https://sites.google.com/karostartup.com/akshana-vision-for-vision-less/apply-for-jobs?authuser=0");
            }
        });
        therapist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotourl("https://sites.google.com/karostartup.com/akshana-vision-for-vision-less/free-counselling-session?authuser=0");
            }
        });
        ngo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotourl("https://sites.google.com/karostartup.com/akshana-vision-for-vision-less/ngo-connect?authuser=0");
            }
        });
        buy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotourl("https://sites.google.com/karostartup.com/akshana-vision-for-vision-less/home");
            }
        });
    }
        private void gotourl(String s){


        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));

    }
}