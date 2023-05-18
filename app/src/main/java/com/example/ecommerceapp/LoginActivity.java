package com.example.ecommerceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    EditText edtEmailAddyLog, edtPasscodeSecureLog;
    Button butnLoginLog, butnRegisterLog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        edtEmailAddyLog = findViewById(R.id.edtEmailAddyLog);
        edtPasscodeSecureLog = findViewById(R.id.edtPasscodeSecureLog);
        butnLoginLog = findViewById(R.id.butnLoginLog);
        butnRegisterLog = findViewById(R.id.butnRegisterlog);


        butnRegisterLog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(LoginActivity.this, RegistrationActivity.class);
                startActivity(i);

            }
        });
    }
}