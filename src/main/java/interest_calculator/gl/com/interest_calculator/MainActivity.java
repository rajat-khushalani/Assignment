package interest_calculator.gl.com.interest_calculator;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static android.view.View.OnClickListener;


public class MainActivity extends Activity implements OnClickListener {
    private static String TAG="INTEREST_CALCULATOR";
    private TextView mPrincipleAmount;
    TextView mInterestRate;
    TextView mYears;
    EditText mPrincipleAmt_bar;
    EditText mInterestRate_bar;
    EditText myear_bar;
    Button SimpleInterest;
    Button CompoundInterest;
    TextView t1;
    private Bundle savedInstanceState;
    private View v;
    /*public SimpleInterest simpleInterest;
    public CompoundInterest compoundInterest;*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.savedInstanceState = savedInstanceState;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.userInputs();
        /*SimpleInterest simpleInterest=new SimpleInterest();
        CompoundInterest compoundInterest=new CompoundInterest();*/


    }
    public void userInputs() {
        this.mPrincipleAmount = (TextView) findViewById(R.id.Principle_Amount);
        this.mInterestRate = (TextView) findViewById(R.id.Interest_Rate);
        this.mYears = (TextView) findViewById(R.id.years);
        this.mPrincipleAmt_bar = (EditText) findViewById(R.id.PA_Bar);
        this.mInterestRate_bar = (EditText) findViewById(R.id.IR_Bar);
        this.myear_bar = (EditText) findViewById(R.id.year_bar);
        this.t1 = (TextView) findViewById(R.id.t1);
        findViewById(R.id.btn_simpleInterest).setOnClickListener(this);
        findViewById(R.id.btn_compoundInterest).setOnClickListener(this);
        }



       /* SimpleInterest.setOnClickListener(new View.OnClickListener()
        {*/
        public void onClick (View v){
            switch (v.getId()) {
                case R.id.btn_simpleInterest:
                    float principle = Float.parseFloat(mPrincipleAmt_bar.getText().toString());
                    float rate = Float.parseFloat(mInterestRate_bar.getText().toString());
                    float year = Float.parseFloat(myear_bar.getText().toString());
                    Log.d(TAG,"AAJYA");
                    SimpleInterest simpleInterest=new SimpleInterest();
                    t1.setText(Float.toString(simpleInterest.calculateSimpleInterest(principle,rate,year)));
                    return;
                case R.id.btn_compoundInterest:
                    float principle1 = Float.parseFloat(mPrincipleAmt_bar.getText().toString());
                    float rate1 = Float.parseFloat(mInterestRate_bar.getText().toString());
                    float year1 = Float.parseFloat(myear_bar.getText().toString());
                    CompoundInterest compoundInterest=new CompoundInterest();
                   t1.setText(Double.toString(compoundInterest.calculateCompoundInterest(principle1,rate1,year1)));
                    return;
            }
        }






    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}




