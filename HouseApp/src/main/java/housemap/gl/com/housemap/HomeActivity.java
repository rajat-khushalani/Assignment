package housemap.gl.com.housemap;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    private TextView mBedRoom;
    private TextView mStoreRoom;
    private TextView mKitchen;
    private TextView mHall;
    private TextView mPet;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        mBedRoom=(TextView)findViewById(R.id.tv_bedroom);
        mBedRoom.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent1 = new Intent(getApplicationContext(), BedRoomActivity.class);
                startActivity(intent1);
            }
        });

        mStoreRoom=(TextView)findViewById(R.id.tv_storeroom);
        mStoreRoom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 =new Intent(getApplicationContext(),StoreRoomActivity.class);
                startActivity(intent2);
            }
        });

        mKitchen=(TextView)findViewById(R.id.tv_kitchen);
        mKitchen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 =new Intent(getApplicationContext(),KitchenActivity.class);
                startActivity(intent3);
            }
        });

        mHall=(TextView)findViewById(R.id.tv_hall);

            mPet=(TextView)findViewById(R.id.tv_pet);

        mHall.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    AlertDialog.Builder builder1 = new AlertDialog.Builder(HomeActivity.this);
                    builder1.setMessage("Pet Name");
                    builder1.setCancelable(true);

                    editText = new EditText(HomeActivity.this);
                    LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(
                            LinearLayout.LayoutParams.MATCH_PARENT,
                            LinearLayout.LayoutParams.MATCH_PARENT);
                    editText.setLayoutParams(lp);
                    builder1.setView(editText);


                    builder1.setNeutralButton(
                            "Close",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int id) {
                                    dialog.cancel();
                                    mPet.setText(editText.getText().toString());

                                }
                            });



                AlertDialog alert11 = builder1.create();
                alert11.show();
            }
        });
    }

}

