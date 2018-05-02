package com.example.adityasm.gililabaktransport;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.view.Window;

public class home extends AppCompatActivity {
    private CardView cvTransport, cvPembayaran;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);

        setContentView(R.layout.activity_home);
        prepareView();
        prepareEvent();
    }
    private void prepareView(){
        cvTransport = (CardView) findViewById(R.id.home_cv_transport);
        cvPembayaran = (CardView) findViewById(R.id.home_cv_pembayaran);

    }

    private void prepareEvent(){
        cvTransport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(home.this, transport.class);
                startActivity(intent);
            }
        });
        cvPembayaran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(home.this, pembayaran.class);
                startActivity(intent);
            }
        });

    }

}


