package com.social.chaudhary.darwinlabs;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class SendActivity extends AppCompatActivity implements View.OnClickListener{

    EditText et_ammount;
    TextView tv_usammount;
    double inr_ammount;
    Button one,two,three,four,five,six,seven,eight,nine,zero,dot,backspace;
    int option;
    String str;
    ImageView iv_forword,backicon;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send);
        et_ammount=(EditText)findViewById(R.id.et_ammount);
        tv_usammount=(TextView)findViewById(R.id.tv_usammount1);
        one=(Button)findViewById(R.id.digit1);
        two=(Button)findViewById(R.id.digit2);
        three=(Button)findViewById(R.id.digit3);
        four=(Button)findViewById(R.id.digit4);
        five=(Button)findViewById(R.id.digit5);
        six=(Button)findViewById(R.id.digit6);
        seven=(Button)findViewById(R.id.digit7);
        eight=(Button)findViewById(R.id.digit8);
        nine=(Button)findViewById(R.id.digit9);
        zero=(Button)findViewById(R.id.digit0);
        dot=(Button)findViewById(R.id.digitdot);
        backspace=(Button)findViewById(R.id.digitbackspace);
        iv_forword=(ImageView)findViewById(R.id.iv_forword);
        backicon=(ImageView)findViewById(R.id.iv_back);


        one.setOnClickListener(this);
        two.setOnClickListener(this);
        three.setOnClickListener(this);
        four.setOnClickListener(this);
        five.setOnClickListener(this);
        six.setOnClickListener(this);
        seven.setOnClickListener(this);
        eight.setOnClickListener(this);
        nine.setOnClickListener(this);
        zero.setOnClickListener(this);
        dot.setOnClickListener(this);
        backspace.setOnClickListener(this);
        iv_forword.setOnClickListener(this);

        backicon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(SendActivity.this,MainActivity.class);
                startActivity(in);
            }
        });

        et_ammount.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(count>0) {
                    inr_ammount = Double.parseDouble(s.toString());
                    Toast.makeText(SendActivity.this, "value="+inr_ammount, Toast.LENGTH_SHORT).show();
                    double dolervalue = inr_ammount * 0.015152;
                    tv_usammount.setText("" + dolervalue);
                }
                else
                {
                    tv_usammount.setText("0.0");
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    @Override
    public void onClick(View v) {
        Editable str =  et_ammount.getText();
        switch(v.getId())
        {
            case R.id.digit1:
                if(option!=0)
                {
                    option = 0;
                    et_ammount.setText("");
                }
                str = str.append(one.getText());
                et_ammount.setText(str);
                break;

            case R.id.digit2:
                if(option!=0)
                {
                    option = 0;
                    et_ammount.setText("");
                }
                str = str.append(two.getText());
                et_ammount.setText(str);
                break;

            case R.id.digit3:
                if(option!=0)
                {
                    option = 0;
                    et_ammount.setText("");
                }
                str = str.append(three.getText());
                et_ammount.setText(str);
                break;

            case R.id.digit4:
                if(option!=0)
                {
                    option = 0;
                    et_ammount.setText("");
                }
                str = str.append(four.getText());
                et_ammount.setText(str);
                break;

            case R.id.digit5:
                if(option!=0)
                {
                    option = 0;
                    et_ammount.setText("");
                }
                str = str.append(five.getText());
                et_ammount.setText(str);
                break;

            case R.id.digit6:
                if(option!=0)
                {
                    option = 0;
                    et_ammount.setText("");
                }
                str = str.append(six.getText());
                et_ammount.setText(str);
                break;

            case R.id.digit7:
                if(option!=0)
                {
                    option = 0;
                    et_ammount.setText("");
                }
                str = str.append(seven.getText());
                et_ammount.setText(str);
                break;

            case R.id.digit8:
                if(option!=0)
                {
                    option = 0;
                    et_ammount.setText("");
                }
                str = str.append(eight.getText());
                et_ammount.setText(str);
                break;

            case R.id.digit9:
                if(option!=0)
                {
                    option = 0;
                    et_ammount.setText("");
                }
                str = str.append(nine.getText());
                et_ammount.setText(str);
                break;

            case R.id.digit0:
                if(option!=0)
                {
                    option = 0;
                    et_ammount.setText("");
                }
                str = str.append(zero.getText());
                et_ammount.setText(str);
                break;

            case R.id.digitdot:
                if(option!=0)
                {
                    option = 0;
                    et_ammount.setText("");
                }
                str = str.append(dot.getText());
                et_ammount.setText(str);
                break;

            case R.id.digitbackspace:
                int length = et_ammount.getText().length();
                if (length > 0) {
                    et_ammount.getText().delete(length - 1, length);
                }
                break;

            case R.id.iv_forword:
                Intent i=new Intent(this,EnterpinActivity.class);
                startActivity(i);
                break;
        }
    }
}
