// JFrame class that initializes the main JFrame for the game
import javax.swing.*;
public class Frame extends JFrame {
    // constructor that passes in the panel
    public Frame(LabelPanel panel) {
        // calling super since class extends JFrame
        super("SimonSays!");
        // initializing all of the frame's properties
        getContentPane().add(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000, 500);
        setVisible(true);
        setResizable(false);
    }
}