import javax.swing.*;

/**
 * Created by Ulko on 23.10.2016.
 */
public class HelloWorld extends JFrame {

    public HelloWorld(){
        setSize(300,300);
        setTitle("Hello World");

        JButton myButton = new JButton("Click me");
        add(myButton);

        setVisible(true);

    }

    public static void main(String[] args) {
        HelloWorld myHello = new HelloWorld();
    }
}
