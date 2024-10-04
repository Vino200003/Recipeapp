package com.example.project_chefino;


import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class signup extends AppCompatActivity {

    private EditText emailEditText, passwordEditText, confirmPasswordEditText;
    private Button signUpButton;
    private TextView signInTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        // Initialize UI components
        emailEditText = findViewById(R.id.editTextEmail1);
        passwordEditText = findViewById(R.id.password1);
        confirmPasswordEditText = findViewById(R.id.password2);
        signUpButton = findViewById(R.id.signupsignup);
        signInTextView = findViewById(R.id.signin);

        // Set listener for the sign-up button
        signUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                registerUser();
            }
        });

        // Set listener for the sign-in text (if the user already has an account)
        signInTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Redirect to the Login page
                Intent intent = new Intent(signup.this, login.class);
                startActivity(intent);
            }
        });
    }

    // Method to register the user
    private void registerUser() {
        String email = emailEditText.getText().toString().trim();
        String password = passwordEditText.getText().toString().trim();
        String confirmPassword = confirmPasswordEditText.getText().toString().trim();

        if (TextUtils.isEmpty(email)) {
            Toast.makeText(signup.this, "Please enter your email", Toast.LENGTH_SHORT).show();
        } else if (TextUtils.isEmpty(password)) {
            Toast.makeText(signup.this, "Please enter your password", Toast.LENGTH_SHORT).show();
        } else if (!password.equals(confirmPassword)) {
            Toast.makeText(signup.this, "Passwords do not match", Toast.LENGTH_SHORT).show();
        } else {
            // If all fields are valid, redirect to the Home page
            Intent intent = new Intent(signup.this, home.class);
            startActivity(intent);
        }
    }
}