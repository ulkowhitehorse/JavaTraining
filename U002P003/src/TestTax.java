/**
 * Created by mqc647 on 26.07.2016.
 */
public class TestTax {
    public static void main(String[] args) {

        //Tax t = new Tax();
        NJTax t = new NJTax(40000,"NJ",2);

        double yourTax = t.calcTax();

        double njt = t.adjustForStudents(yourTax);

        System.out.println("Your state " + t.state);
        System.out.println("Your tax " + String.format("%.0f", njt));

    }
}
