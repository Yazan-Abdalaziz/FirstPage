package com.example.yazan.firstpage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    ArrayList<String> mdevicesNames = new ArrayList<>();
    ArrayList<Boolean> mdevicesStatus = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "Inside onCreate");
        initiatItems();




    }

    private void initiatItems(){
        Log.d(TAG,"Initiating Items");
        mdevicesNames.add("Fan1");
        mdevicesNames.add("Fan2");
        mdevicesNames.add("Fan3");
        mdevicesNames.add("Fan4");
        mdevicesNames.add("Fan5");
        mdevicesNames.add("Fan6");
        mdevicesNames.add("Fan7");
        mdevicesNames.add("Fan8");
        mdevicesNames.add("Fan9");
        mdevicesNames.add("Fan10");
        mdevicesNames.add("Fan11");
        mdevicesNames.add("Fan12");
        mdevicesStatus.add(Boolean.TRUE);
        mdevicesStatus.add(Boolean.FALSE);
        mdevicesStatus.add(Boolean.TRUE);
        mdevicesStatus.add(Boolean.FALSE);
        mdevicesStatus.add(Boolean.TRUE);
        mdevicesStatus.add(Boolean.FALSE);
        mdevicesStatus.add(Boolean.TRUE);
        mdevicesStatus.add(Boolean.FALSE);
        mdevicesStatus.add(Boolean.TRUE);
        mdevicesStatus.add(Boolean.FALSE);
        mdevicesStatus.add(Boolean.TRUE);
        mdevicesStatus.add(Boolean.FALSE);
        initiateRecyclerView();
    }

    private void initiateRecyclerView(){
        Log.d(TAG, "Initiating Recycler View");
        RecyclerView recycler = findViewById(R.id.recycler_view);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, mdevicesNames, mdevicesStatus);
        recycler.setAdapter(adapter);
        recycler.setLayoutManager(new LinearLayoutManager(this));
    }
}
