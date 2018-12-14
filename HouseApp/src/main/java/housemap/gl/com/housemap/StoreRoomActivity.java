package housemap.gl.com.housemap;

import android.net.Uri;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class StoreRoomActivity extends AppCompatActivity implements StoreRoomFragment.OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_store_room);
        Fragment newFragment = new StoreRoomFragment();
        FragmentTransaction transaction1 = getSupportFragmentManager().beginTransaction();
        transaction1.replace(R.id.fragment_frame, newFragment);
        transaction1.addToBackStack(null);
        transaction1.commit();
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
