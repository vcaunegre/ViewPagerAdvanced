package com.example.viewpager2;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PageAdapter extends FragmentPagerAdapter {
    private int[] colors;

    public PageAdapter(@NonNull FragmentManager fm, int[] colors) {
        super(fm);
        this.colors = colors;
    }

    @Override
    public int getCount() {
        return (3);
    }

    public Fragment getItem(int position) {
        switch (position) {
            case 0: //Page number 1
                return NewsPageFragment.newInstance(position,this.colors[position]);
            case 1: //Page number 2
                return ProfilePageFragment.newInstance();
            case 2: //Page number 3
                return ParamPageFragment.newInstance();
            default:
                return null;
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0: //Page number 1
                return "Fil d'actualité";
            case 1: //Page number 2
                return "Profil";
            case 2: //Page number 3
                return "Paramètre";
            default:
                return null;
        }
    }
}

