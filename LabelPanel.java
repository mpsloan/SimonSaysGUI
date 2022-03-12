// class for the panel that holds the score label
import javax.swing.*;

public class LabelPanel extends JPanel {
    // static JLabel in order to update the score each round in SimonSays.java
    private static JLabel userScore;
    
    // constructor that passes in the score, and other JPanel to add (ButtonPanel.java)
    public LabelPanel(int score, JPanel root) {
        // setting the score JLabel and BoxLayout
        userScore = new JLabel("Score: " + score);
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        add(userScore);
        add(root);
    }

    // static method to update the score after each round passing in the score
    public static void updateScore(int score) {
        userScore.setText("Score: " + score);
    }

}