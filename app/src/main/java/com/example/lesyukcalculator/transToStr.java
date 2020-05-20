package com.example.lesyukcalculator;

public class transToStr {
    private String Start_string, operation;
    private int temp;
    Calculator result;
    private double resultat;
    int dia = -1;

    public double Calculate_str(StringBuilder str){

        StringBuilder test = str;
        do {
            temp = test.indexOf(" ");
            if(temp != -1) test.deleteCharAt(temp);
        }while(temp != -1);

        Start_string = test.toString();
        while(dia == -1){
            dia = Start_string.indexOf("+");
            if(dia > -1) break;
            dia = Start_string.indexOf("-");
            if(dia > -1) break;
            dia = Start_string.indexOf("*");
            if(dia > -1) break;
            dia = Start_string.indexOf("/");
            if(dia > -1) break;
        }
        operation = Start_string.substring(dia,dia+1);
        System.out.print(test);

        String Number[] = Start_string.split("[+/*-]+");
        result = new Calculator(Number[0],Number[1]);


        switch (operation){
            case "+": resultat = result.Add();
                break;
            case "-": resultat = result.Sub();
                break;
            case "*": resultat = result.Mul();
                break;
            case "%": resultat = result.Div();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + operation);
        }

        return resultat;

    }

}
