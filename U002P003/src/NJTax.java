/**
 * Created by mqc647 on 26.07.2016.
 */
public class NJTax extends Tax {

    //Default Constructor
    NJTax(){
        super();
    }
    //Constructor
    NJTax(double gi, int depen) {
        grossIncome = gi;
        state = "New York";
        depen = depen;
    }

    //Super constractor
    NJTax (double gi, String st, int depen){
        super(gi,st,depen);
    }

    double adjustForStudents (double stateTax){
        double adjustedTax = stateTax - 500;
        return adjustedTax;
    }

    public double calcTax(){
        if (grossIncome < 50000){
            return grossIncome*0.10;
        }else{
            return grossIncome*0.13;
        }
    }
}
