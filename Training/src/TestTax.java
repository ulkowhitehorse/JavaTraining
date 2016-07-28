import ru.ulkowhitehorse.Tax.Tax;

import javax.swing.plaf.synth.SynthEditorPaneUI;

public class TestTax {
    public static void main(String[] args) {

        if (args.length != 3){
            System.out.println("Sample usage of the program:" + " java TestTax 5000 LA 2");
            System.exit(0);
        }

        Tax t = new Tax();
        t.grossIncome = Double.parseDouble(args[0]);
        t.state = args[1];
        t.dependents = Integer.parseInt(args[2]);

        double yourTax = t.calcTax();

        System.out.println("Your state " + t.state);
        System.out.println("Your tax " + String.format("%.0f", yourTax));

    }
}
