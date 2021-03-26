package com.example.dear_dream.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Context;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

import com.example.dear_dream.R;

public class AddDiary extends AppCompatActivity {
    private Toolbar toolbar;
    private EditText diaryEt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_diary);

        toolbar = findViewById(R.id.toolbar);
        diaryEt = findViewById(R.id.diaryEt);

        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(getResources().getString(R.string.tambah_diary));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //Set focus on diaryEt
        diaryEt.requestFocus();

        if(diaryEt.requestFocus()) {
            getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_VISIBLE);
        }
    }
}