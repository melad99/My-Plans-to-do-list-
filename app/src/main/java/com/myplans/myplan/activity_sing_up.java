package com.myplans.myplan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.DataFlair.myplan.R;

public class activity_sing_up extends AppCompatActivity {
    private Button sign_up;
    private TextView textsignin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sing_up);


        sign_up = (Button) findViewById(R.id.sign_up);
        sign_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openwelcome();
            }
        });

        textsignin = (TextView) findViewById(R.id.textView5);
        textsignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opensignin();
            }
        });

    }

    public void openwelcome() {
        Intent intent1 = new Intent(this, activity_welcome.class);
        startActivity(intent1);

    }

    public void opensignin() {
        Intent intent3 = new Intent(this, activity_sign_in.class);
        startActivity(intent3);

    }
}