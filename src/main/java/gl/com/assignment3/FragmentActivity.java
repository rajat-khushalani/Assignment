package gl.com.assignment3;

import android.graphics.Color;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class FragmentActivity extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);
        // Create new fragment and transaction
        //Fragment1
       /* Fragment newFragment = new Fragment1();
        FragmentTransaction transaction1 = getSupportFragmentManager().beginTransaction();
        transaction1.add(R.id.frame_layout, newFragment);
        transaction1.addToBackStack(null);

// Replace whatever is in the fragment_container view with this fragment,
// and add the transaction to the back stack


// Commit the transaction
        transaction1.commit();
        //newFragment.getView().setBackgroundColor(Color.BLUE);
 // Fragment2
        Fragment newFragment2 = new Fragment2();
        FragmentTransaction transaction2= getSupportFragmentManager().beginTransaction();
        transaction2.replace(R.id.frame_layout, newFragment);
        transaction2.addToBackStack(null);

        //newFragment2.getView().setBackgroundColor(Color.GREEN);
// Replace whatever is in the fragment_container view with this fragment,
// and add the transaction to the back stack*/


// Commit the transaction
        //transaction2.commit();
    }
}
