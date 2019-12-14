package com.example.aboutas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AboutUsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);
    }

    public void TerminosNow (View View){
        Intent TerminosNow = new Intent (this,AboutUsActivity1.class);
        startActivity(TerminosNow);

    }
}
