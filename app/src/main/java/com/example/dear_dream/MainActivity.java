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

    private SlidingUpPanelLayout slideUpLayout;
    private Button dailyBtn, taskBtn, diaryBtn;
    private RecyclerView recycleView;
    private Adapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        slideUpLayout = findViewById(R.id.slideup_layout);
        recycleView = findViewById(R.id.recycleview);

        //Temporary code
        ArrayList<Item> listJudul = new ArrayList<>();
        listJudul.add(new Item("#judul1"));
        listJudul.add(new Item("#judul2"));
        listJudul.add(new Item("#judul3"));

        mAdapter = new Adapter(listJudul);

        recycleView.setLayoutManager(new LinearLayoutManager(this));
        recycleView.setAdapter(mAdapter);

        slideUpLayout.addPanelSlideListener(new SlidingUpPanelLayout.PanelSlideListener() {
             @Override
             public void onPanelSlide(View panel, float slideOffset) {

             }

             @Override
             public void onPanelStateChanged(View panel, SlidingUpPanelLayout.PanelState previousState, SlidingUpPanelLayout.PanelState newState) {


             }
         });
    }
}

