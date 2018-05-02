package com.example.adityasm.gililabaktransport;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class pembayaran extends AppCompatActivity {
    private ImageView bOK;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pembayaran);
        prepareView();
        prepareEvent();

    }
    private void prepareView(){
        bOK = (ImageView) findViewById(R.id.bayar_ok);
    }
    private void prepareEvent(){
        bOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(pembayaran.this, validasi_pembayaran.class);
                startActivity(intent);
            }
        });
    }
}
