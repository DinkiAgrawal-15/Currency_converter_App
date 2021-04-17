package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText=(EditText)findViewById(R.id.editText);
    }

    public void convertcurr(View view) {
        String amountInpounds=editText.getText().toString();
        double amountInpoundsDouble=Double.parseDouble(amountInpounds);
        double amountInDollarsDouble=amountInpoundsDouble*76.73;
        String amountInDollarsString=String.format("%.2f",amountInDollarsDouble);
        Toast.makeText(this,"$"+amountInpounds+"is RS"+ amountInDollarsString,Toast.LENGTH_SHORT).show();


    }
}
