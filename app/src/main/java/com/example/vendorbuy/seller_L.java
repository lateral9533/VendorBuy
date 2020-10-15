package com.example.vendorbuy;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class seller_L extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seller__l);
        ListView lv;
        TextView tv;
        final String[] s={"Vegetables","Mobile Food","Home Things","Ice Cream"};
        final ArrayAdapter<String> list;
        Spinner aspinner = findViewById(R.id.spinner);
        @SuppressLint("ResourceType") ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource(this,
                R.string.spinner_items,
                android.R.layout.simple_spinner_item);
        lv=(ListView) findViewById(R.id.list);
        list=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,s);
        lv.setAdapter(list);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(seller_L.this, s[i], Toast.LENGTH_SHORT).show();


            }

        });
    }




    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        Toast.makeText(this,adapterView.getSelectedItem().toString(),Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}