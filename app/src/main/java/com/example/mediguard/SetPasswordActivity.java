package com.example.mediguard;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SetPasswordActivity extends AppCompatActivity {

    private EditText passwordEditText, confirmPasswordEditText;
    private Button createPasswordButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_password);

        passwordEditText = findViewById(R.id.passwordEditText);
        confirmPasswordEditText = findViewById(R.id.confirmPasswordEditText);
        createPasswordButton = findViewById(R.id.createPasswordButton);

        createPasswordButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String password = passwordEditText.getText().toString();
                String confirmPassword = confirmPasswordEditText.getText().toString();

                if (password.isEmpty() || confirmPassword.isEmpty()) {
                    Toast.makeText(SetPasswordActivity.this, "Please fill all fields", Toast.LENGTH_SHORT).show();
                } else if (!password.equals(confirmPassword)) {
                    Toast.makeText(SetPasswordActivity.this, "Passwords do not match", Toast.LENGTH_SHORT).show();
                } else {
                    // Proceed to the next step, e.g., navigate to the login screen or main activity
                    startActivity(new Intent(SetPasswordActivity.this, LoginActivity.class));
                }
            }
        });
    }
}
