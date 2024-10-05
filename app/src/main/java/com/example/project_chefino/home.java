package com.example.project_chefino;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home); // Assuming your layout file is activity_home.xml

        // Initialize buttons
        Button breakfastButton = findViewById(R.id.button1);
        Button lunchButton = findViewById(R.id.button2);
        Button dinnerButton = findViewById(R.id.button3);
        Button dessertButton = findViewById(R.id.button4);

        // Set onClick listeners for each button
        breakfastButton.setOnClickListener(v -> {
            Intent intent = new Intent(home.this, breakfast1.class);
            startActivity(intent);
        });

        lunchButton.setOnClickListener(v -> {
            Intent intent = new Intent(home.this, lunch1.class);
            startActivity(intent);
        });

        dinnerButton.setOnClickListener(v -> {
            Intent intent = new Intent(home.this, dinner1.class);
            startActivity(intent);
        });

        dessertButton.setOnClickListener(v -> {
            Intent intent = new Intent(home.this, dessert1.class);
            startActivity(intent);
        });
    }
}
