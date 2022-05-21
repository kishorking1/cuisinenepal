package com.example.cuisinenepal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;
import com.vishnusivadas.advanced_httpurlconnection.PutData;

public class signup extends AppCompatActivity {
ImageView regbackbutton;
EditText editTextfullnametextbox,
        editTextcontacttextbox,
        editTextaddresstextbox,
        editTextemailtextbox,
        editTextusernametextbox,
        editTextpasswordtextbox;
Button registerbutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        regbackbutton = findViewById(R.id.regbackbutton);
        editTextaddresstextbox = findViewById(R.id.addresstextbox);
        editTextcontacttextbox = findViewById(R.id.contacttextbox);
        editTextemailtextbox  = findViewById(R.id.emailtextbox);
        editTextfullnametextbox = findViewById(R.id.fullnametextbox);
        editTextusernametextbox = findViewById(R.id.usernametextbox);
        editTextpasswordtextbox = findViewById(R.id.passwordtextbox);
        registerbutton = findViewById(R.id.registerbutton);


        registerbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fullname, address, contact, email, username, password;
                fullname = String.valueOf(editTextfullnametextbox.getText());
                address = String.valueOf(editTextaddresstextbox.getText());
                contact = String.valueOf(editTextcontacttextbox.getText());
                email = String.valueOf(editTextemailtextbox.getText());
                username = String.valueOf(editTextusernametextbox.getText());
                password = String.valueOf(editTextpasswordtextbox.getText());

                if (!fullname.equals("")
                        && !address.equals("")
                        && !contact.equals("")
                        && !email.equals("")
                        && !username.equals("")
                        && !password.equals("")) {

                    Handler handler = new Handler();
                    handler.post(new Runnable() {
                        @Override
                        public void run() {

                            String[] field = new String[6];
                            field[0] = "fullname";
                            field[1] = "address";
                            field[2] = "contact";
                            field[3] = "email";
                            field[4] = "username";
                            field[5] = "password";

                            String[] data = new String[6];
                            data[0] = fullname;
                            data[1] = address;
                            data[2] = contact;
                            data[3] = email;
                            data[4] = username;
                            data[5] = password;
                            PutData putData = new PutData("http://10.20.20.251//loginregister/signup.php", "POST", field, data);
                            if (putData.startPut()) {
                                if (putData.onComplete()) {
                                    String result = putData.getResult();
                                    if (result.equals("Sign Up Success")) {
                                        Toast.makeText(getApplicationContext(), result, Toast.LENGTH_SHORT).show();
                                        Intent intent = new Intent(getApplicationContext(), Login.class);
                                        startActivity(intent);

                                    } else {
                                        Toast.makeText(getApplicationContext(), result, Toast.LENGTH_SHORT).show();
                                    }


                                }
                            }

                        }
                    });
                } else {
                    Toast.makeText(getApplicationContext(), "All field are required", Toast.LENGTH_SHORT).show();
                }
            }
        });




        regbackbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }


}