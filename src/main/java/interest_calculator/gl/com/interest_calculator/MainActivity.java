package interest_calculator.gl.com.interest_calculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static android.view.View.OnClickListener;


public class MainActivity extends Activity implements OnClickListener {
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
    public SimpleInterest simpleInterest;
    public CompoundInterest compoundInterest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.savedInstanceState = savedInstanceState;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.userInputs();


    }
    public void userInputs() {
        this.mPrincipleAmount = (TextView) findViewById(R.id.PA);
        this.mInterestRate = (TextView) findViewById(R.id.Interest_Rate);
        this.mYears = (TextView) findViewById(R.id.Years);
        this.mPrincipleAmt_bar = (EditText) findViewById(R.id.PA_bar);
        this.mInterestRate_bar = (EditText) findViewById(R.id.IR_bar);
        this.myear_bar = (EditText) findViewById(R.id.year_bar);
        this.t1 = (TextView) findViewById(R.id.t1);
        findViewById(R.id.btn_SimpleInterest).setOnClickListener(this);
        findViewById(R.id.btn_CompoundInterest).setOnClickListener(this);
        }

    float principle = Float.parseFloat(mPrincipleAmt_bar.getText().toString());
    float rate = Float.parseFloat(mInterestRate_bar.getText().toString());
    float year = Float.parseFloat(myear_bar.getText().toString());

       /* SimpleInterest.setOnClickListener(new View.OnClickListener()
        {*/
        public void onClick (View v){
            switch (v.getId()) {
                case R.id.btn_SimpleInterest:
                    t1.setText(Float.toString(simpleInterest.calculateSimpleInterest(principle,rate,year)));
                    return;
                case R.id.btn_CompoundInterest:
                   t1.setText(Double.toString(compoundInterest.calculateCompoundInterest(principle,rate,year)));
                    return;
            }
        }






    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}




