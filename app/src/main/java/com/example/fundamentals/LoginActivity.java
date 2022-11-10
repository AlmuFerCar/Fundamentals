package com.example.fundamentals;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;

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

      //  Glide for loading girls
        ImageView mGirl = findViewById(R.id.girl);
        ImageView mlogo = findViewById(R.id.mono);

        Glide.with(this)
//              .load("https://images.unsplash.com/photo-1565214975484-3cfa9e56f914?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1482&q=80")
//                .placeholder(R.drawable.girl)
//                firebase para cargar imagenes desde la nube con glide
               .load(R.drawable.girl)

                .transition(DrawableTransitionOptions.withCrossFade(1000))
//                .centerCrop()
                .placeholder(new ColorDrawable(this.getResources().getColor(R.color.purple_200)))
//                .circleCrop()
                .into(mGirl);

        Glide.with(this)
                .load("https://images.unsplash.com/photo-1512849934327-1cf5bf8a5ccc?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=387&q=80")
                .circleCrop()
                .into(mlogo);
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