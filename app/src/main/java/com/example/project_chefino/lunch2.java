package com.example.project_chefino;

// LunchActivity.java
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class lunch2 extends AppCompatActivity {

    private RecyclerView lunchRecyclerView;
    private RecipeAdapter lunchRecipeAdapter;
    private List<Recipe> recipeList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lunch2);

        lunchRecyclerView = findViewById(R.id.lunchRecyclerView);
        lunchRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Sample data - Replace with data from your database
        recipeList = new ArrayList<>();
        recipeList.add(new Recipe("Grilled Cheese Sandwich", "A delicious grilled cheese sandwich.", R.drawable.grilled_cheese)); // Replace with your actual drawable resource
        recipeList.add(new Recipe("Caesar Salad", "Fresh Caesar salad with dressing.", R.drawable.caesar_salad)); // Replace with your actual drawable resource



        lunchRecipeAdapter = new RecipeAdapter(recipeList);
        lunchRecyclerView.setAdapter(lunchRecipeAdapter);
    }
}
