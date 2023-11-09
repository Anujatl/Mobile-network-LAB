package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtview,hightxt;
    Button percent,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btndot,btnc,bspace,btnadd,btnmul,btndiv,btnsub,btneq;
    float f1,f2,res;
    boolean add,sub,mul,div,per;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtview=findViewById(R.id.txtview);
//      resultview=findViewById(R.id.resultview);
        hightxt=findViewById(R.id.hightxt);

        percent=findViewById(R.id.percent);
        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        btn4=findViewById(R.id.btn4);
        btn5=findViewById(R.id.btn5);
        btn6=findViewById(R.id.btn6);
        btn7=findViewById(R.id.btn7);
        btn8=findViewById(R.id.btn8);
        btn9=findViewById(R.id.btn9);
        btn0=findViewById(R.id.btn0);
        btndot=findViewById(R.id.btndot);
        btnc=findViewById(R.id.btnc);
        bspace=findViewById(R.id.bspace);
        btnadd=findViewById(R.id.btnadd);
        btnmul=findViewById(R.id.btnmul);
        btndiv=findViewById(R.id.btndiv);
        btnsub=findViewById(R.id.btnsub);
        btneq=findViewById(R.id.btneq);

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtview.setText(txtview.getText()+"0");
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtview.setText(txtview.getText()+"1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtview.setText(txtview.getText()+"2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtview.setText(txtview.getText()+"3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtview.setText(txtview.getText()+"4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtview.setText(txtview.getText()+"5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtview.setText(txtview.getText()+"6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtview.setText(txtview.getText()+"7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtview.setText(txtview.getText()+"8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtview.setText(txtview.getText()+"9");
            }
        });
        btndot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtview.setText(txtview.getText()+".");
            }
        });
        btnc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtview.setText(" ");
                hightxt.setText(" ");
            }
        });

        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                f1=Float.parseFloat(txtview.getText().toString());
                txtview.setText(" ");
                hightxt.setText(String.valueOf(f1+"+"));
                add=true;
            }
        });
        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                f1=Float.parseFloat(txtview.getText().toString());
                txtview.setText(" ");
                hightxt.setText(String.valueOf(f1+"-"));
                sub=true;
            }
        });
        btnmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                f1=Float.parseFloat(txtview.getText().toString());
                txtview.setText(" ");
                hightxt.setText(String.valueOf(f1+"x"));
                mul=true;
            }
        });
        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                f1=Float.parseFloat(txtview.getText().toString());
                txtview.setText(" ");
                hightxt.setText(String.valueOf(f1+"/"));
                div=true;
            }
        });
        percent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                f1=Float.parseFloat(txtview.getText().toString());
                txtview.setText(" ");
                hightxt.setText(String.valueOf(f1+"%"));
                per=true;
            }
        });
        btneq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(add==true){
                    f2=Float.parseFloat(txtview.getText().toString());
                    res=f1+f2;
                    String data=String.valueOf(res);
                    hightxt.setText(f1+"+"+f2+"=");
                    txtview.setText(data);
                    add=false;
                }
                else if(sub==true){
                    f2=Float.parseFloat(txtview.getText().toString());
                    res=f1-f2;
                    String data=String.valueOf(res);
                    hightxt.setText(f1+"-"+f2+"=");
                    txtview.setText(data);
                    sub=false;
                }
                else if(mul==true){
                    f2=Float.parseFloat(txtview.getText().toString());
                    res=f1*f2;
                    String data=String.valueOf(res);
                    hightxt.setText(f1+"x"+f2+"=");
                    txtview.setText(data);
                    mul=false;
                }
                else if(div==true){
                    f2=Float.parseFloat(txtview.getText().toString());
                    res=f1/f2;
                    String data=String.valueOf(res);
                    hightxt.setText(f1+"/"+f2+"=");
                    txtview.setText(data);
                    div=false;
                }
                else if(per==true){
                    f2=Float.parseFloat(txtview.getText().toString());
                    res=f1%f2;
                    String data=String.valueOf(res);
                    hightxt.setText(f1+"%"+f2+"=");
                    txtview.setText(data);
                    per=false;
                }
            }
        });



    }

}
