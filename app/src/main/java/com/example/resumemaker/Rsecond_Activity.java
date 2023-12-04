package com.example.resumemaker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Rsecond_Activity extends AppCompatActivity {


    ImageView img1,img2,img3,img4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rsecond);

      img1.findViewById(R.id.img1);
      img2.findViewById(R.id.img2);
      img3.findViewById(R.id.img3);
      img4.findViewById(R.id.img4);


        String name = getIntent().getStringExtra("name");
        String birthdate =getIntent().getStringExtra("birthdate");
        String adderess =getIntent().getStringExtra("adderess");
        String email =getIntent().getStringExtra("email");
        String clg =getIntent().getStringExtra("clg");
        String univarcity =getIntent().getStringExtra("univarcity");getIntent();
        String degeer =getIntent().getStringExtra("degeer");
        String passingy =getIntent().getStringExtra("pssingy");
        String experience =getIntent().getStringExtra("experience");
        String expertise =getIntent().getStringExtra("expertise");
        String language =getIntent().getStringExtra("language");


        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Rsecond_Activity.this,image1_Activity.class);
                intent.putExtra("name",name);
                intent.putExtra("birthd",birthdate);
                intent.putExtra("add",adderess);
                intent.putExtra("eml",email);
                intent.putExtra("clg",clg);
                intent.putExtra("univarcity",univarcity);
                intent.putExtra("degeer",degeer);
                intent.putExtra("pssingy",passingy);
                intent.putExtra("experience",experience);
                intent.putExtra("expertise",expertise);
                intent.putExtra("language",language);
            }
        });
    }
}