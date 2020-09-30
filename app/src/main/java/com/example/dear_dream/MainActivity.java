package com.example.dear_dream;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;


import com.sothree.slidinguppanel.SlidingUpPanelLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Button daily, task, diary;
    private RecyclerView recycle;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayuotManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SlidingUpPanelLayout layout = findViewById(R.id.slidingup);


        ArrayList<judulItem> listjudul = new ArrayList<>();
        listjudul.add(new judulItem("#judul1"));
        listjudul.add(new judulItem("#judul2"));
        listjudul.add(new judulItem("#judul3"));
        listjudul.add(new judulItem("#judul34"));
        listjudul.add(new judulItem("#judul34"));
        listjudul.add(new judulItem("#judul34"));
        listjudul.add(new judulItem("#judul34"));
        listjudul.add(new judulItem("#judul34"));
        listjudul.add(new judulItem("#judul34"));
        listjudul.add(new judulItem("#judul34"));
        listjudul.add(new judulItem("#judul34"));
        listjudul.add(new judulItem("#judul34"));
        listjudul.add(new judulItem("#judul34"));
        listjudul.add(new judulItem("#judul34"));


        recycle = findViewById(R.id.recycleview);
        recycle.setHasFixedSize(true);
        mLayuotManager = new LinearLayoutManager(this);
        mAdapter = new Adapter(listjudul);

        recycle.setLayoutManager(mLayuotManager);
        recycle.setAdapter(mAdapter);


         layout.addPanelSlideListener(new SlidingUpPanelLayout.PanelSlideListener() {
             @Override
             public void onPanelSlide(View panel, float slideOffset) {

             }

             @Override
             public void onPanelStateChanged(View panel, SlidingUpPanelLayout.PanelState previousState, SlidingUpPanelLayout.PanelState newState) {


             }
         });
    }

}

