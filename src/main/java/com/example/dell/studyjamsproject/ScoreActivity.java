package com.example.dell.studyjamsproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ScoreActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);

        Intent intent = getIntent();
        TextView teama = (TextView) findViewById(R.id.teama);
        TextView teamb = (TextView) findViewById(R.id.teamb);

        teama.setText(intent.getStringExtra("local").toString());
        teamb.setText(intent.getStringExtra("visitor").toString());

    }


    public void reset(View v)
    {

        TextView local = (TextView) findViewById(R.id.scorelocal);
        TextView visitor = (TextView) findViewById(R.id.scorevisitors);

        local.setText("0");
        visitor.setText("0");
        scoreTeamA = 0;
        scoreTeamB = 0;


    }


    public void increaseAThree(View v)
    {
        TextView local = (TextView) findViewById(R.id.scorelocal);
        scoreTeamA += 3;
        local.setText(""+scoreTeamA);


    }

    public void increaseATwo(View v)
    {
        TextView local = (TextView) findViewById(R.id.scorelocal);
        scoreTeamA += 2;
        local.setText(""+scoreTeamA);


    }

    public void increaseA(View v)
    {
        TextView local = (TextView) findViewById(R.id.scorelocal);
        scoreTeamA += 1;
        local.setText(""+scoreTeamA);


    }

    public void increaseB(View v)
    {
        TextView visitor = (TextView) findViewById(R.id.scorevisitors);
        scoreTeamB += 1;
        visitor.setText(""+scoreTeamB);


    }

    public void increaseBTwo(View v)
    {
        TextView visitor = (TextView) findViewById(R.id.scorevisitors);
        scoreTeamB += 2;
        visitor.setText(""+scoreTeamB);


    }

    public void increaseBThree(View v)
    {
        TextView visitor = (TextView) findViewById(R.id.scorevisitors);
        scoreTeamB += 3;
        visitor.setText(""+scoreTeamB);


    }
}
