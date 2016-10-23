import javax.swing.*;

/**
 * Created by Ulko on 23.10.2016.
 */
public class Calculator {
    private JTextField displayField;

    public void setDisplayValue(String val){
        displayField.setText(val);
    }

    public String getDisplayValue(){
        return displayField.getText();
    }
}
