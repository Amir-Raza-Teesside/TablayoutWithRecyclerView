package uk.ac.tees.aad.tabfrag;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.PagerAdapter;

public class pageAdapter extends FragmentPagerAdapter {

    int tabcount;
    public pageAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);

        tabcount = behavior;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position)
        {
            case 0: return new firstFragment();
            case 1: return new SecondFragme();
            case 2: return new ThirdFragment();
            default:return null;

        }

    }

    @Override
    public int getCount() {
        return this.tabcount;
    }
}
