package com.example.mediguard;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SignUpActivity extends AppCompatActivity {

    private EditText fullNameEditText, passwordEditText, emailEditText, mobileNumberEditText, dobEditText;
    private Button signUpButton;
    private TextView loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        fullNameEditText = findViewById(R.id.fullNameEditText);
        passwordEditText = findViewById(R.id.passwordEditText);
        emailEditText = findViewById(R.id.emailEditText);
        mobileNumberEditText = findViewById(R.id.mobileNumberEditText);
        dobEditText = findViewById(R.id.dobEditText);
        signUpButton = findViewById(R.id.signUpButton);
        loginButton = findViewById(R.id.loginButton);

        signUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fullName = fullNameEditText.getText().toString();
                String password = passwordEditText.getText().toString();
                String email = emailEditText.getText().toString();
                String mobileNumber = mobileNumberEditText.getText().toString();
                String dob = dobEditText.getText().toString();

                if (fullName.isEmpty() || password.isEmpty() || email.isEmpty() || mobileNumber.isEmpty() || dob.isEmpty()) {
                    Toast.makeText(SignUpActivity.this, "Please fill all fields", Toast.LENGTH_SHORT).show();
                } else {
                    // Perform sign up logic here
                }
            }
        });

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to your login activity
                startActivity(new Intent(SignUpActivity.this, LoginActivity.class));
            }
        });
    }
}
