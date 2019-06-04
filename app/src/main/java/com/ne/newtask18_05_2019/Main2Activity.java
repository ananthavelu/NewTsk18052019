package com.ne.newtask18_05_2019;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    EditText editmobnum,editusernm,editlocation,editemail,edipswrd,editcnfrmpswrd;
    SqlileDataform sglitedatafrm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        editmobnum=(EditText)findViewById(R.id.editText2);
        editusernm=(EditText)findViewById(R.id.editText3);
        editlocation=(EditText)findViewById(R.id.editText4);
        editemail=(EditText)findViewById(R.id.editText5);
        edipswrd=(EditText)findViewById(R.id.editText6);
        editcnfrmpswrd=(EditText)findViewById(R.id.editText7);
        sglitedatafrm= new SqlileDataform(Main2Activity.this);

    }

    public void signupsave(View view){
       /* editemail.getText().toString();
         edipswrd.getText().toString();
         editcnfrmpswrd.getText().toString();
         editusernm.getText().toString();
        editmobnum.getText().toString();
        editlocation.getText().toString();*/
          // if (editusernm.isEmpty()) {
             //  edittextFN.setError("Please Enter First Name");
               //Toast.makeText(getApplicationContext(),"Please Enter First Name",Toast.LENGTH_SHORT).show();
           //}
        if((editcnfrmpswrd.getText().toString()).equals(edipswrd.getText().toString())) {
            sglitedatafrm.getInput(editusernm.getText().toString(),editemail.getText().toString(), editlocation.getText().toString(),
                    editmobnum.getText().toString(), edipswrd.getText().toString());
            Toast.makeText(this, "saved", Toast.LENGTH_SHORT).show();
            startActivity(new Intent(Main2Activity.this, Main3Activity.class));
        }
        else {
            Toast.makeText(this, "match no", Toast.LENGTH_SHORT).show();
        }
    }
}
