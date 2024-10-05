package com.example.project_chefino;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

<<<<<<<< HEAD:app/src/main/java/com/example/project_chefino/item_recipe.java
public class item_recipe extends AppCompatActivity {
========
public class dinner1 extends AppCompatActivity {
>>>>>>>> 2158bef2d26e45901ee3da4a668ad3f5f8ab3963:app/src/main/java/com/example/project_chefino/dinner1.java

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
<<<<<<<< HEAD:app/src/main/java/com/example/project_chefino/item_recipe.java
        setContentView(R.layout.activity_item_recipe);
========
        setContentView(R.layout.activity_dinner1);
>>>>>>>> 2158bef2d26e45901ee3da4a668ad3f5f8ab3963:app/src/main/java/com/example/project_chefino/dinner1.java
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}