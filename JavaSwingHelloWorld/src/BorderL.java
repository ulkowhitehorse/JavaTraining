import javax.swing.*;
import java.awt.*;

public class BorderL {

    private CalculateEngine calcEngine = new CalculateEngine(this);

    // 3. Create controls in memory
    // Только создаются инстансы в памяти, никто ничего не думает
    private JTextField textField = new JTextField();
    public void setTextFieldValue(String value){
        textField.setText(value);
    }
    public String getTextFieldValue(){
        return textField.getText();
    }

    JButton b1 = new JButton("1");
    JButton b2 = new JButton("2");
    JButton b3 = new JButton("3");
    JButton b4 = new JButton("4");
    JButton b5 = new JButton("5");
    JButton b6 = new JButton("6");
    JButton b7 = new JButton("7");
    JButton b8 = new JButton("8");
    JButton b9 = new JButton("9");



        public BorderL() {
            // 1. Create a panel

            JPanel windowContent = new JPanel(); // Все вместе
            JPanel buttonsContent = new JPanel(); // Только кнопки


            // 2. Set a layout manager for this panel

            BorderLayout bl = new BorderLayout();
            GridLayout gl = new GridLayout(3, 3);

            windowContent.setLayout(bl);
            buttonsContent.setLayout(gl);


            // 4. Add controls to the panel
            // Размещение происходит по методу Grid Layout

            buttonsContent.add(b1);
            buttonsContent.add(b2);
            buttonsContent.add(b3);
            buttonsContent.add(b4);
            buttonsContent.add(b5);
            buttonsContent.add(b6);
            buttonsContent.add(b7);
            buttonsContent.add(b8);
            buttonsContent.add(b9);

            //Actions
            CalculateEngine calcEngine = new CalculateEngine(this);
            b1.addActionListener(calcEngine);
            b2.addActionListener(calcEngine);
            b3.addActionListener(calcEngine);
            b4.addActionListener(calcEngine);
            b5.addActionListener(calcEngine);
            b6.addActionListener(calcEngine);
            b7.addActionListener(calcEngine);
            b8.addActionListener(calcEngine);
            b9.addActionListener(calcEngine);



            windowContent.add(textField, BorderLayout.NORTH);
            windowContent.add(buttonsContent, BorderLayout.CENTER);


            // 5. Create the frame and add the panel to it
            // Создаем внешний контейнер JFrame
            JFrame frame = new JFrame("My First calculator");

            // 6. Add the panel to top-level container
            frame.setContentPane(windowContent);

            // 7. Set the size and make the window visible
            frame.setSize(300, 400);
            frame.setResizable(true);
            frame.setVisible(true);

        }

    public static void main(String[] args) {
        new BorderL();
    }
}
