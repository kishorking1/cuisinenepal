package com.example.cuisinenepal;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.vishnusivadas.advanced_httpurlconnection.PutData;

import org.w3c.dom.Text;

public class Login extends AppCompatActivity {
ImageView backbutton;
TextView registerclick;
TextView LoginBTN;
EditText editTextusernametextbox,editTextpasswordtextbox;
TextView skip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        backbutton = findViewById(R.id.backbutton);
        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });




        registerclick = findViewById(R.id.registerclick);
        registerclick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Login.this,signup.class);
                startActivity(intent);
            }
        });


        skip = findViewById(R.id.skip);
        skip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Login.this,MainActivity2.class);
                startActivity(intent);
            }
        });




        LoginBTN = findViewById(R.id.LoginBTN);
        editTextpasswordtextbox = findViewById(R.id.password);
        editTextusernametextbox = findViewById(R.id.username);
        LoginBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String username, password;

                username = String.valueOf(editTextusernametextbox.getText());
                password = String.valueOf(editTextpasswordtextbox.getText());

                if (!username.equals("")
                        && !password.equals("")) {

                    Handler handler = new Handler();
                    handler.post(new Runnable() {
                        @Override
                        public void run() {

                            String[] field = new String[2];

                            field[0] = "username";
                            field[1] = "password";

                            String[] data = new String[2];

                            data[0] = username;
                            data[1] = password;
                            PutData putData = new PutData("http://10.20.20.251//loginregister/login.php", "POST", field, data);
                            if (putData.startPut()) {
                                if (putData.onComplete()) {
                                    String result = putData.getResult();
                                    if (result.equals("Login Success")) {
                                        Toast.makeText(getApplicationContext(), result, Toast.LENGTH_SHORT).show();
                                        Intent intent = new Intent(getApplicationContext(), Homepage.class);
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

        }

        }


