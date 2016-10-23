import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Ulko on 23.10.2016.
 */
public class CalculateEngine implements ActionListener {

    BorderL BorderParent;

    CalculateEngine(BorderL parent){
        BorderParent = parent;
    }

    GridBag GridBagParent;

    CalculateEngine(GridBag parent){
        GridBagParent = parent;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        JButton clickedButton = (JButton) e.getSource();

        String clickedButtonLabel  = clickedButton.getText();

        String displayFieldText = GridBagParent.getDisplayFieldValue();

        GridBagParent.setDisplayFieldValue(displayFieldText+clickedButtonLabel);

    }
}
