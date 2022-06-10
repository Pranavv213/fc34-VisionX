package com.example.jobportal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    Button menu;
    Button login;
    TextToSpeech textToSpeech,textToSpeech1;
    ImageButton img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int i = 0;
        menu = findViewById(R.id.menu);
        login = findViewById(R.id.login);
        img = findViewById(R.id.imgbt);
        textToSpeech = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int i) {
                if(i == textToSpeech.SUCCESS){
                    int lang = textToSpeech.setLanguage(Locale.ENGLISH);
                }
            }
        }

        );

        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = "Welcome to the job portal your opportunity awaits you  ";
                int speed = textToSpeech.setSpeechRate(0.7F);
                int speech = textToSpeech.speak(s,textToSpeech.QUEUE_FLUSH,null);


            }
        });
            menu.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(MainActivity.this, Menu.class);
                    startActivity(intent);
                }
            });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent  = new Intent(MainActivity.this, login.class);
                startActivity(intent);
            }
        });


    }
}