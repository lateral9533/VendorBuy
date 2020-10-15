package com.example.vendorbuy;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import com.google.firebase.auth.FirebaseAuth;

import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class useractivity extends AppCompatActivity {
    ImageButton btnLogOut;
    Button userbtn,customerbtn;
    FirebaseAuth firebaseAuth;
    private FirebaseAuth.AuthStateListener authStateListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_useractivity);
        btnLogOut = (ImageButton) findViewById(R.id.btnLogOut);
        userbtn=(Button) findViewById(R.id.userbtn);
        customerbtn=(Button) findViewById(R.id.customerbtn);
        customerbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I = new Intent(useractivity.this, seller_L.class);
                startActivity(I);
            }
        });
        userbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I = new Intent(useractivity.this, Buyer_L.class);
                startActivity(I);
            }
        });
        btnLogOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                FirebaseAuth.getInstance().signOut();
                Intent I = new Intent(useractivity.this, signin.class);
                startActivity(I);

            }
        });

    }
}