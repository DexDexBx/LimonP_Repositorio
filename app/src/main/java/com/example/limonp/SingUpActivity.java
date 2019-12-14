package com.example.limonp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class SingUpActivity extends AppCompatActivity {

    private EditText etn,etu,etp;
    RelativeLayout rellay1,rellay2;


    Handler handler = new Handler();
    Runnable runnable = new Runnable() {
        @Override
        public void run() {
            rellay1.setVisibility(View.VISIBLE);
            rellay2.setVisibility(View.VISIBLE);
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sing_up);

        etn = (EditText) findViewById(R.id.txt_nom);
        etu = (EditText) findViewById(R.id.txt_use2);
        etp = (EditText) findViewById(R.id.txt_pass2);


        rellay1=(RelativeLayout) findViewById(R.id.rellay1);
        rellay2=(RelativeLayout) findViewById(R.id.rellay2);

        handler.postDelayed(runnable,2000);
    }

    public void LoginNow (View view){
        Intent LoginNow = new Intent(this, LoginActivity.class);
        startActivity(LoginNow);
    }

    public void SingUp (View view){
        String user = etu.getText().toString();
        String password = etp.getText().toString();
        String nombre = etn.getText().toString();

        if (nombre.isEmpty() ){
            etu.setError("Ingrese un nombre");
        }
        if (user.isEmpty() ){
            etu.setError("Ingrese un correo");
        }
        if (password.isEmpty()){
            etp.setError("Ingrese una contraseña");
        }

        if (nombre.isEmpty() && user.isEmpty()&& password.isEmpty()){
            etn.setError("Ingrese un nombre");
            etu.setError("Ingrese una correo");
            etp.setError("Ingrese una contraseña");
            Toast.makeText(this,"Ingrese datos",Toast.LENGTH_LONG).show();
        }
        if (user.length() != 0 && password.length()!= 0){
            Toast.makeText(this,"Usuario Registrado",Toast.LENGTH_LONG).show();
        }

    }
}
