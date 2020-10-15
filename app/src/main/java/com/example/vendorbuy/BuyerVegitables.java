package com.example.vendorbuy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.TextView;
import android.widget.Toast;
import android.Manifest;

public class BuyerVegitables extends AppCompatActivity  implements AdapterView.OnItemSelectedListener{

    SearchView sv;
    String[] s1;
    int j=0;
    ListView lv;
    TextView tv;
    Button locate,geofencealert,buy;
    String s[]={"Tomatos","Potatos","Brinjals","Carrots","Ladies Fingers","Cucumber"};
    ArrayAdapter<String> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buyer_vegitables);
        tv=(TextView) findViewById(R.id.textView4);
        lv=(ListView) findViewById(R.id.list);
        sv=(SearchView) findViewById(R.id.sv);
        locate=(Button) findViewById(R.id.locate);
        buy=(Button) findViewById(R.id.buy);
        geofencealert=(Button) findViewById(R.id.locate);
        locate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I = new Intent(BuyerVegitables.this, MapsActivity.class);
                startActivity(I);
                finish();
            }
        });
        buy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I = new Intent(BuyerVegitables.this, Boughtsucessfully.class);
                startActivity(I);
                finish();
            }
        });
        geofencealert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I = new Intent(BuyerVegitables.this, Alert.class);
                startActivity(I);
                finish();
            }
        });
        list=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,s);
        lv.setAdapter(list);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(BuyerVegitables.this,s[i],Toast.LENGTH_SHORT).show();

                tv.setText(s[i]);
            }
        });
        sv.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String text) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newtext) {
                list.getFilter().filter(newtext);
                return false;
            }
        });

    }


    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}