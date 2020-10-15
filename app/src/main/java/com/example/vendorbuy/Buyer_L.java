package com.example.vendorbuy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class Buyer_L extends AppCompatActivity {

    ImageButton imageButton3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buyer__l);
        imageButton3=findViewById(R.id.imageButton3);
        imageButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I = new Intent(Buyer_L.this, BuyerVegitables.class);
                startActivity(I);
                finish();
            }
        });
    }
}