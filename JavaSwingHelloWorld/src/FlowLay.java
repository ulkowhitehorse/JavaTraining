
//FlowLay With FlowLayout

import javax.swing.*;
import java.awt.*;

public class FlowLay {
    public static void main(String[] args) {
        // 1. Create a panel
        JPanel windowContent = new JPanel();

        // 2. Set a layout manager for this panel

        FlowLayout fl = new FlowLayout();
//        GridLayout fl = new GridLayout(4,2);

        windowContent.setLayout(fl);

        // 3. Create controls in memory
        // Только создаются инстансы в памяти, никто ничего не думает
        JLabel label1 = new JLabel("Number 1:");
        JTextField field1 = new JTextField(10); // длина 10 символов
        JLabel label2 = new JLabel("Number 2:");
        JTextField field2 = new JTextField(10);
        JLabel label3 = new JLabel("Sum:");
        JTextField result = new JTextField(10);
        JButton go = new JButton("Add");

        // 4. Add controls to the panel
        // Размещение происходит по методу FlowLayout

        windowContent.add(label1);
        windowContent.add(field1);
        windowContent.add(label2);
        windowContent.add(field2);
        windowContent.add(label3);
        windowContent.add(result);
        windowContent.add(go);

        // 5. Create the frame and add the panel to it
        // Создаем внешний контейнер JFrame
        JFrame frame = new JFrame("My First calculator");

        // 6. Add the panel to top-level container
        frame.setContentPane(windowContent);

        // 7. Set the size and make the window visible
        frame.setSize(400,100);
        frame.setResizable(true);
        frame.setVisible(true);
    }
}
