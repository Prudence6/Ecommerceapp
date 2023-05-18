package com.example.ecommerceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class RegistrationActivity extends AppCompatActivity {

    EditText edtEmailAddyReg, edtFullnameDetailsReg, edtPasscodeSecureReg,edtDateOfBirthInfoReg, edtPhoneNumInfoReg;
    Button butnLoginReg, butnRegistrationReg;
    TextView txtDisplaysInformReg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        edtEmailAddyReg = findViewById(R.id.edtEmailAddyReg);
        edtFullnameDetailsReg = findViewById(R.id.edtFullnameDetailsReg);
        edtPasscodeSecureReg = findViewById(R.id.edtPasscodeSecureReg);
        edtDateOfBirthInfoReg = findViewById(R.id.edtDateOfBirthInfoReg);
        edtPhoneNumInfoReg = findViewById(R.id.edtPhoneNumInfoReg);
        txtDisplaysInformReg = findViewById(R.id.txtDisplaysInformReg);

        butnLoginReg = findViewById(R.id.butnLoginReg);
        butnRegistrationReg = findViewById(R.id.butnRegisterationReg);

        butnLoginReg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(RegistrationActivity.this, MainActivity.class);
                startActivity(i);
            }
        });

        butnRegistrationReg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String srFullname = edtFullnameDetailsReg.getText().toString();
                String srEmailAddress = edtEmailAddyReg.getText().toString();
                String srPasscode = edtPasscodeSecureReg.getText().toString();
                String srPhoneNumber = edtPhoneNumInfoReg.getText().toString();
                String srDateOfBirth = edtDateOfBirthInfoReg.getText().toString();

                if(srFullname.isEmpty() && srEmailAddress.isEmpty() && srPhoneNumber.isEmpty() && srPasscode.isEmpty() && srDateOfBirth.isEmpty()){

                    txtDisplaysInformReg.setText("Fill in all fields");

                }else {
                    Users newUser = new Users();
                    newUser.setFullname(srFullname);
                    newUser.setEmailAddress(srEmailAddress);
                    newUser.setPasscode(srPasscode);
                    newUser.setPhoneNumber(srPhoneNumber);
                    newUser.setDateOfBirth(srDateOfBirth);


                    DatabaseConn db = new DatabaseConn(getApplicationContext());
                    db.addingAnyUser(newUser);

                    // toast - user is succescfully registered
                    Toast.makeText(getApplicationContext(), "registered successfully", Toast.LENGTH_SHORT).show();

                    Intent i = new Intent(RegistrationActivity.this, MainActivity.class);
                    startActivity(i);
                }

            }
        });



    }
}