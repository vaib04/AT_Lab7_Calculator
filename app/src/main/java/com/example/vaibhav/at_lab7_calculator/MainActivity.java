package com.example.vaibhav.at_lab7_calculator;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bPlus,bMinus,bMul,bDiv,bEq,bDot,bCls;
    TextView mTextView;
    float num1,num2,res;
    String str;
    boolean dotFlag,plusFlag,minusFlag,mulFlag,divFlag;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dotFlag=true;
        plusFlag=false;
        minusFlag=false;
        mulFlag=false;
        divFlag=false;
        mTextView= (TextView) findViewById(R.id.textView);
        b1= (Button) findViewById(R.id.button1);
        b2= (Button) findViewById(R.id.button2);
        b3= (Button) findViewById(R.id.button3);
        b4= (Button) findViewById(R.id.button4);
        b5= (Button) findViewById(R.id.button5);
        b6= (Button) findViewById(R.id.button6);
        b7= (Button) findViewById(R.id.button7);
        b8= (Button) findViewById(R.id.button8);
        b9= (Button) findViewById(R.id.button9);
        b0= (Button) findViewById(R.id.buttonZero);
        bPlus= (Button) findViewById(R.id.buttonPlus);
        bMinus= (Button) findViewById(R.id.buttonMinus);
        bMul= (Button) findViewById(R.id.buttonMultiply);
        bDiv= (Button) findViewById(R.id.buttonDivide);
        bEq= (Button) findViewById(R.id.buttonEquals);
        bDot= (Button) findViewById(R.id.buttonDot);
        bCls= (Button) findViewById(R.id.buttonClear);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mTextView.setText(mTextView.getText()+"1");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mTextView.setText(mTextView.getText()+"2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mTextView.setText(mTextView.getText()+"3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mTextView.setText(mTextView.getText()+"4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mTextView.setText(mTextView.getText()+"5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mTextView.setText(mTextView.getText()+"6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mTextView.setText(mTextView.getText()+"7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mTextView.setText(mTextView.getText()+"8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mTextView.setText(mTextView.getText()+"9");
            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mTextView.setText(mTextView.getText()+"0");
            }
        });
        bDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(dotFlag){
                    mTextView.setText(mTextView.getText()+".");
                }
                dotFlag=false;
            }
        });
        bPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bMul.setEnabled(false);
                bMinus.setEnabled(false);
                bDiv.setEnabled(false);
                if(mTextView.getText().equals("")){
                    mTextView.setText("");
                }
                else {
                    num1=Float.parseFloat((String) mTextView.getText());
                    plusFlag=true;
                    mTextView.setText("");
                }
                dotFlag=true;

            }
        });
        bMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bMul.setEnabled(false);
                bPlus.setEnabled(false);
                bDiv.setEnabled(false);
                if(mTextView.getText().equals("")){
                    mTextView.setText("");
                }
                else {
                    num1=Float.parseFloat((String) mTextView.getText());
                    minusFlag=true;
                    mTextView.setText("");
                }
                dotFlag=true;
            }
        });
        bMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bPlus.setEnabled(false);
                bMinus.setEnabled(false);
                bDiv.setEnabled(false);
                if(mTextView.getText().equals("")){
                    mTextView.setText("");
                }
                else {
                    num1=Float.parseFloat((String) mTextView.getText());
                    mulFlag=true;
                    mTextView.setText("");
                }
                dotFlag=true;

            }
        });
        bDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bMul.setEnabled(false);
                bMinus.setEnabled(false);
                bPlus.setEnabled(false);
                if(mTextView.getText().equals("")){
                    mTextView.setText("");
                }
                else {
                    num1=Float.parseFloat((String) mTextView.getText());
                    divFlag=true;
                    mTextView.setText("");
                }
                dotFlag=true;
            }

        });
        bEq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num2 = Float.parseFloat((String) mTextView.getText());

                if (plusFlag){
                    res= num1+num2;
                    str=Float.toString(res);
                    mTextView.setText(str);
                    plusFlag=false;
                }


                if (minusFlag){
                    res= num1-num2;
                    str=Float.toString(res);
                    mTextView.setText(str);
                    minusFlag=false;
                }

                if (mulFlag){
                    res= num1*num2;
                    str=Float.toString(res);
                    mTextView.setText(str);
                    mulFlag=false;
                }

                if (divFlag){
                    if(num2==0) {
                        Toast.makeText(MainActivity.this, "Divide by zero error", Toast.LENGTH_SHORT).show();
                        mTextView.setText("");
                    }
                    else {
                        res= num1/num2;
                        str=Float.toString(res);
                        mTextView.setText(str);
                    }
                    divFlag=false;
                }
                enableAll();
            }
        });
        bCls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mTextView.setText("");
                num1=0;
                num2=0;
                dotFlag=true;
                plusFlag=false;
                minusFlag=false;
                mulFlag=false;
                divFlag=false;
                enableAll();
            }
        });
    }
    private void enableAll() {
        bMul.setEnabled(true);
        bMinus.setEnabled(true);
        bPlus.setEnabled(true);
        bDiv.setEnabled(true);
    }
}
