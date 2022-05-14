package com.jayantapp.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

        public void currencyConverter(View view)
        {
            Log.i(  "Info","Button Pressed");
            EditText amountinEuros=(EditText)findViewById(R.id.editTextNumberDecimal);
            Log.i("Amount Entered",amountinEuros.getText().toString());
            String amountinEurosString=amountinEuros.getText().toString();
            Double amountInDollars=Double.parseDouble(amountinEurosString)*1.12;
            Log.i("Amount in Euros",amountinEurosString);
            String amountInDollarsString=String.format("%.2f", amountInDollars);
            Log.i("Amount in Dollars",amountInDollarsString);
            Toast.makeText(this," Amount in $ is "+amountInDollarsString,Toast.LENGTH_LONG).show();
        }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}