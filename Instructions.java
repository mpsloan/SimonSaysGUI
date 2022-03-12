// This is the instructions GUI class
import java.awt.event.*;
import javax.swing.*;

public class Instructions {
    /* variable that checks the user's agreement initialized to false
    set to static so it can be called in main */
    private static boolean agreement = false;

    public Instructions() {
        // initializing frame, panel and layout to box layout
        JFrame frame = new JFrame("Instructions: SimonSays!");
        JPanel panel = new JPanel();
        BoxLayout layout = new BoxLayout(panel, BoxLayout.Y_AXIS);
        // labels that contain the instructions
        JLabel instructions = new JLabel("Pay close attention to the highlighted color pattern. Once the pattern is over, replicate the exact order.");
        JLabel instructionsCont = new JLabel("If you get the question wrong the game will end, if you get it correct you will move on. Good luck!");
        // button that agrees to terms
        JButton button = new JButton("Ok");
        // action listener that sets the agreement variable to true, and disposes the instructions frame
        button.addActionListener((ActionListener) new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agreement = true;
                frame.dispose();
            }
        });

        // setting everything to the panel
        panel.setLayout(layout);
        panel.add(instructions);
        panel.add(instructionsCont);
        panel.add(button);

        // initializing the frame
        frame.getContentPane().add(panel);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(650, 105);
        frame.setVisible(true); 
        
    }

    // method to return agreement variable in other classes
    public static boolean userAgreement() {
        return agreement;
    }
}