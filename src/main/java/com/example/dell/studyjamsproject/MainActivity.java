package com.example.dell.studyjamsproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public  void startmatch(View v)
    {

        EditText editText = (EditText) findViewById(R.id.editText);
        EditText editText1 = (EditText) findViewById(R.id.editText2);



        Intent intent = new Intent(this,ScoreActivity.class);

        if(editText.getText().toString().length() <2 && editText1.getText().toString().length() < 2 ){
            intent.putExtra("local","team a");
            intent.putExtra("visitor","team b");

        }else{
            intent.putExtra("local",editText.getText().toString());
            intent.putExtra("visitor",editText1.getText().toString());

        }



        startActivity(intent);



    }
}
