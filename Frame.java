import javax.swing.*;
public class Frame extends JFrame {

    public Frame(LabelPanel panel) {
        super("SimonSays!");
        getContentPane().add(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000, 500);
        setVisible(true);
        setResizable(false);
    }
}