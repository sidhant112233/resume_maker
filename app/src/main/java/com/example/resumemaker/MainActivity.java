package com.example.resumemaker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends Rsecond_Activity {


    EditText txtname,txtbirthdate,txtadd,txtcontact,txtemail,txtclg,txtunivarcity,txtdegree,txtpassingY,txtexperience,txtexpertise,txtlanguage;

    Button btnsubmit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        txtname = findViewById(R.id.txtname);
        txtbirthdate = findViewById(R.id.txtbirthdate);
        txtadd = findViewById(R.id.txtadd);
        txtcontact = findViewById(R.id.txtcontact);
        txtclg = findViewById(R.id.txtclg);
        txtemail = findViewById(R.id.txtemail);
        txtunivarcity = findViewById(R.id.txtunivarcity);
        txtdegree = findViewById(R.id.txtdegree);
        txtpassingY = findViewById(R.id.txtpassingY);
        txtexperience = findViewById(R.id.txtexperience);
        txtexpertise = findViewById(R.id.txtexpertise);
        txtlanguage = findViewById(R.id.txtlanguage);
        btnsubmit = findViewById(R.id.btns);


        btnsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                String name = txtname.getText().toString();
                String birthdate = txtbirthdate.getText().toString();
                String adderess = txtadd.getText().toString();
                String emal = txtemail.getText().toString();
                String colg = txtclg.getText().toString();
                String univarcity = txtunivarcity.getText().toString();
                String degree =txtdegree.getText().toString();
                String passingy =txtpassingY.getText().toString();
                String experience =txtexperience.getText().toString();
                String expertise =txtexpertise.getText().toString();
                String language =txtlanguage.getText().toString();

                Intent i = new Intent(MainActivity.this,Rsecond_Activity.class);
                i.putExtra("name",name);
                i.putExtra("birthd",birthdate);
                i.putExtra("add",adderess);
                i.putExtra("eml",emal);
                i.putExtra("clg",colg);
                i.putExtra("univarcity",univarcity);
                i.putExtra("degeer",degree);
                i.putExtra("pssingy",passingy);
                i.putExtra("experience",experience);
                i.putExtra("expertise",expertise);
                i.putExtra("fnal",language);

            }
        });
    }
}