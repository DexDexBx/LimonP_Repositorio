package com.example.limonp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Patterns;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.regex.Pattern;

public class LoginActivity extends AppCompatActivity {

    private EditText etu,etp;
    RelativeLayout rellay1,rellay2;
    TextView nombrelimon;

    Handler handler = new Handler();
    Runnable runnable = new Runnable() {
        @Override
        public void run() {
            rellay1.setVisibility(View.VISIBLE);
            rellay2.setVisibility(View.VISIBLE);
            nombrelimon.setVisibility(View.VISIBLE);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        etu = (EditText) findViewById(R.id.txt_user);
        etp = (EditText)findViewById(R.id.txt_pass);

        rellay1=(RelativeLayout) findViewById(R.id.rellay1);
        rellay2=(RelativeLayout) findViewById(R.id.rellay2);
        nombrelimon=(TextView) findViewById(R.id.nombrelimon);

        handler.postDelayed(runnable,2000);
    }

    public void SingUpNow (View view){
        Intent SingUpNow = new Intent(this,SingUpActivity.class);
        startActivity(SingUpNow);
    }
    public void ForgotPass (View view){
        Intent ForgotPass = new Intent(this,ForgotPasswordActivity.class);
        startActivity(ForgotPass);
    }

    public void Login (View view){
        String user = etu.getText().toString();
        String password = etp.getText().toString();

        if (user.isEmpty() ){
            etu.setError("Ingrese un correo");
        }
        if (password.isEmpty()){
            etp.setError("Ingrese una contraseña");
        }

        if (user.isEmpty()&& password.isEmpty()){
            etu.setError("Ingrese una correo");
            etp.setError("Ingrese una contraseña");
            Toast.makeText(this,"Ingrese datos",Toast.LENGTH_LONG).show();
        }
        if (user.length() != 0 && password.length()!= 0){
            Toast.makeText(this,"Iniciando Sesion",Toast.LENGTH_LONG).show();
        }

    }
}
