package com.example.sharedpreference;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.wifi.hotspot2.pps.HomeSp;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.sharedpreference.R;

public class MainActivity extends AppCompatActivity {

    EditText i, p;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        i = findViewById(R.id.id);
        p = findViewById(R.id.pass);
        btn = findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(i.getText().toString().isEmpty() )
                {
                    i.setError("id cannot be empty");
                    p.setError("Password cannot be empty");
                }
                else
                {
                    String name =  i.getText().toString();

                    Intent k = new Intent(MainActivity.this, Home.class);
                    k.putExtra("uname",name);
                    startActivity(k);


                }
            }
        });
    }
}

