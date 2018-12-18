package viewpagerapplication.gl.com.viewpagerapplication;



import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;



public class ViewPagerAdapter extends FragmentStatePagerAdapter {


    private static int sNUM_ITEMS = 4;

    public ViewPagerAdapter(FragmentManager fragmentManager) {
        super(fragmentManager);
    }

    // Returns total number of pages
    @Override
    public int getCount() {
        return sNUM_ITEMS;
    }

    // Returns the fragment to display for that page
    @Override
    public Fragment getItem(int position) {
        switch (position) {

                case 1:
                    DeviceInfoFragment deviceInfoFragment=new DeviceInfoFragment();
                    return deviceInfoFragment;
                    //return newInstance(1, "Device Information");
                case 2:
                    AppVersionFragment appVersionFragment=new AppVersionFragment();
                    return appVersionFragment;
                case 3:
                    TabletOrMobileInfoFragment tabletOrMobileInfoFragment=new TabletOrMobileInfoFragment();
                    return tabletOrMobileInfoFragment;
                default:
                    ActivityFragment activityFragment =new ActivityFragment();
                    return activityFragment;
        }
    }

    // Returns the page title for the top indicator
    @Override
    public CharSequence getPageTitle(int position) {
        return "Page " + position;
    }

}

