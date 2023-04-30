package com.example.swaad;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LoginActivity extends AppCompatActivity {
    TextView linkTextView;
    TextView forgot;
    Button button;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // removing the title bar
//        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);


        linkTextView = findViewById(R.id.signUp);
        linkTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent newHome = new Intent(LoginActivity.this, SignUp.class);
                startActivity(newHome);
            }
        });

        forgot = findViewById(R.id.forgot_pass);
        forgot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent newHome = new Intent(LoginActivity.this, forgotPassword.class);
                startActivity(newHome);
            }
        });

        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent newHome = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(newHome);
            }
        });


        TextInputLayout txt1 = findViewById(R.id.inputPassword);
        TextInputEditText txt2 = findViewById(R.id.inputtextpassword);

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
