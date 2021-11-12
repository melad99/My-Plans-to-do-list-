package com.myplans.myplan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.myplans.myplan.MainActivity;
import com.DataFlair.myplan.R;

public class activity_welcome extends AppCompatActivity {
    private Button lets_go;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        lets_go = (Button) findViewById(R.id.letsgo);
        lets_go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openfirst();
            }
        });

    }

    public void openfirst() {
        Intent intent2 = new Intent(this, main22.class);
        startActivity(intent2);

    }
}