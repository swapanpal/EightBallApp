package com.example.swapan.eightballapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // casting imageView and Button
        Button askButton = findViewById(R.id.ask_button);
        final ImageView eightBallImage = findViewById(R.id.eight_ball_image);
        // Array list for eight ball image
        final int[] eightBallArray = {
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5
        };

        askButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //make a random number generator
                Random randomNumberGenerator = new Random();
                // store the random number here
                int number = randomNumberGenerator.nextInt(5);
                // set eight ball image to image view randomley
                eightBallImage.setImageResource(eightBallArray[number]);
            }
        });
    }
}
