package com.example.adityasm.gililabaktransport;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class validasi_pembayaran extends AppCompatActivity {
    private TextView klik;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_validasi_pembayaran);
        prepareView();
        prepareEvent();
    }
    private void prepareView(){
        klik = (TextView) findViewById(R.id.klikdisini);
    }
    private void prepareEvent(){
        klik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(validasi_pembayaran.this,bukti_pembayaran.class);
                startActivity(intent);
            }
        });
    }
}
