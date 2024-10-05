package com.example.project_chefino;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class home extends AppCompatActivity {

    Button breakfastButton, lunchButton, dinnerButton, dessertButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        // Initialize buttons
        breakfastButton = findViewById(R.id.button1);
        lunchButton = findViewById(R.id.button2);
        dinnerButton = findViewById(R.id.button3);
        dessertButton = findViewById(R.id.button4);

        // Set click listeners for each button
        breakfastButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to Breakfast page
                Intent intent = new Intent(home.this, breakfast.class);
                startActivity(intent);
            }
        });

        lunchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to Lunch page
                Intent intent = new Intent(home.this, lunch.class);
                startActivity(intent);
            }
        });

        dinnerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to Dinner page
                Intent intent = new Intent(home.this, dinner.class);
                startActivity(intent);
            }
        });

        dessertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to Dessert page
                Intent intent = new Intent(home.this, dessert.class);
                startActivity(intent);
            }
        });
    }
}
