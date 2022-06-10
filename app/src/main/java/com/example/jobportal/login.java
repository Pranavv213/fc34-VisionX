package com.example.jobportal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class login extends AppCompatActivity {
    Button login;
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        login = findViewById(R.id.loginbtn);
        editText = findViewById(R.id.louserN);

        int loginD = 0;

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(login.this,Menu.class);
                startActivity(intent);

                String S = editText.getText().toString();

                Toast.makeText(getApplicationContext(),
                                "Welcome "+S,
                                Toast.LENGTH_LONG)
                        .show();

            }
        });

    }


}