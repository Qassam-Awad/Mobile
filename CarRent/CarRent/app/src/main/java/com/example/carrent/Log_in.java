package com.example.carrent;

import static com.example.carrent.model.Accounts.exam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.carrent.model.Accounts;

public class Log_in extends AppCompatActivity {

    private EditText editName,editPass;
    Button signIn;
    static boolean isOk =false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        editName = findViewById(R.id.edtUsername);
        editPass = findViewById(R.id.edtPassword);
        signIn = findViewById(R.id.btn_sign_in);
        setContentView(R.layout.activity_log_in);
    }

    public void signUpOnClick(View view) {
        Intent in = new Intent(Log_in.this,Registration.class);
        startActivity(in);
    }
    private void   setUpView (){

    }

    public void signInOnClick(View view) {
        editName = findViewById(R.id.edtUsername);
        editPass = findViewById(R.id.edtPassword);
        signIn = findViewById(R.id.btn_sign_in);
        String name =editName.getText().toString();
        String pass =editPass.getText().toString();

        isOk = exam.logIn(name,pass);
        if (isOk==true) {
            Toast.makeText(this, "Welcome " + editName.getText().toString(), Toast.LENGTH_SHORT).show();
            Intent in = new Intent(Log_in.this,Home.class);
            startActivity(in);
            finish();
        }
        else
            Toast.makeText(this,"Incorrect username or password",Toast.LENGTH_SHORT).show();

    }
}