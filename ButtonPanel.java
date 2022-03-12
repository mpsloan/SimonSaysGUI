// JPanel class that holds the buttons and adds them to an ArrayList
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;

public class ButtonPanel extends JPanel {

    // constructor that passes in 2 ArrayLists
    public ButtonPanel(ArrayList<Color> colors, ArrayList<Color> userInput) {
        // for each loop that cycles through each button
        for (Color color: colors) {
            // adding the color to the panel
            add(color);
            // adding an action listener to each button
            color.addActionListener((ActionListener) new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                    // adds the color to an ArrayList once it is clicked
                    userInput.add(color);
                }
            });
        }
        // setting the layout of the panel to grid layout with 1 row and 4 columns
        setLayout(new GridLayout(0, 4));
    }
}