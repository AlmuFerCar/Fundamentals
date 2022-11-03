package com.example.fundamentals;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {
    /*TextView textosingup;*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
       /* textosingup = findViewById(R.id.signup);*/

      /*  Intent intent = getIntent();
       textosingup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {iniciarSignUp();}
        });*/
    }

    public void iniciarSignup(View v) {
        Intent intent = new Intent(LoginActivity.this, SignupActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK); /*PARA QUE NO SE PUEDA IR HACIA ATRAS*/
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK); /*PARA QUE NO SE PUEDA IR HACIA ATRAS*/
        startActivity(intent);



    }
   /* public void iniciarSignUp()
    {
        Intent intent = new Intent( this, SignupActivity.class);
        startActivity(intent);
    }*/
}