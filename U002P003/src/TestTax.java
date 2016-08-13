import ru.ulkowhitehorse.tax.NJTax;

public class TestTax {
    public static void main(String[] args) {

        //ru.ulkowhitehorse.tax.Tax t = new ru.ulkowhitehorse.tax.Tax();
        NJTax t = new NJTax();
        t.grossIncome = Integer.parseInt(args[0]);
        t.state = args[1];
        t.dependents = Integer.parseInt(args[2]);

        double yourTax = t.calcTax();

        double njt = t.adjustForStudents(yourTax);

        System.out.println("Your state " + t.state);
        System.out.println("Your tax " + String.format("%.0f", njt));

    }
}
