package com.example.project_chefino;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class home extends AppCompatActivity {

    private ImageView homeButton;
    private ImageView searchButton;
    private ImageView bookmarkButton;
    private ImageView profileButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        // Handle window insets for edge-to-edge display
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Initialize buttons
        Button breakfastButton = findViewById(R.id.button1);
        Button lunchButton = findViewById(R.id.button2);
        Button dinnerButton = findViewById(R.id.button3);
        Button dessertButton = findViewById(R.id.button4);

        // Set onClick listeners for each button
        breakfastButton.setOnClickListener(v -> {
            Intent intent = new Intent(home.this, breakfast.class);
            startActivity(intent);
        });



        dinnerButton.setOnClickListener(v -> {
            Intent intent = new Intent(home.this, dinner.class);
            startActivity(intent);
        });

        dessertButton.setOnClickListener(v -> {
            Intent intent = new Intent(home.this, dessert.class);
            startActivity(intent);
        });

        // Initialize navigation buttons (for bottom navigation or other purposes)
        homeButton = findViewById(R.id.imageview10);
        searchButton = findViewById(R.id.imageView11);
        bookmarkButton = findViewById(R.id.imageView12);
        profileButton = findViewById(R.id.imageView13);

        homeButton.setOnClickListener(v -> {
            // Home button already in home, no intent needed
        });

        searchButton.setOnClickListener(v -> {
            Intent intent = new Intent(home.this, search.class);
            startActivity(intent);
        });

        bookmarkButton.setOnClickListener(v -> {
            Intent intent = new Intent(home.this, save.class);
            startActivity(intent);
        });

        profileButton.setOnClickListener(v -> {
            Intent intent = new Intent(home.this, profile.class);
            startActivity(intent);
        });

        // Initialize Floating Action Button (FAB)
        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(view -> {
            Intent intent = new Intent(home.this, addrecipe.class);
            startActivity(intent);
        });
    }
}