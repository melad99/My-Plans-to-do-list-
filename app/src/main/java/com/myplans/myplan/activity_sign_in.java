package com.myplans.myplan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.DataFlair.myplan.R;
import com.myplans.myplan.activity_sing_up;

public class activity_sign_in extends AppCompatActivity {
    private Button sign_in;
    private TextView textforogt;
    private TextView textsignup;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);


        sign_in = (Button) findViewById(R.id.sign_in);
        sign_in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openwelcome();
            }
        });

        textforogt = (TextView) findViewById(R.id.forgotyour);
        textforogt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openforgot();
            }
        });

        textsignup = (TextView) findViewById(R.id.textView5);
        textsignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opensignup();
            }
        });

    }
    public void openwelcome () {
        Intent intent1 = new Intent(this, activity_welcome.class);
        startActivity(intent1);


    }

    public void openforgot () {
        Intent intent2 = new Intent(this, activity_forgot.class);
        startActivity(intent2);

    }

    public void opensignup () {
        Intent intent3 = new Intent(this, activity_sing_up.class);
        startActivity(intent3);

    }

}
