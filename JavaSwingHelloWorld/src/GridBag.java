import javax.swing.*;
import java.awt.*;

public class GridBag {



    private JTextField displayField;

    public void setDisplayFieldValue(String value){

        displayField.setText(value);
    }

    public String getDisplayFieldValue(){
        return displayField.getText();
    }


    private JButton b1;
    private JButton b2;
    private JButton b3;
    private JButton b4;
    private JButton b5;
    private JButton b6;
    private JButton b7;
    private JButton b8;
    private JButton b9;

    JPanel windowContent;


    GridBag() {

            // Set the GridBagLayout for the window’s content pane
            windowContent = new JPanel();

            GridBagLayout gb = new GridBagLayout();

            windowContent.setLayout(gb);

            displayField = new JTextField();

            // Create an instance of the GridBagConstraints!
            // You’ll have to repeat these lines for each component!
            // that you’d like to add to the grid cell!
            GridBagConstraints constrText = new GridBagConstraints();

            //set constraints for the FlowLay’s displayField:

            constrText.gridx = 0; // x coordinate of the cell
            constrText.gridy = 0; // y coordinate of the cell

            // this cell has the same height as others
            constrText.gridheight = 1;

            // this cell is as wide as 6 others
            constrText.gridwidth = 3;

            // fill all space in the cell
            constrText.fill = constrText.BOTH;

            // proportion of horizontal space taken by this
            // component
            constrText.weightx = 1.0;

            // proportion of vertical space taken by this
            // component
            constrText.weighty = 1.0;

            // position of the component within the cell!
            constrText.anchor = constrText.CENTER;


            // set constrains for this field
            gb.setConstraints(displayField, constrText);

            // add the text field to the window
            windowContent.add(displayField);



            CalculateEngine calcEngine = new CalculateEngine(this);
            // Button 7

            GridBagConstraints constr7 = new GridBagConstraints();

            //set constraints for the FlowLay’s displayField:

            constr7.gridx = 0; // x coordinate of the cell
            constr7.gridy = 1; // y coordinate of the cell

            // this cell has the same height as others
            constr7.gridheight = 1;

            // this cell is as wide as 6 others
            constr7.gridwidth = 1;

            // fill all space in the cell
            constr7.fill = constr7.BOTH;

            // proportion of horizontal space taken by this
            // component
            constr7.weightx = 1.0;

            // proportion of vertical space taken by this
            // component
            constr7.weighty = 1.0;

            // position of the component within the cell!
            constr7.anchor = constr7.CENTER;

            b7 = new JButton("7");

            // set constrains for this field
            gb.setConstraints(b7, constr7);

            // add the text field to the window
            windowContent.add(b7);

            // Add listener
            b7.addActionListener(calcEngine);


            // Button 8

            GridBagConstraints constr8 = new GridBagConstraints();

            //set constraints for the FlowLay’s displayField:

            constr8.gridx = 1; // x coordinate of the cell
            constr8.gridy = 1; // y coordinate of the cell

            // this cell has the same height as others
            constr8.gridheight = 1;

            // this cell is as wide as 6 others
            constr8.gridwidth = 1;

            // fill all space in the cell
            constr8.fill = constr8.BOTH;

            // proportion of horizontal space taken by this
            // component
            constr8.weightx = 1.0;

            // proportion of vertical space taken by this
            // component
            constr8.weighty = 1.0;

            // position of the component within the cell!
            constr8.anchor = constr8.CENTER;

            b8 = new JButton("8");


            // set constrains for this field
            gb.setConstraints(b8, constr8);

            // add the text field to the window
            b8.addActionListener(calcEngine);
            windowContent.add(b8);


            // Button 9

            GridBagConstraints constr9 = new GridBagConstraints();

            //set constraints for the FlowLay’s displayField:

            constr9.gridx = 2; // x coordinate of the cell
            constr9.gridy = 1; // y coordinate of the cell

            // this cell has the same height as others
            constr9.gridheight = 1;

            // this cell is as wide as 6 others
            constr9.gridwidth = 1;

            // fill all space in the cell
            constr9.fill = constr9.BOTH;

            // proportion of horizontal space taken by this
            // component
            constr9.weightx = 1.0;

            // proportion of vertical space taken by this
            // component
            constr9.weighty = 1.0;

            // position of the component within the cell!
            constr9.anchor = constr9.CENTER;

            b9 = new JButton("9");


            // set constrains for this field
            gb.setConstraints(b9, constr9);

            // add the text field to the window
            windowContent.add(b9);
            b9.addActionListener(calcEngine);

            // Button 4

            GridBagConstraints constr4 = new GridBagConstraints();

            //set constraints for the FlowLay’s displayField:

            constr4.gridx = 0; // x coordinate of the cell
            constr4.gridy = 2; // y coordinate of the cell

            // this cell has the same height as others
            constr4.gridheight = 1;

            // this cell is as wide as 6 others
            constr4.gridwidth = 1;

            // fill all space in the cell
            constr4.fill = constr4.BOTH;

            // proportion of horizontal space taken by this
            // component
            constr4.weightx = 1.0;

            // proportion of vertical space taken by this
            // component
            constr4.weighty = 1.0;

            // position of the component within the cell!
            constr4.anchor = constr4.CENTER;

            b4 = new JButton("4");


            // set constrains for this field
            gb.setConstraints(b4, constr4);

            // add the text field to the window
            windowContent.add(b4);
            b4.addActionListener(calcEngine);

            // Button 5

            GridBagConstraints constr5 = new GridBagConstraints();

            //set constraints for the FlowLay’s displayField:

            constr5.gridx = 1; // x coordinate of the cell
            constr5.gridy = 2; // y coordinate of the cell

            // this cell has the same height as others
            constr5.gridheight = 1;

            // this cell is as wide as 6 others
            constr5.gridwidth = 1;

            // fill all space in the cell
            constr5.fill = constr5.BOTH;

            // proportion of horizontal space taken by this
            // component
            constr5.weightx = 1.0;

            // proportion of vertical space taken by this
            // component
            constr5.weighty = 1.0;

            // position of the component within the cell!
            constr5.anchor = constr5.CENTER;

            b5 = new JButton("5");


            // set constrains for this field
            gb.setConstraints(b5, constr5);

            // add the text field to the window
            windowContent.add(b5);
            b5.addActionListener(calcEngine);


            // Button 6

            GridBagConstraints constr6 = new GridBagConstraints();

            //set constraints for the FlowLay’s displayField:

            constr6.gridx = 2; // x coordinate of the cell
            constr6.gridy = 2; // y coordinate of the cell

            // this cell has the same height as others
            constr6.gridheight = 1;

            // this cell is as wide as 6 others
            constr6.gridwidth = 1;

            // fill all space in the cell
            constr6.fill = constr6.BOTH;

            // proportion of horizontal space taken by this
            // component
            constr6.weightx = 1.0;

            // proportion of vertical space taken by this
            // component
            constr6.weighty = 1.0;

            // position of the component within the cell!
            constr6.anchor = constr6.CENTER;

            b6 = new JButton("6");


            // set constrains for this field
            gb.setConstraints(b6, constr6);

            // add the text field to the window
            windowContent.add(b6);
            b6.addActionListener(calcEngine);

            // Button 1

            GridBagConstraints constr1 = new GridBagConstraints();

            //set constraints for the FlowLay’s displayField:

            constr1.gridx = 0; // x coordinate of the cell
            constr1.gridy = 3; // y coordinate of the cell

            // this cell has the same height as others
            constr1.gridheight = 1;

            // this cell is as wide as 6 others
            constr1.gridwidth = 1;

            // fill all space in the cell
            constr1.fill = constr1.BOTH;

            // proportion of horizontal space taken by this
            // component
            constr1.weightx = 1.0;

            // proportion of vertical space taken by this
            // component
            constr1.weighty = 1.0;

            // position of the component within the cell!
            constr1.anchor = constr1.CENTER;

            b1 = new JButton("1");


            // set constrains for this field
            gb.setConstraints(b1, constr1);

            // add the text field to the window
            windowContent.add(b1);
            b1.addActionListener(calcEngine);


            // Button 2

            GridBagConstraints constr2 = new GridBagConstraints();

            //set constraints for the FlowLay’s displayField:

            constr2.gridx = 1; // x coordinate of the cell
            constr2.gridy = 3; // y coordinate of the cell

            // this cell has the same height as others
            constr2.gridheight = 1;

            // this cell is as wide as 6 others
            constr2.gridwidth = 1;

            // fill all space in the cell
            constr2.fill = constr2.BOTH;

            // proportion of horizontal space taken by this
            // component
            constr2.weightx = 1.0;

            // proportion of vertical space taken by this
            // component
            constr2.weighty = 1.0;

            // position of the component within the cell!
            constr2.anchor = constr2.CENTER;

            b2 = new JButton("2");


            // set constrains for this field
            gb.setConstraints(b2, constr2);

            // add the text field to the window
            windowContent.add(b2);
            b2.addActionListener(calcEngine);

            // Button 3

            GridBagConstraints constr3 = new GridBagConstraints();

            //set constraints for the FlowLay’s displayField:

            constr3.gridx = 2; // x coordinate of the cell
            constr3.gridy = 3; // y coordinate of the cell

            // this cell has the same height as others
            constr3.gridheight = 1;

            // this cell is as wide as 6 others
            constr3.gridwidth = 1;

            // fill all space in the cell
            constr3.fill = constr3.BOTH;

            // proportion of horizontal space taken by this
            // component
            constr3.weightx = 1.0;

            // proportion of vertical space taken by this
            // component
            constr3.weighty = 1.0;

            // position of the component within the cell!
            constr3.anchor = constr3.CENTER;

            b3 = new JButton("3");


            // set constrains for this field
            gb.setConstraints(b3, constr3);

            // add the text field to the window
            windowContent.add(b3);
            b3.addActionListener(calcEngine);

            // 5. Create the frame and add the panel to it
            // Создаем внешний контейнер JFrame
            JFrame frame = new JFrame("My First calculator");

            // 6. Add the panel to top-level container
            frame.setContentPane(windowContent);

            // 7. Set the size and make the window visible
            frame.setSize(400, 300);
            frame.setResizable(true);
            frame.setVisible(true);

        }

    public static void main(String[] args) {
        new GridBag();
    }

}
