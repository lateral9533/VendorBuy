package com.example.vendorbuy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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

public class seller_vegitables extends AppCompatActivity  implements AdapterView.OnItemSelectedListener{
    SearchView sv;
    String[] s1;
    int j=0;
    Button bt;
    ListView lv;
    TextView tv;
    String s[]={"Tomatos","Potatos","Brinjals","Carrots","Ladies Fingers","Cucumber"};
    ArrayAdapter<String> list;
    String s2="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.seller_vegetables);
        tv=(TextView) findViewById(R.id.textView4);
        bt= (Button) findViewById(R.id.bt);
        lv=(ListView) findViewById(R.id.list);
        sv=(SearchView) findViewById(R.id.sv);
        list=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,s);
        lv.setAdapter(list);

lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Toast.makeText(seller_vegitables.this,s[i],Toast.LENGTH_SHORT).show();
        s2=s2+","+s[i];
        tv.setText(s2);

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
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I = new Intent(seller_vegitables.this, afterdone.class);
                startActivity(I);
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