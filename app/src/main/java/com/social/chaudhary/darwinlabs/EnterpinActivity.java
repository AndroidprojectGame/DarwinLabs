package com.social.chaudhary.darwinlabs;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class EnterpinActivity extends AppCompatActivity implements View.OnClickListener{

    Button one,two,three,four,five,six,seven,eight,nine,zero,dot,backspace;
    int option;
    int passlen = 0;
    Drawable mDrawableElipseChecked,unchecked;
    EditText txtPass;
    View elipse1,elipse2,elipse3,elipse4;
    ImageView iv_forword,backicon;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enterpin);

        mDrawableElipseChecked = this.getResources().getDrawable(R.drawable.ellipse_checked);
        unchecked = this.getResources().getDrawable(R.drawable.ellipse_unchecked);
        elipse1 = findViewById(R.id.elipse1);
        elipse2 = findViewById(R.id.elipse2);
        elipse3 = findViewById(R.id.elipse3);
        elipse4 = findViewById(R.id.elipse4);
        txtPass = (EditText) findViewById(R.id.txtPass);
        backicon=(ImageView)findViewById(R.id.iv_back);

        backicon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(EnterpinActivity.this,MainActivity.class);
                startActivity(i);
            }
        });


        txtPass.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                passlen = s.length();
                if (passlen == 1) {
                    elipse1.setBackground(mDrawableElipseChecked);
                } else if (passlen == 2)
                    elipse2.setBackground(mDrawableElipseChecked);
                else if (passlen == 3)
                    elipse3.setBackground(mDrawableElipseChecked);
                else if (passlen == 4)
                    elipse4.setBackground(mDrawableElipseChecked);
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

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
    }

    @Override
    public void onClick(View v) {
        Editable str =  txtPass.getText();
        switch(v.getId())
        {
            case R.id.digit1:
                if(option!=0)
                {
                    option = 0;
                    txtPass.setText("");
                }
                str = str.append(one.getText());
                txtPass.setText(str);
                break;

            case R.id.digit2:
                if(option!=0)
                {
                    option = 0;
                    txtPass.setText("");
                }
                str = str.append(two.getText());
                txtPass.setText(str);
                break;

            case R.id.digit3:
                if(option!=0)
                {
                    option = 0;
                    txtPass.setText("");
                }
                str = str.append(three.getText());
                txtPass.setText(str);
                break;

            case R.id.digit4:
                if(option!=0)
                {
                    option = 0;
                    txtPass.setText("");
                }
                str = str.append(four.getText());
                txtPass.setText(str);
                break;

            case R.id.digit5:
                if(option!=0)
                {
                    option = 0;
                    txtPass.setText("");
                }
                str = str.append(five.getText());
                txtPass.setText(str);
                break;

            case R.id.digit6:
                if(option!=0)
                {
                    option = 0;
                    txtPass.setText("");
                }
                str = str.append(six.getText());
                txtPass.setText(str);
                break;

            case R.id.digit7:
                if(option!=0)
                {
                    option = 0;
                    txtPass.setText("");
                }
                str = str.append(seven.getText());
                txtPass.setText(str);
                break;

            case R.id.digit8:
                if(option!=0)
                {
                    option = 0;
                    txtPass.setText("");
                }
                str = str.append(eight.getText());
                txtPass.setText(str);
                break;

            case R.id.digit9:
                if(option!=0)
                {
                    option = 0;
                    txtPass.setText("");
                }
                str = str.append(nine.getText());
                txtPass.setText(str);
                break;

            case R.id.digit0:
                if(option!=0)
                {
                    option = 0;
                    txtPass.setText("");
                }
                str = str.append(zero.getText());
                txtPass.setText(str);
                break;

            case R.id.digitdot:
                if(option!=0)
                {
                    option = 0;
                    txtPass.setText("");
                }
                str = str.append(dot.getText());
                txtPass.setText(str);
                break;

            case R.id.digitbackspace:
                int length = txtPass.getText().length();
                if (length > 0) {
                    txtPass.getText().delete(length - 1, length);
                    passlen = txtPass.getText().length();
                if (length == 1) {
                    elipse1.setBackground(unchecked);
                } else if (length == 2)
                    elipse2.setBackground(unchecked);
                else if (length == 3)
                    elipse3.setBackground(unchecked);
                else if (length == 4)
                    elipse4.setBackground(unchecked);
                }
                break;

            case R.id.iv_forword:
                Intent i=new Intent(this,MainActivity.class);
                startActivity(i);
        }
    }
}
