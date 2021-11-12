package com.myplans.myplan;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.myplans.myplan.MainActivity;
import com.DataFlair.myplan.R;

public class activity_forgot extends AppCompatActivity {
    private Button reset;
    private TextView texttsignin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot);

        reset = (Button) findViewById(R.id.reset);
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                opensignforgot();
            }
        });

        texttsignin = (TextView) findViewById(R.id.signforgot);
        texttsignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opensignforgot2();
            }
        });;


    }

    public void opensignforgot() {
        Intent intent4 = new Intent(this, activity_sign_in.class);
        startActivity(intent4);

    }
    public void opensignforgot2() {
        Intent intent5 = new Intent(this, activity_sign_in.class);
        startActivity(intent5);

    }
}

