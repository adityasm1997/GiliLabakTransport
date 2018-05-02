package com.example.adityasm.gililabaktransport;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView ivLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        prepareView();
        prepareEvent();
    }
    private void prepareView(){
        ivLogin = (ImageView) findViewById(R.id.button_login);

    }

    private void prepareEvent(){
        ivLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, home.class);
                startActivity(intent);
            }
        });

    }
}
