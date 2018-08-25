package com.example.alvin.listview;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager viewPager = findViewById(R.id.viewPager);
        TabLayout tabLayout = findViewById(R.id.tablayout);

        List<Fragment> fragmentList = new ArrayList<>();
        fragmentList.add(new kanan());
        fragmentList.add(new kiri());

        List<String> titleList = new ArrayList<>();
        titleList.add("oaoe");
        titleList.add("haehae");

        viewPager.setAdapter(new ViewPagerFragmentAdapter(getSupportFragmentManager(), fragmentList, titleList));
        tabLayout.setupWithViewPager(viewPager);
    }
}
