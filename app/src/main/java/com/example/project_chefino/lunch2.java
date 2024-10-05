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
    private LunchRecipeAdapter lunchRecipeAdapter;
    private List<LunchRecipe> recipeList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lunch2);

        lunchRecyclerView = findViewById(R.id.lunchRecyclerView);
        lunchRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Sample data - Replace with data from your database
        recipeList = new ArrayList<>();
        recipeList.add(new LunchRecipe("Chicken curry", "A delicious grilled cheese sandwich.", R.drawable.chicken_curry)); // Replace with your actual drawable resource
        recipeList.add(new LunchRecipe("Chicken Nasi Goreng", "Fresh Caesar salad with dressing.", R.drawable.chicken_nasi_goreng)); // Replace with your actual drawable resource
        recipeList.add(new LunchRecipe("Chicken Biryani", "Fresh Caesar salad with dressing.", R.drawable.chickenbiryani));
        recipeList.add(new LunchRecipe("Cholle Bhature", "Fresh Caesar salad with dressing.", R.drawable.cholle_bhature));
        recipeList.add(new LunchRecipe("Curd Rice", "Fresh Caesar salad with dressing.", R.drawable.curd_rice));
        recipeList.add(new LunchRecipe("Egg Curry", "Fresh Caesar salad with dressing.", R.drawable.egg_curry));
        recipeList.add(new LunchRecipe("Lemon Rice", "Fresh Caesar salad with dressing.", R.drawable.lemon_rice));
        recipeList.add(new LunchRecipe("Paneer Butter Masala", "Fresh Caesar salad with dressing.", R.drawable.paneer_butter_masala));
        recipeList.add(new LunchRecipe("Vegetable Biryani", "Fresh Caesar salad with dressing.", R.drawable.vegetable_biryani));
        recipeList.add(new LunchRecipe("Caesar Salad", "Fresh Caesar salad with dressing.", R.drawable.caesar_salad));


        lunchRecipeAdapter = new LunchRecipeAdapter(recipeList);
        lunchRecyclerView.setAdapter(lunchRecipeAdapter);
    }
}
