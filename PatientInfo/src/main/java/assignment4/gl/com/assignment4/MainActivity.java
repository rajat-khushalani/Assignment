package assignment4.gl.com.assignment4;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    private TextView mFirstName;
    private TextView mLastName;
    private TextView mValue;
    private TextView mDateOfBirth;
    private TextView mDiagnostic;
    private Spinner  mDiagnosticSpinner;
    private Spinner  mDateOfBirthSpinner;
    private EditText mFirstName_Bar;
    private EditText mLastName_Bar;
    private EditText mValue_Bar;
    private Button  mSave;
    private android.R.attr evt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.userInputs();
        this.setmDiagnosticSpinner();
        this.setmDateOfBirthSpinner();
        //this.diagnosticList();
        mSave.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
                 AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                alertDialog.setTitle("Patient Information");
                alertDialog.setMessage("Patient Name:"+mFirstName_Bar.getText().toString()+"\t"+mLastName_Bar.getText().toString()+"\n"+"Diagnostic:"+
                mDiagnosticSpinner.getSelectedItem().toString()+"\n"+"Date Of Birth:"+mDateOfBirthSpinner.getSelectedItem().toString());
                alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "Close", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }


                });
                alertDialog.show();
            }
        });



        

    }
    public void userInputs() {
        this.mFirstName = (TextView) findViewById(R.id.tv_first_name);
        this.mLastName = (TextView) findViewById(R.id.tv_Last_Name);
        this.mValue = (TextView) findViewById(R.id.tv_Value);
        this.mDateOfBirth= (TextView) findViewById(R.id.tv_DOB);
        this.mDiagnostic = (TextView) findViewById(R.id.tv_Diagnostic);
        this.mDiagnosticSpinner = (Spinner) findViewById(R.id.sp_Diagnostic);
        this.mDateOfBirthSpinner = (Spinner) findViewById(R.id.sp_DOB);
        this.mFirstName_Bar=(EditText)findViewById(R.id.et_first_name);
        this.mLastName_Bar=(EditText)findViewById(R.id.et_Last_Name);
        this.mValue_Bar = (EditText)findViewById(R.id.et_Value);
        this.mSave = (Button) findViewById(R.id.btn_Save);

    }
    public void setmDiagnosticSpinner(){
        ArrayList<String> Diagnostic = new ArrayList<String>();
        Diagnostic.add("Cold");
        Diagnostic.add("fever");
        Diagnostic.add("Body Ache");
        Diagnostic.add("Head Ache");
        Diagnostic.add("Other");
        //mDiagnosticSpinner.setOnItemClickListener(this);
        //selected item will look like a spinner set from XML
        mDiagnosticSpinner.setOnItemSelectedListener(this);
        ArrayAdapter<String> diagnosticAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, Diagnostic);
        diagnosticAdapter.setDropDownViewResource(android.R.layout
                .simple_spinner_dropdown_item);
        mDiagnosticSpinner.setAdapter(diagnosticAdapter);

    }
    public void setmDateOfBirthSpinner(){
        ArrayList<String> DateOfBirth = new ArrayList<String>();
        DateOfBirth.add("Feb 11 1995");
        DateOfBirth.add("Mar 23 1996");
        DateOfBirth.add("Jan 22 1995");
        DateOfBirth.add("Dec 24 1994");
        DateOfBirth.add("Nov 22 1993");
       // mDiagnosticSpinner.setOnItemClickListener(this);
        //selected item will look like a spinner set from XML
        ArrayAdapter<String> dateOfBirthAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, DateOfBirth);
        dateOfBirthAdapter.setDropDownViewResource(android.R.layout
                .simple_spinner_dropdown_item);
        mDateOfBirthSpinner.setAdapter(dateOfBirthAdapter);
    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String text = parent.getItemAtPosition(position).toString();
        if("other".equalsIgnoreCase(text)){
            mValue.setVisibility(View.VISIBLE);
            mValue_Bar.setVisibility(View.VISIBLE);
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
