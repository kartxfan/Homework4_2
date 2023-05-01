package com.example.homework4_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    // Наша кнопка
    private Button buttonGetMyDogActivity;
    private Button buttonGetMyFishActivity;

    // Наш слушатель для кнопки
    private View.OnClickListener Fishlistener = view -> {
        Intent myFishIntent = new Intent(getApplicationContext(), MyFishActivity.class);
        startActivity(myFishIntent);
    };
    private View.OnClickListener Doglistener = view -> {
        Intent myDogIntent = new Intent(getApplicationContext(), MyDogActivity.class);
        startActivity(myDogIntent);
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonGetMyDogActivity = findViewById(R.id.buttonMyDog);
        buttonGetMyDogActivity.setOnClickListener(Doglistener);

        buttonGetMyFishActivity = findViewById(R.id.buttonMyFish);
        buttonGetMyFishActivity.setOnClickListener(Fishlistener);
    }

}