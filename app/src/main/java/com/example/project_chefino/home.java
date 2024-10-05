package com.example.project_chefino;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home); // Assuming your layout file is named activity_main.xml

        // Buttons for Lunch, Breakfast, Dinner, and Dessert
        Button lunchButton = findViewById(R.id.button2);
        Button breakfastButton = findViewById(R.id.button1);
        Button dinnerButton = findViewById(R.id.button3);
        Button dessertButton = findViewById(R.id.button4);



        lunchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(home.this, lunch.class);
                startActivity(intent);

            }
        });


    }
}
