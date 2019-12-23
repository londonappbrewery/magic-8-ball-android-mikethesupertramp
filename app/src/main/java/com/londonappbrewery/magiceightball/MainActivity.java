package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private final int[] eightBallDrawables = {
            R.drawable.ball1,
            R.drawable.ball2,
            R.drawable.ball3,
            R.drawable.ball4,
            R.drawable.ball5
    };
    private ImageView eightBall;
    private Random random;

    public MainActivity() {
        random = new Random();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eightBall = findViewById(R.id.img_eight_ball);

        //Set random option initially
        int id = random.nextInt(eightBallDrawables.length);
        eightBall.setImageResource(eightBallDrawables[id]);

        eightBall.setOnClickListener(view -> {
            int option = random.nextInt(eightBallDrawables.length);
            eightBall.setImageResource(eightBallDrawables[option]);
        });
    }
}
