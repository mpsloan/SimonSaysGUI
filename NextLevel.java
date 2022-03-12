// class for GUI that lets the user know they passed the current level
import java.awt.event.*;
import javax.swing.*;

public class NextLevel {
    // static variable that checks if the next round button has been clicked
    private static boolean clicked = false;
    // passes in the number of colors to let the user know how many they will have to remember
    public NextLevel(int numColors) {
        // initializing the frame and panel, setting the layout to BoxLayout
        JFrame frame = new JFrame("SimonSays!");
        JPanel panel = new JPanel();
        BoxLayout layout = new BoxLayout(panel, BoxLayout.Y_AXIS);
        // labels that congratulate the the user
        JLabel label = new JLabel("Congratulations, you have passed the current level!");
        JLabel label2 = new JLabel("You will now have to remember " +numColors+ " colors.");
        // button that lets the user go to the next round
        JButton button = new JButton("Next Round");
        JLabel image = new JLabel();
        // smiley face that causes change in visual element to meet rubric requirement
        ImageIcon pic = new ImageIcon("smile.png");
        image.setIcon(pic);
        // action listener for button
        button.addActionListener((ActionListener) new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // disposing the frame and changing clicked to true when button is pressed
                frame.dispose();
                clicked = true;
            }
        });
          
        // adding the components to panel
        panel.setLayout(layout);
        panel.add(label);
        panel.add(label2);
        panel.add(button);
        panel.add(image);
        // initializing the frame
        frame.getContentPane().add(panel);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(500, 300);
        frame.setVisible(true); 
    }

    // static method that returns the value of clicked and is called in SimonSays.java
    public static boolean clicked() {
        return clicked;
    }
}