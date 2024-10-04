package com.example.project_chefino;

import android.content.Intent;
import android.os.Bundle;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.view.View;
import android.widget.ImageView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class lunch extends AppCompatActivity {

    private ImageView homeButton;
    private ImageView searchButton;
    private ImageView bookmarkButton;
    private ImageView profileButton;
    private FloatingActionButton fabAdd;
    private FloatingActionButton fabBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_lunch);

        // Initialize buttons
        homeButton = findViewById(R.id.imageView6);
        searchButton = findViewById(R.id.imageView7);
        bookmarkButton = findViewById(R.id.imageView9);
        profileButton = findViewById(R.id.imageView10);

        // Set click listeners for navigation buttons
        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(lunch.this, home.class);
                startActivity(intent);
            }
        });

        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(lunch.this, search.class);
                startActivity(intent);
            }
        });

        bookmarkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(lunch.this, save.class);
                startActivity(intent);
            }
        });

        profileButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(lunch.this, profile.class);
                startActivity(intent);
            }
        });

        // Initialize Floating Action Button for adding
        fabAdd = findViewById(R.id.fab);
        fabAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(lunch.this, addrecipe.class);
                startActivity(intent);
            }
        });

        // Initialize Floating Action Button for back navigation
        fabBack = findViewById(R.id.back);
        fabBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Navigate back to Home activity
                Intent intent = new Intent(lunch.this, home.class);
                startActivity(intent);
                finish(); // Optional: finish the current activity
            }
        });

        // Handle window insets for edge-to-edge display
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}