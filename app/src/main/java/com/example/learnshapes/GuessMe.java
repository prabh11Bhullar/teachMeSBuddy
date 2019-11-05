package com.example.learnshapes;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class GuessMe extends AppCompatActivity {

    // MARK: Debug info
    private final String TAG = "LEARN_SHAPES";

    // MARK: Particle Account Info
    private final String PARTICLE_USERNAME = "kaur6363satwinder@gmail.com";
    private final String PARTICLE_PASSWORD = "satprabh1991";

    // MARK: Particle device-specific info
    private final String DEVICE_ID = "380022000f47363333343437";

    // MARK: Particle Publish / Subscribe variables
    private long subscriptionId;

    // MARK: Particle device
    private ParticleDevive mDevice;

    TextView chooseTheAnswer, choice1, choice2, choice3,result;
    ImageView shapes;
    String imageGenerated, choiceFromParticle;
    LinearLayout layout2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guess_me);

        chooseTheAnswer = findViewById(R.id.chooseTheAnswer);
        shapes = findViewById(R.id.shapes);
        result = findViewById(R.id.result);
        choice1 = findViewById(R.id.choice1);
        choice2 = findViewById(R.id.choice2);
        choice3 = findViewById(R.id.choice3);
        layout2 = findViewById(R.id.layout2);

        displayShapes();

        //1. Initialize your connection to the Particle API
        ParticleCloudSDK.init(this.getApplicationContext());

        // 2. Setup your device variable
        getDeviceFromCloud();

    }
    public void getDeviceFromCloud() {
        {

        }
    }
    public void displayShapes() {
        int rndInt = (Math.random() < 0.5) ? 1 : 2;
        imageGenerated = "shape" + rndInt;
        int resID = getResources().getIdentifier(imageGenerated, "drawable", getPackageName());
        shapes.setImageResource(resID);
    }



}

