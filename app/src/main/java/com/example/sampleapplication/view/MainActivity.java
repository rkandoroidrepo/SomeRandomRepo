package com.example.sampleapplication.view;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.sampleapplication.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState == null) {
            ListFragment listFragment = ListFragment.newInstance();
            getSupportFragmentManager()
                    .beginTransaction()
                    .add(R.id.fragment_container, listFragment)
                    .commit();
        }
    }
}
