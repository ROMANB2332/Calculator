package com.example.lesyukcalculator;

public class Calculator {
    private double num1;
    private double num2;
    private  double result;

    Calculator(String arg1, String arg2){
        setNum1(Double.parseDouble(arg1));
        setNum2(Double.parseDouble(arg2));
    }
    private void setNum1(double value){
        num1 = value;
    }
    public double getNum1(){
        return num1;
    }

    private void setNum2(double value){
        num2 = value;
    }
    public double getNum2(){
        return num2;
    }


    public double Add(){
        result = num1 + num2;
        return result;
    }

    public double Sub(){
        result = num1 - num2;
        return result;
    }
    public double Mul(){
        result = num1 * num2;
        return result;
    }
    public double Div(){
        result = num1 / num2;
        return result;
    }


}
