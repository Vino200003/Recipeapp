package com.example.project_chefino;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

// Recipe model class
class Recipe {
    private String recipeId;
    private String name;
    private String category;
    private String ingredients;
    private String description;

    // Required empty constructor for Firebase
    public Recipe() {
    }

    public Recipe(String recipeId, String name, String category, String ingredients, String description) {
        this.recipeId = recipeId;
        this.name = name;
        this.category = category;
        this.ingredients = ingredients;
        this.description = description;
    }

    // Getters and setters
    public String getRecipeId() {
        return recipeId;
    }

    public void setRecipeId(String recipeId) {
        this.recipeId = recipeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

// Main Activity for adding a recipe
public class addrecipe1 extends AppCompatActivity {

    private EditText nameInput, categoryInput, ingredientsInput, descriptionInput;
    private Button addButton;

    // Firebase reference
    private FirebaseDatabase firebaseDatabase;
    private DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addrecipe1);

        // Initialize Firebase
        firebaseDatabase = FirebaseDatabase.getInstance();
        databaseReference = firebaseDatabase.getReference("Recipes");

        // Link UI elements to Java code
        nameInput = findViewById(R.id.textInput1);
        categoryInput = findViewById(R.id.textInput2);
        ingredientsInput = findViewById(R.id.textInput3);
        descriptionInput = findViewById(R.id.textInput4);
        addButton = findViewById(R.id.btn_add);

        // Set the add button click listener
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addRecipeToFirebase();
            }
        });
    }

    private void addRecipeToFirebase() {
        // Get the input from the EditText fields
        String name = nameInput.getText().toString();
        String category = categoryInput.getText().toString();
        String ingredients = ingredientsInput.getText().toString();
        String description = descriptionInput.getText().toString();

        // Validate that none of the fields are empty
        if (name.isEmpty() || category.isEmpty() || ingredients.isEmpty() || description.isEmpty()) {
            Toast.makeText(addrecipe1.this, "Please fill all the fields", Toast.LENGTH_SHORT).show();
            return;
        }

        // Create a unique key for each recipe entry
        String recipeId = databaseReference.push().getKey();

        // Create a Recipe object
        Recipe recipe = new Recipe(recipeId, name, category, ingredients, description);

        // Save to Firebase
        databaseReference.child(recipeId).setValue(recipe)
                .addOnCompleteListener(task -> {
                    if (task.isSuccessful()) {
                        Toast.makeText(addrecipe1.this, "Recipe added successfully", Toast.LENGTH_SHORT).show();
                        // Optionally clear the fields after submission
                        nameInput.setText("");
                        categoryInput.setText("");
                        ingredientsInput.setText("");
                        descriptionInput.setText("");
                    } else {
                        Toast.makeText(addrecipe1.this, "Failed to add recipe", Toast.LENGTH_SHORT).show();
                    }
                });
    }
}
