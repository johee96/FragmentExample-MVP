package com.example.mvptest;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class TabPagerAdapter extends FragmentPagerAdapter {

    private static final int PAGE_NUMBER = 2;

    private FragmentPresenterImpl fragmentPresenterImpl;

    public TabPagerAdapter(FragmentManager fragmentManager) {
        super(fragmentManager);
    }

    @Override
    public Fragment getItem(int position) {
        switch ( position ) {
            case 0: {
                TabFragment tabFragment = TabFragment.newInstance();
                fragmentPresenterImpl = new FragmentPresenterImpl(tabFragment);

                return tabFragment;
            }
         case 1: {
             TabFragment tabFragment = TabFragment.newInstance();
             fragmentPresenterImpl = new FragmentPresenterImpl(tabFragment);

             return tabFragment;
            }
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return PAGE_NUMBER;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch ( position ) {
            case 0:
                return "testA";
            case 1:
                return "testB";
            default:
                return "Default";
        }
    }
}
