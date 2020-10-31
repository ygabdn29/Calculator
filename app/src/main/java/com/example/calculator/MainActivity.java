package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    protected EditText editTextscreen;
    protected Button num0, num1, num2, num3, num4, num5, num6, num7, num8, num9;
    protected Button buttonAdd, buttonMinus, buttonDivision, buttonMulti, buttonDecimal;
    protected Button buttonClear, buttonResult;

    protected double currentTemp;
    protected int operationSelection;
    protected double result;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    void init()
    {
        editTextscreen = (EditText)findViewById(R.id.editTextScr);

        num0 = (Button)findViewById(R.id.num0);
        num0.setOnClickListener(this);

        num1 = (Button)findViewById(R.id.num1);
        num1.setOnClickListener(this);

        num2 = (Button)findViewById(R.id.num2);
        num2.setOnClickListener(this);

        num3 = (Button)findViewById(R.id.num3);
        num3.setOnClickListener(this);

        num4 = (Button)findViewById(R.id.num4);
        num4.setOnClickListener(this);

        num5 = (Button)findViewById(R.id.num5);
        num5.setOnClickListener(this);

        num6 = (Button)findViewById(R.id.num6);
        num6.setOnClickListener(this);

        num7 = (Button)findViewById(R.id.num7);
        num7.setOnClickListener(this);

        num8 = (Button)findViewById(R.id.num8);
        num8.setOnClickListener(this);

        num9 = (Button)findViewById(R.id.num9);
        num9.setOnClickListener(this);


        buttonAdd = (Button)findViewById(R.id.opAdd);
        buttonAdd.setOnClickListener(this);

        buttonMinus = (Button)findViewById(R.id.opMin);
        buttonMinus.setOnClickListener(this);

        buttonMulti = (Button)findViewById(R.id.opMulti);
        buttonMulti.setOnClickListener(this);

        buttonDivision = (Button)findViewById(R.id.opDiv);
        buttonDivision.setOnClickListener(this);

        buttonDecimal = (Button)findViewById(R.id.buttonDecimal);
        buttonDecimal.setOnClickListener(this);

        buttonClear = (Button)findViewById(R.id.buttonClear);
        buttonClear.setOnClickListener(this);

        buttonResult = (Button)findViewById(R.id.buttonRes);
        buttonResult.setOnClickListener(this);

        buttonDecimal = (Button)findViewById(R.id.buttonDecimal);
        buttonDecimal.setOnClickListener(this);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onClick(View v)
    {
        switch(v.getId())
        {
            case R.id.num0:
                editTextscreen.setText(editTextscreen.getText().toString().trim()+"0");
                break;
            case R.id.num1:
                editTextscreen.setText(editTextscreen.getText().toString().trim()+"1");
                break;
            case R.id.num2:
                editTextscreen.setText(editTextscreen.getText().toString().trim()+"2");
                break;
            case R.id.num3:
                editTextscreen.setText(editTextscreen.getText().toString().trim()+"3");
                break;
            case R.id.num4:
                editTextscreen.setText(editTextscreen.getText().toString().trim()+"4");
                break;
            case R.id.num5:
                editTextscreen.setText(editTextscreen.getText().toString().trim()+"5");
                break;
            case R.id.num6:
                editTextscreen.setText(editTextscreen.getText().toString().trim()+"6");
                break;
            case R.id.num7:
                editTextscreen.setText(editTextscreen.getText().toString().trim()+"7");
                break;
            case R.id.num8:
                editTextscreen.setText(editTextscreen.getText().toString().trim()+"8");
                break;
            case R.id.num9:
                editTextscreen.setText(editTextscreen.getText().toString().trim()+"9");
                break;
            case R.id.buttonClear:
                editTextscreen.setText("");
                break;
            case R.id.buttonDecimal:
                editTextscreen.setText(editTextscreen.getText().toString().trim()+".");
                break;


            case R.id.opAdd:
                operationSelection = 1;
                currentTemp = Double.parseDouble(editTextscreen.getText().toString());
                editTextscreen.setText("");
                break;
            case R.id.opMin:
                operationSelection = 2;
                currentTemp = Double.parseDouble(editTextscreen.getText().toString());
                editTextscreen.setText("");
                break;
            case R.id.opMulti:
                operationSelection = 3;
                currentTemp = Double.parseDouble(editTextscreen.getText().toString());
                editTextscreen.setText("");
                break;
            case R.id.opDiv:
                operationSelection = 4;
                currentTemp = Double.parseDouble(editTextscreen.getText().toString());
                editTextscreen.setText("");
                break;
            case R.id.buttonRes:
                if(operationSelection == 1)
                {
                        result = currentTemp + Double.parseDouble(editTextscreen.getText().toString().trim());
                }
                if(operationSelection == 2)
                {
                    result = currentTemp - Double.parseDouble(editTextscreen.getText().toString().trim());
                }
                if(operationSelection == 3)
                {
                    result = currentTemp * Double.parseDouble(editTextscreen.getText().toString().trim());
                }
                if(operationSelection == 4)
                {
                    result = currentTemp / Double.parseDouble(editTextscreen.getText().toString().trim());
                }
                int tempResult = (int) result;
                if(tempResult == result)
                {
                    editTextscreen.setText(String.valueOf((int)result));
                }
                else
                {
                    editTextscreen.setText(String.valueOf(result));
                }

        }
    }
}