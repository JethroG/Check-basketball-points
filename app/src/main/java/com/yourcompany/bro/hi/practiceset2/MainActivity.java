package com.yourcompany.bro.hi.practiceset2;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    int fTeamBallsNumber=0;
    int sTeamBallsNumber=0;
    TextView firstTeamBalls,secondTeamBalls;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Balls Points");
        Button fTeamTwo = findViewById(R.id.fTeamTwo);
        Button fTeamThree = findViewById(R.id.fTeamThree);
        Button fTeamFree = findViewById(R.id.fTeamFree);
        Button sTeamTwo = findViewById(R.id.sTeamTwo);
        Button sTeamThree= findViewById(R.id.sTeamThree);
        Button sTeamFree = findViewById(R.id.sTeamFree);
        firstTeamBalls = findViewById(R.id.firstTeamBalls);
        secondTeamBalls = findViewById(R.id.secondTeamBalls);
        fTeamTwo.setOnClickListener(this);
        fTeamThree.setOnClickListener(this);
        fTeamFree.setOnClickListener(this);
        sTeamTwo.setOnClickListener(this);
        sTeamThree.setOnClickListener(this);
        sTeamFree.setOnClickListener(this);

    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onClick(View view) {
        String textPoints = null;

        switch (view.getId()) {
            case R.id.fTeamTwo:
              fTeamBallsNumber= fTeamBallsNumber+2;
              textPoints= "+2 Points";
                break;
            case R.id.fTeamThree:
                fTeamBallsNumber= fTeamBallsNumber+3;
                textPoints= "+3 Points";
                break;
            case R.id.fTeamFree:
                fTeamBallsNumber= fTeamBallsNumber+1;
                textPoints= "+1 Points";
                break;

            case R.id.sTeamTwo:
                sTeamBallsNumber = sTeamBallsNumber +2;
                textPoints= "+2 Points";
                break;
            case R.id.sTeamThree:
                sTeamBallsNumber = sTeamBallsNumber +3;
                textPoints= "+3 Points";
                break;
            case R.id.sTeamFree:
                sTeamBallsNumber = sTeamBallsNumber +1;
                textPoints= "+1 Points";
                break;



        }
        @SuppressLint("ShowToast") Toast toast1= Toast.makeText(getApplicationContext(),textPoints, Toast.LENGTH_SHORT);
        toast1.show();
        firstTeamBalls.setText(fTeamBallsNumber + " Points");
        secondTeamBalls.setText(sTeamBallsNumber + " Points");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    @SuppressLint("SetTextI18n")
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_favorite:
                sTeamBallsNumber=0;
                fTeamBallsNumber=0;
                firstTeamBalls.setText(fTeamBallsNumber + " Points");
                secondTeamBalls.setText(sTeamBallsNumber + " Points");
                @SuppressLint("ShowToast") Toast toast= Toast.makeText(getApplicationContext(),"All points clean", Toast.LENGTH_SHORT);
                toast.show();
                return true;

            default:
                // If we got here, the user's action was not recognized.
                // Invoke the superclass to handle it.
                return super.onOptionsItemSelected(item);

        }
    }
}
