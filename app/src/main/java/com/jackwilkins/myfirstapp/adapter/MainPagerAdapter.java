package com.jackwilkins.myfirstapp.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.jackwilkins.myfirstapp.fragment.ChatFragment;
import com.jackwilkins.myfirstapp.fragment.EmptyFragment;
import com.jackwilkins.myfirstapp.fragment.StoryFragment;

/**
 * Created by jackwilkins on 20/11/2017.
 */

public class MainPagerAdapter extends FragmentPagerAdapter {

    public MainPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch(position){
            case 0:
                return ChatFragment.create();
            case 1:
                return EmptyFragment.create();
            case 2:
                return StoryFragment.create();
        }

        return null;
    }


    @Override
    public CharSequence getPageTitle(int position) {
        switch(position){
            case 0:
                return "Chat";
            case 1:
                return "Search";
            case 2:
                return "Stories";
        }
        return super.getPageTitle(position);
    }

    @Override
    public int getCount() {
        return 3;
    }
}
