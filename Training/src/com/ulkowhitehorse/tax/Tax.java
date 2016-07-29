package com.ulkowhitehorse.tax;

public class Tax {
    public double grossIncome;
    public String state;
    public int dependents;

    //Constructor
    Tax (double gi, String st, int depen){
        grossIncome = gi;
        state = st;
        dependents = depen;
    }

    public Tax() {
    }

    public double calcTax(){
        if (grossIncome < 50000){
            return grossIncome*0.06;
        }else{
            return grossIncome*0.08;
        }
    }
}
