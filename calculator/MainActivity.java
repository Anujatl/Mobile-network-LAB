package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.calculator.R;

public class MainActivity extends AppCompatActivity {
    EditText t1,t2,t3;
    Button bb1,bb2,bb3,bb4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1 = (EditText) findViewById(R.id.et1);
        t2 = (EditText) findViewById(R.id.et2);
        t3 = (EditText) findViewById(R.id.et3);
        bb1 = (Button) findViewById(R.id.b1);
        bb2 = (Button) findViewById(R.id.b2);
        bb3 = (Button) findViewById(R.id.b3);
        bb4 = (Button) findViewById(R.id.b4);
        bb1.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View view) {
                                       int n1 = Integer.parseInt(t1.getText().toString());
                                       int n2 = Integer.parseInt(t2.getText().toString());
                                       int n3 = n1 + n2;
                                       String n4 = String.valueOf(n3);
                                       t3.setText(n4);
                                   }
                               }
        );
        bb2.setOnClickListener(new View.OnClickListener(){
                                   @Override
                                   public void onClick(View view) {
                                       int n1=Integer.parseInt(t1.getText().toString());
                                       int n2=Integer.parseInt(t2.getText().toString());
                                       int n3=n1-n2;
                                       String n4=String.valueOf(n3);
                                       t3.setText(n4);
                                   }
                               }
        );
        bb3.setOnClickListener(new View.OnClickListener(){
                                   @Override
                                   public void onClick(View view) {
                                       int n1=Integer.parseInt(t1.getText().toString());
                                       int n2=Integer.parseInt(t2.getText().toString());
                                       int n3=n1*n2;
                                       String n4=String.valueOf(n3);
                                       t3.setText(n4);
                                   }
                               }
        );
        bb4.setOnClickListener(new View.OnClickListener(){
                                   @Override
                                   public void onClick(View view) {
                                       float n1=Integer.parseInt(t1.getText().toString());
                                       float n2=Integer.parseInt(t2.getText().toString());
                                       float n3=n1/n2;
                                       String n4=String.valueOf(n3);
                                       t3.setText(n4);
                                   }
                               }
        );
    }
}