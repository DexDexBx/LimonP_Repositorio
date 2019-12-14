package com.example.limonp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class ForgotPasswordActivity extends AppCompatActivity {
    RelativeLayout rellay1;
    TextView nombrelimon;

    Handler handler = new Handler();
    Runnable runnable = new Runnable() {
        @Override
        public void run() {
            rellay1.setVisibility(View.VISIBLE);

        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);
        rellay1=(RelativeLayout) findViewById(R.id.rellay1);
        nombrelimon=(TextView) findViewById(R.id.nombrelimon);

        handler.postDelayed(runnable,2000);
    }

    public void CodeSents (View view){
        Intent CodeSents = new Intent(this,CodeSendActivity.class);
        startActivity(CodeSents);
    }
}
