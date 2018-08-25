package com.example.alvin.listview;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.view.View;

import java.util.List;

/**
 * Created by Alvin on 25/08/2018.
 */

class ViewPagerFragmentAdapter extends FragmentPagerAdapter {
    private List<Fragment> fragments;
    public ViewPagerFragmentAdapter(FragmentManager fm, List<Fragment> fragmentList){
        super(fm);
        this.fragments = fragmentList;
    }

    @Override
    public android.support.v4.app.Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }
}
