/**
 * Created by mqc647 on 26.07.2016.
 */
public class Tax {
    int numberOfDependents;
    double grossIncome;
    String state;
    int dependents;

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
