package com.dev.jabarik.recyclerviewpractice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerViewAdapter recyclerViewAdapter;
    private LinearLayoutManager linearLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);

        //Improves Performance
        recyclerView.hasFixedSize();

        //Layout Manager
        linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);

        //Adapter
        recyclerViewAdapter = new RecyclerViewAdapter(titles(),links());
        recyclerView.setAdapter(recyclerViewAdapter);




    }


    public ArrayList<String> links(){

        ArrayList<String> linkList = new ArrayList<>();
        String[] array = {"https://images.unsplash.com/photo-1532525429183-5523ef8ce28f?ixlib=rb-0.3.5&ixid=eyJhcHBfaWQiOjEyMDd9&s=3968ac0390f7d071684ed29e43adffdd&auto=format&fit=crop&w=701&q=80",
        "https://images.unsplash.com/photo-1532508826596-f23db0a1d550?ixlib=rb-0.3.5&ixid=eyJhcHBfaWQiOjEyMDd9&s=2c16bb7d42b096fb2e3aeacaea4f77e2&auto=format&fit=crop&w=634&q=80",
        "https://images.unsplash.com/photo-1532476038213-abd379f31aa1?ixlib=rb-0.3.5&ixid=eyJhcHBfaWQiOjEyMDd9&s=d8423d37c79543f47c88ecf5c6580243&auto=format&fit=crop&w=700&q=80"};

        for(String a: array){
            linkList.add(a);
        }

        return linkList;
    }

    public ArrayList<String> titles(){

        ArrayList<String> titleList = new ArrayList<>();
        String[] array = {"A Desert Road", "Vinatage Women", "Dark, Shadow"};

        for(String a: array){
            titleList.add(a);
        }

        return titleList;
    }
}
