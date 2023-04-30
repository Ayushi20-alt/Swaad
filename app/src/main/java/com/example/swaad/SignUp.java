package com.example.swaad;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SignUp extends AppCompatActivity {
       TextView txt1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);


        txt1 = findViewById(R.id.button);
        txt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent newHome1 = new Intent(SignUp.this, MainActivity.class);
                startActivity(newHome1);
            }
        });


        TextInputLayout txt1 = findViewById(R.id.inputPassword);
        TextInputEditText txt2 = findViewById(R.id.textInputEditText1);

        txt2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                String password = s.toString();
                if (password.length() >= 8) {
                    Pattern pattern = Pattern.compile("[a-zA-Z0-9]");
                    Matcher matcher = pattern.matcher(password);
                    boolean ispwdContainersSpeChar = matcher.find();
                    if (ispwdContainersSpeChar) {
                        txt1.setHelperText("Strong Password");
                        txt1.setError("");
                    } else {
                        txt1.setHelperText("");
                        txt1.setError("Weak Password. Include minimum 1 specia character");
                    }
                } else {
                    txt1.setHelperText("Enter Minimum 8 char");
                    txt1.setError("");
                }


            }

            @Override
            public void afterTextChanged(Editable s) {

            }


        });

    }
}