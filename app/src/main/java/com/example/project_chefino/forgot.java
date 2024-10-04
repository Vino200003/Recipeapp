package com.example.project_chefino;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class forgot extends AppCompatActivity {

    EditText emailOrPhone;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot); // Set your XML layout here

        emailOrPhone = findViewById(R.id.emailorphone);
        submit = findViewById(R.id.submit2);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input = emailOrPhone.getText().toString().trim();
                if (input.isEmpty()) {
                    Toast.makeText(forgot.this, "Please enter your email or phone number", Toast.LENGTH_SHORT).show();
                } else {
                    // Assume sending OTP logic here
                    Toast.makeText(forgot.this, "OTP sent to " + input, Toast.LENGTH_SHORT).show();
                    // Redirect to OTP page
                    Intent intent = new Intent(forgot.this, otp.class);
                    startActivity(intent);
                }
            }
        });
    }
}
