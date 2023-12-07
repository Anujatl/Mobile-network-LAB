package com.example.menudriven;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class simple extends AppCompatActivity {
    EditText principle,interestrate,time;
    Button button;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple);

        principle=findViewById(R.id.principle);
        interestrate=findViewById(R.id.interestrate);
        time=findViewById(R.id.time);
        button=findViewById(R.id.button);
        result=findViewById(R.id.result);



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int p,r,t;
                p=Integer.parseInt(principle.getText().toString());
                r=Integer.parseInt(interestrate.getText().toString());
                t=Integer.parseInt(time.getText().toString());
                int res=p*(1+ (r*t));
                result.setText("Result :" + res);

            }
        });
    }
}