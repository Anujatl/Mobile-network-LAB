package com.example.imgtoggle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.imgtoggle.R;

public class MainActivity extends AppCompatActivity {
    ImageView  img1,img2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img1=findViewById(R.id.imageView);
        img2=findViewById(R.id.imageView2);

        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                img1.setVisibility(view.GONE);
                img2.setVisibility(view.VISIBLE);
            }
        });

        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                img1.setVisibility(view.VISIBLE);
                img2.setVisibility(view.GONE);
            }
        });
    }
}
