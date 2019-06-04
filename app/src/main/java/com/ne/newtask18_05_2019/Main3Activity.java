package com.ne.newtask18_05_2019;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {
SqlileDataform sqlitedata;
EditText edituser, editmobile;
//String u1,m1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        edituser=findViewById(R.id.username1);
        editmobile=findViewById(R.id.mobilenumber1);
        sqlitedata= new SqlileDataform(Main3Activity.this);


    }

    public void signincomplete(View view) {
        //u1=edituser.getText().toString();
       // m1=editmobile.getText().toString();
        sqlitedata.mainInput(edituser.getText().toString(),editmobile.getText().toString());
        Toast.makeText(this, "signin completed", Toast.LENGTH_SHORT).show();


    }

}
