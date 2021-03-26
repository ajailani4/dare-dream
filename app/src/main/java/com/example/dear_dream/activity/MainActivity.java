package com.example.dear_dream.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;


import com.example.dear_dream.fragment.Diary;
import com.example.dear_dream.object.Item;
import com.example.dear_dream.R;
import com.example.dear_dream.adapter.Adapter;
import com.sothree.slidinguppanel.SlidingUpPanelLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private SlidingUpPanelLayout slideUpLayout;
    private Button diaryBtn, taskBtn, dailyBtn;
    private RecyclerView recycleView;
    private Adapter mAdapter;

    private Diary diary;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        slideUpLayout = findViewById(R.id.slideup_layout);

        diaryBtn = findViewById(R.id.diary_btn);
        taskBtn = findViewById(R.id.task_btn);
        dailyBtn = findViewById(R.id.daily_btn);

        slideUpLayout.addPanelSlideListener(new SlidingUpPanelLayout.PanelSlideListener() {
             @Override
             public void onPanelSlide(View panel, float slideOffset) {

             }

             @Override
             public void onPanelStateChanged(View panel, SlidingUpPanelLayout.PanelState previousState, SlidingUpPanelLayout.PanelState newState) {


             }
         });

        //When menu is clicked
        diaryBtn.setOnClickListener(this);
        taskBtn.setOnClickListener(this);
        dailyBtn.setOnClickListener(this);
    }

    private void showMenu(Fragment fragment) {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.menuContainer, fragment)
                .commit();
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.diary_btn: {
                if(diary == null) {
                    diary = new Diary();
                }

                showMenu(diary);
                break;
            }

            case R.id.task_btn: {
                //Go to Task
                break;
            }

            case R.id.daily_btn: {
                //Go to Daily
                break;
            }
        }
    }
}

