package com.example.adityasm.gililabaktransport;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class transport2 extends AppCompatActivity {
    private TextView klikdisini;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transport2);
        prepareView();
        prepareEvent();
    }
    private void prepareView(){
        klikdisini = (TextView) findViewById(R.id.klik);
    }
    private void prepareEvent(){
        klikdisini.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(transport2.this,data.class);
                startActivity(intent);
            }
        });
}}
