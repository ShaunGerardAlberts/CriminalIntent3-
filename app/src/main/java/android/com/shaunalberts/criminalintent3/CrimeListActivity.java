package android.com.shaunalberts.criminalintent3;

import android.support.v4.app.Fragment;

/**
 * Created by shaun on 7/09/16.
 */
public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
