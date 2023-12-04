package com.example.resumemaker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class image1_Activity extends AppCompatActivity {

    TextView txtcontact,txtemail,txtaddress,txtcollege,txtuniversity,txtdegree,txtpassingyear,txtexpertise,txtlanguage,txtname,txtexperience,txtobjective;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image1);

        txtcontact = findViewById(R.id.txtcontact);
        txtemail = findViewById(R.id.txtemail);
        txtaddress = findViewById(R.id.txtaddress);
        txtcollege = findViewById(R.id.txtcollege);
        txtuniversity = findViewById(R.id.txtuniversity);
        txtdegree = findViewById(R.id.txtdegree);
        txtpassingyear = findViewById(R.id.txtpassingyear);
        txtexpertise = findViewById(R.id.txtexpertise);
        txtlanguage = findViewById(R.id.txtlanguage);
        txtname = findViewById(R.id.txtname);
        txtexperience = findViewById(R.id.txtexperience);
        txtobjective = findViewById(R.id.txtobjective);

        Intent intent = getIntent();

        String contact = intent.getStringExtra("contact");
        String email = intent.getStringExtra("email");
        String address = intent.getStringExtra("address");
        String college = intent.getStringExtra("college");
        String univarcity = intent.getStringExtra("univarcity");
        String degree = intent.getStringExtra("degree");
        String passingyear = intent.getStringExtra("passingyear");
        String expertise = intent.getStringExtra("expertise");
        String language = intent.getStringExtra("language");
        String name = intent.getStringExtra("name");
        String experience = intent.getStringExtra("experience");
        String objective = intent.getStringExtra("objective");

        txtcontact.setText(contact);
        txtemail.setText(email);
        txtaddress.setText(address);
        txtcollege.setText(college);
        txtuniversity.setText(univarcity);
        txtdegree.setText(degree);
        txtpassingyear.setText(passingyear);
        txtlanguage.setText(language);
        txtexpertise.setText(expertise);
        txtname.setText(name);
        txtexperience.setText(experience);
        txtobjective.setText(objective);

     }
}