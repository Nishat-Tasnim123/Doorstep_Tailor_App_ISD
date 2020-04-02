package com.example.doorstep_tailor_app_isd;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class PagerAdapter  extends FragmentStatePagerAdapter {
    int mNoOfTabs;
    public PagerAdapter(FragmentManager fm, int NumberOfTabs)
    {
        super(fm);
        this.mNoOfTabs=NumberOfTabs;
    }
    @Override
    public Fragment getItem(int i) {
        switch(i)
        {
            case 0:
                BestRated_Tailors tab1=new BestRated_Tailors();
                return  tab1;
            case 1:
                Discount_Tailors tab2=new Discount_Tailors();
                return  tab2;
            case 2:
                Favourite_Tailors tab3=new Favourite_Tailors();
                return  tab3;

            default:
                return null;

        }

    }

    @Override
    public int getCount() {
        return 0;
    }
}
