package com.example.menudriven;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class compound extends AppCompatActivity {
    EditText C_principle,C_interestrate,C_time;
    Button C_button;
    TextView C_result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compound);

        C_principle=findViewById(R.id.C_principle);
        C_interestrate=findViewById(R.id.C_interestrate);
        C_time=findViewById(R.id.C_time);
        C_button=findViewById(R.id.C_button);
        C_result=findViewById(R.id.C_result);

        C_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int p,r,t;
                p=Integer.parseInt(C_principle.getText().toString());
                r=Integer.parseInt(C_interestrate.getText().toString());
                t=Integer.parseInt(C_time.getText().toString());
                int res=(p*t*r)/100;
                C_result.setText("Result :" + res);

            }
        });
    }
}