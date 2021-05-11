package com.example.database_room_bai2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView rcv_name;
    CustomAdapter adt;
    ArrayList<Dulich> mDuliches;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rcv_name = findViewById(R.id.rcv_name);
        mDuliches = new ArrayList<>();
        mDuliches.add(new Dulich(R.drawable.sua,R.drawable.bo,"Đà Lạt"));
        mDuliches.add(new Dulich(R.drawable.sua,R.drawable.bo,"Buôn Mê Thuộc"));
        mDuliches.add(new Dulich(R.drawable.sua,R.drawable.bo,"Can tho"));
        adt = new CustomAdapter(mDuliches,this);
        rcv_name.setAdapter(adt);
        rcv_name.setHasFixedSize(true);
        rcv_name.setLayoutManager(new GridLayoutManager(this,1));
    }
}