package com.example.apm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

public class train extends AppCompatActivity {
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_train);

        viewPager=findViewById(R.id.viewPager);
        pageradapter pageradapter=new pageradapter(this);
        viewPager.setAdapter(pageradapter);

    }
}
