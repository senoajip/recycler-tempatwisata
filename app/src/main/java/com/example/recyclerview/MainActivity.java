package com.example.recyclerview;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ArrayList<TempatWisata> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.rvData);
        recyclerView.setHasFixedSize(true);

        list.addAll(WisataData.getListData());
        showRecyclerView();
    }

    private void showRecyclerView(){
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        Adapter adapterr = new Adapter(list);
        recyclerView.setAdapter(adapterr);
    }
}