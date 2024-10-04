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

public class login extends AppCompatActivity {

    private EditText emailEditText, passwordEditText;
    private Button loginButton;
    private TextView signUpTextView, forgotPasswordTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        initializeUIElements();  // Initialize UI components
        setListeners();  // Set listeners for buttons and text views
    }

    // Initialize UI components
    private void initializeUIElements() {
        emailEditText = findViewById(R.id.editTextEmail2);
        passwordEditText = findViewById(R.id.editTextPassword2);
        loginButton = findViewById(R.id.login);
        signUpTextView = findViewById(R.id.signup);
        forgotPasswordTextView = findViewById(R.id.forgotpw);
    }

    // Set listeners for login, signup, and forgot password actions
    private void setListeners() {
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loginUser();
            }
        });

        signUpTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                redirectToSignUp();
            }
        });

        forgotPasswordTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                redirectToForgotPassword();
            }
        });
    }

    // Method to handle login action
    private void loginUser() {
        String email = emailEditText.getText().toString().trim();
        String password = passwordEditText.getText().toString().trim();

        if (TextUtils.isEmpty(email) || TextUtils.isEmpty(password)) {
            Toast.makeText(login.this, "Please enter both email and password", Toast.LENGTH_SHORT).show();
        } else {
            // Redirect to Home Page after successful login
            Intent intent = new Intent(login.this,home.class);
            startActivity(intent);
        }
    }

    // Method to redirect to Sign Up page
    private void redirectToSignUp() {
        Intent intent = new Intent(login.this,signup.class);
        startActivity(intent);
    }

    // Method to redirect to Forgot Password page
    private void redirectToForgotPassword() {
        Intent intent = new Intent(login.this, forgot.class);
        startActivity(intent);
    }
}