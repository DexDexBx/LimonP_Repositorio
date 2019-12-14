package com.example.aboutas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class AboutUsActivity1 extends AppCompatActivity {
    Button cont;
    CheckBox tc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us_1);

        tc=(CheckBox) findViewById(R.id.cbx1);
        cont=(Button) findViewById(R.id.continued);

    }

    public void BienvenidoNow (View View){
        Intent BienvenidoNow = new Intent (this,BienvenidoActivity.class);
            startActivity(BienvenidoNow);

    }

    public void AboutUsNow (View View){
        Intent AboutUsNow = new Intent (this,AboutUsActivity.class);
        startActivity(AboutUsNow);

    }

    public void Continuar (View View){

        if (tc.isChecked()== true){
            cont.setEnabled(true);
        }
    }
}

