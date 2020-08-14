package com.manish.newapp;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.manish.newapp.Fragments.TabNews1;
import com.manish.newapp.Fragments.TabNews10;
import com.manish.newapp.Fragments.TabNews2;
import com.manish.newapp.Fragments.TabNews3;
import com.manish.newapp.Fragments.TabNews4;
import com.manish.newapp.Fragments.TabNews5;
import com.manish.newapp.Fragments.TabNews6;
import com.manish.newapp.Fragments.TabNews7;
import com.manish.newapp.Fragments.TabNews8;
import com.manish.newapp.Fragments.TabNews9;

public class PagerAdapter extends FragmentStatePagerAdapter {
    int mNumOfTabs;

    public PagerAdapter(@NonNull FragmentManager fm, int NumOfTabs) {
        super(fm, NumOfTabs);
        this.mNumOfTabs = NumOfTabs;
    }


    @NonNull
    /**
     * Return the Fragment associated with a specified position.
     *
     * @param position
     */
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new TabNews1();
            case 1:
                return new TabNews2();
            case 2:
                return new TabNews3();
            case 3:
                return new TabNews4();
            case 4:
                return new TabNews5();
            case 5:
                return new TabNews6();
            case 6:
                return new TabNews7();
            case 7:
                return new TabNews8();
            case 8:
                return new TabNews9();
            case 9:
                return new TabNews10();
            default:
                return null;
        }

    }

    /**
     * Return the number of views available.
     */
    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}
