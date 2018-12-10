package gestures.gl.com.gestures;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.Toast;

import static android.content.ContentValues.TAG;

public class MainActivity extends Activity {
    private static String TAG="Gestures";
    private boolean isTouch = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {

        float X = (float) event.getX();
        float Y = (float) event.getY();
        int eventaction = event.getAction();

        switch (eventaction) {
            case MotionEvent.ACTION_DOWN:
                Toast.makeText(this, "ACTION_DOWN AT COORDS "+"X: "+X+" Y: "+Y, Toast.LENGTH_SHORT).show();
                Log.d(TAG,"ACTION_DOWN AT COORDS "+"X: "+X+" Y: "+Y);
                isTouch = true;
                break;

            case MotionEvent.ACTION_MOVE:
                Toast.makeText(this, "MOVE "+"X: "+X+" Y: "+Y, Toast.LENGTH_SHORT).show();
                Log.d(TAG,"ACTION_MOVE AT COORDS "+"X: "+X+" Y: "+Y);
                break;

            case MotionEvent.ACTION_UP:
                Toast.makeText(this, "ACTION_UP "+"X: "+X+" Y: "+Y, Toast.LENGTH_SHORT).show();
                Log.d(TAG,"ACTION_UP AT COORDS "+"X: "+X+" Y: "+Y);
                break;
        }
        return true;
    }
}
