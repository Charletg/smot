package adapter;
import android.app.Fragment;
import android.app.FragmentManager;
import android.support.v13.app.FragmentPagerAdapter;

import fragment.TabFragment1;
import fragment.TabFragment2;

public class TabsPagerAdapter extends FragmentPagerAdapter {

    public TabsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    public Fragment getItem(int index) {

        switch (index) {
            case 0:
                return new TabFragment1();
            case 1:
                return new TabFragment2();
        }

        return null;
    }

    public int getCount() {
        // get item count - equal to number of tabs
        return 2;
    }

}