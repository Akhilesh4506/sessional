package com.example.table;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityTwo extends AppCompatActivity {
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
        b1=(Button)findViewById(R.id.btn);
        b1 = (Button)findViewById(R.id.btn);

        b1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view)
            {

                // Creating explicit intent
                Intent i;
                i = new Intent(getApplicationContext(),
                        MainActivity2.class);
                startActivity(i);
            }
        });

    }
}