package com.example.kamateacchat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener{

    String TAG = "MainActivity";
    EditText et_userName,et_password;
    View btn_login;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_userName=findViewById(R.id.et_userName);
        et_password=findViewById(R.id.et_password);
        btn_login=findViewById(R.id.btn_login);

        btn_login.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if (et_userName.length() == 0) {
            showMessage("Please enter an email");
            return;
        }

        if (et_password.length() == 0) {
            showMessage("please enter a password");
            return;
        }

        User user = new User();
        user.userName = et_userName.getText().toString();
        user.password = Integer.parseInt(et_password.getText().toString());
        checkUser(user);
        startActivity(new Intent(getApplicationContext(), MainActivity.class));
    }

    private void checkUser(User user) {
        if(user.userName.equals("zohara.duenias@gmail.com") && user.password==1995){
            showMessage("login success to "+user.userName);
        }else{
            showMessage("login failed!!!");
        }
    }

    private void showMessage(String message) {
        Toast.makeText(getApplicationContext(),message,Toast.LENGTH_LONG).show();
    }
}

