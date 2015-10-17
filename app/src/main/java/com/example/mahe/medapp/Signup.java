package com.example.mahe.medapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class Signup extends Activity {
    EditText fname,lname,uname,passw,passw1;
    Button signup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        fname=(EditText)findViewById(R.id.fname);
        lname=(EditText)findViewById(R.id.lname);
        uname=(EditText)findViewById(R.id.uname);
        passw=(EditText)findViewById(R.id.passw);
        passw1=(EditText)findViewById(R.id.passw1);
        signup=(Button)findViewById(R.id.signup1);
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(fname.getText().toString().length()==0 || lname.getText().toString().length()==0 || uname.getText().toString().length()==0 || passw.getText().toString().length()==0)
                {
                    Toast.makeText(getApplicationContext(),"Please fill all fields",Toast.LENGTH_LONG).show();
                }
                if(passw.getText().toString()!=passw1.getText().toString())
                {
                    Toast.makeText(getApplicationContext(),"Passwords do not match",Toast.LENGTH_LONG);
                }
                Toast.makeText(getApplicationContext(),"Signed up successfully",Toast.LENGTH_LONG).show();
                Intent i=new Intent(Signup.this,MainActivity.class);
                startActivity(i);

            }
        });
    }



}
