import javax.swing.*;

public class LabelPanel extends JPanel {

    private static JLabel userScore;
    
    public LabelPanel(int score, JPanel root) {
        userScore = new JLabel("Score: " + score);
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        add(userScore);
        add(root);
    }

    public static void updateScore(int score) {
        userScore.setText("Score: " + score);
    }

}