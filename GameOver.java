// GUI that lets the user know the game is over
import javax.swing.*;

public class GameOver {

    public GameOver() {
        // declaring the frame, panel, layout and label
        JFrame frame = new JFrame("SimonSays!");
        JPanel panel = new JPanel();
        BoxLayout layout = new BoxLayout(panel, BoxLayout.Y_AXIS);
        JLabel label = new JLabel("Wrong sequence! Thank you for playing. Please close the window to end the game.");

        // setting the layout and adding the label to panel
        panel.setLayout(layout);
        panel.add(label);

        // setting frame properties
        frame.getContentPane().add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 75);
        frame.setVisible(true); 
    }
}