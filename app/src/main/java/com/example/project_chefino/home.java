package com.example.project_chefino;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class home extends AppCompatActivity {

    private ImageView profileButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home); // Assuming your layout file is activity_home.xml

        // Initialize buttons
        Button breakfastButton = findViewById(R.id.button1);
        Button lunchButton = findViewById(R.id.button2);
        profileButton = findViewById(R.id.imageView13);

        // Set onClick listeners for each button
        breakfastButton.setOnClickListener(v -> {
            Intent intent = new Intent(home.this, breakfast1.class);
            startActivity(intent);
        });

        lunchButton.setOnClickListener(v -> {
            Intent intent = new Intent(home.this, lunch1.class);
            startActivity(intent);
        });

        profileButton.setOnClickListener(v -> {
            Intent intent = new Intent(home.this, profile1.class);
            startActivity(intent);
        });
    }
}
