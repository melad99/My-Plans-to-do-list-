package com.myplans.myplan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.DataFlair.myplan.R;

public class main22 extends AppCompatActivity {
    private ImageButton addd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main22);

        addd = (ImageButton) findViewById(R.id.imageButton4);
        addd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openmain();
            }
        });

    }


    public void openmain() {
        Intent intent10 = new Intent(this, MainActivity.class);
        startActivity(intent10);
    }
}