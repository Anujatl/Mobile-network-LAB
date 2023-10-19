package com.example.krish;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText i,a, p;
    Button btn;

    // SharedPreferences file name
    private static final String PREF_NAME = "MyPrefs";
    // Key to store user ID in SharedPreferences
    private static final String PREF_USER_ID = "UserId";

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        i = findViewById(R.id.name);
        a = findViewById(R.id.age);
        p = findViewById(R.id.pass);
        btn = findViewById(R.id.button);

        // Load the user ID from SharedPreferences
        SharedPreferences sharedPreferences = getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
        String savedUserId = sharedPreferences.getString(PREF_USER_ID, "");
        SharedPreferences sharedPreferences1 = getSharedPreferences(PREF_NAME,Context.MODE_PRIVATE);

        String savedAge = sharedPreferences1.getString(PREF_NAME,"");

        // Set the user ID in the EditText if it's available
        i.setText(savedUserId);
        a.setText(savedAge);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String enteredId = i.getText().toString();
                String enteredAge = a.getText().toString();
                String password = p.getText().toString();

                if (enteredId.isEmpty() || password.isEmpty()) {
                    i.setError("ID cannot be empty");
                    p.setError("Password cannot be empty");
                } else {
                    // Save the user ID in SharedPreferences
                    SharedPreferences.Editor editor = sharedPreferences.edit();
                    editor.putString(PREF_USER_ID, enteredId);
                    editor.putString(PREF_NAME,enteredAge);
                    editor.apply();

                    Intent k = new Intent(MainActivity.this, Home.class);
                    k.putExtra("uname", enteredId);
                    k.putExtra("uname", enteredAge);
                    startActivity(k);
                }
            }
        });
    }
}
