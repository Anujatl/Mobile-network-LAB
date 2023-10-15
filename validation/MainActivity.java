package com.example.validation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText name, age, email, password;
    Button bt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.name);
        age = findViewById(R.id.age);
        email = findViewById(R.id.mail);
        password = findViewById(R.id.pass);
        bt1 = findViewById(R.id.btn);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TextUtils.isEmpty(name.getText().toString())) {
                    name.setError("Name Required");
                } else if (!isValidAge(age.getText().toString())) {
                    age.setError("Invalid Required");
                } else if (!isValidEmail(email.getText().toString())) {
                    email.setError("Invalid Email");
                } else if (!isValidPassword(password.getText().toString())) {
                    password.setError("Invalid Password");
                } else {
                    Toast.makeText(MainActivity.this, "Successfully Login", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private boolean isValidEmail(String email) {
        String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
        return email.matches(emailPattern);
    }

    private boolean isValidPassword(String password) {
        // Password must be at least 8 characters and contain at least one special character
        return password.length() >= 8 && password.matches(".*[@#$%^&+=!].*");
    }
    private boolean isValidAge(String age){
        return age.length() == 2;
    }

}

