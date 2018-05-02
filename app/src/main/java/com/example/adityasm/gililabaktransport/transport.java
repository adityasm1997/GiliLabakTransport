package com.example.adityasm.gililabaktransport;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class transport extends AppCompatActivity {
    private ImageView nextBayar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transport);

        prepareView();
        prepareEvent();
    }
    private void prepareView(){
        nextBayar = (ImageView) findViewById(R.id.nextPembayaran);
    }
    private void prepareEvent(){
        nextBayar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(transport.this,transport2.class);
                startActivity(intent);
            }
        });
    }
}
