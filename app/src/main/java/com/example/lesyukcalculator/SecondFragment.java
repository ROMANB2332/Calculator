package com.example.lesyukcalculator;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

public class SecondFragment extends Fragment implements View.OnClickListener {

    Double chislo;
    TextView result;
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    Button button9;
    Button button0;
    Button buttonAdd;
    Button buttonSub;
    Button buttonMul;
    Button buttonDiv;
    Button buttonEnd;
    Button buttonKoma;
    Button buttonClear;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        View view =   inflater.inflate(R.layout.fragment_second,container,false);
        result = (TextView) view.findViewById(R.id.result);

        button1 = (Button) view.findViewById(R.id.button1);
        button2 = (Button) view.findViewById(R.id.button2);
        button3 = (Button) view.findViewById(R.id.button3);
        button4 = (Button) view.findViewById(R.id.button4);
        button5 = (Button) view.findViewById(R.id.button5);
        button6 = (Button) view.findViewById(R.id.button6);
        button7 = (Button) view.findViewById(R.id.button7);
        button8 = (Button) view.findViewById(R.id.button8);
        button9 = (Button) view.findViewById(R.id.button9);
        button0 = (Button) view.findViewById(R.id.button10);
        buttonAdd = (Button) view.findViewById(R.id.buttonAdd);
        buttonSub = (Button) view.findViewById(R.id.buttonSub);
        buttonMul = (Button) view.findViewById(R.id.buttonMul);
        buttonDiv = (Button) view.findViewById(R.id.buttonDiv);
        buttonEnd = (Button) view.findViewById(R.id.buttonEnd);
        buttonKoma = (Button) view.findViewById(R.id.buttonKoma);
        buttonClear = (Button) view.findViewById(R.id.buttonClear);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);
        button0.setOnClickListener(this);
        buttonAdd.setOnClickListener(this);
        buttonSub.setOnClickListener(this);
        buttonMul.setOnClickListener(this);
        buttonDiv.setOnClickListener(this);
        buttonEnd.setOnClickListener(this);
        buttonKoma.setOnClickListener(this);
        buttonClear.setOnClickListener(this);

        return view;
    }



    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button1: result.setText(result.getText() + "1"); break;
            case R.id.button2: result.setText(result.getText() + "2"); break;
            case R.id.button3: result.setText(result.getText() + "3"); break;
            case R.id.button4: result.setText(result.getText() + "4"); break;
            case R.id.button5: result.setText(result.getText() + "5"); break;
            case R.id.button6: result.setText(result.getText() + "6"); break;
            case R.id.button7: result.setText(result.getText() + "7"); break;
            case R.id.button8: result.setText(result.getText() + "8"); break;
            case R.id.button9: result.setText(result.getText() + "9"); break;
            case R.id.button10: result.setText(result.getText() + "0"); break;
            case R.id.buttonAdd: result.setText(result.getText() + "  +  "); break;
            case R.id.buttonSub: result.setText(result.getText() + "  -  "); break;
            case R.id.buttonMul: result.setText(result.getText() + "  *  "); break;
            case R.id.buttonDiv: result.setText(result.getText() + "  %  "); break;
            case R.id.buttonKoma: result.setText(result.getText() + "."); break;

            case R.id.buttonEnd:
                transToStr enter = new transToStr();
                chislo = enter.Calculate_str(new StringBuilder(result.getText()));
                result.setText(result.getText() + "  =  " + chislo.toString());
                break;

            case R.id.buttonClear: result.setText(" "); break;
        }
    }
}
