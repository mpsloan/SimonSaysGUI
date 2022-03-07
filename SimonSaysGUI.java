import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

public class SimonSaysGUI implements ActionListener {

    private static Random rng = new Random();

    public SimonSaysGUI() throws InterruptedException {
        JFrame frame = new JFrame("Simon Says!");
        int score = 0;
        JLabel userScore = new JLabel("Score:" + score);
        JPanel root = new JPanel();
        GridLayout layout = new GridLayout(2, 2);
        root.setLayout(layout);

        ArrayList<Color> userInput = new ArrayList<>();

        Color red = new Color("red.png", "red");
        red.addActionListener((ActionListener) new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("red was clicked");
                userInput.add(red);
            }
        });
        
        Color blue = new Color("blue.png", "blue");
        blue.addActionListener((ActionListener) new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("blue was clicked");
                userInput.add(blue);
            }

        });

        Color green = new Color("green.png", "green");
        green.addActionListener((ActionListener) new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("green was clicked");
                userInput.add(green);
            }

        });

        Color yellow = new Color("yellow.png", "yellow");
        yellow.addActionListener((ActionListener) new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("yellow was clicked");
                userInput.add(yellow);
            }

        });

        root.add(red);
        root.add(blue);
        root.add(green);
        root.add(yellow);
        root.add(userScore);

        frame.getContentPane().add(root);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(750, 750);
        frame.setVisible(true);

        ArrayList<Color> colors = new ArrayList<>();
        int breakout = 0;
        int numColors = 1;
        while (breakout == 0) {
            for (int i = 0; i < numColors + 2; i++) {
                Thread.sleep(2000);
                int randNum = rng.nextInt(4);
                if (randNum == 0) {
                    red.doClick();
                    colors.add(red);
                }
                else if (randNum == 1) {
                    blue.doClick();
                    colors.add(blue);
                }
                else if (randNum == 2) {
                    green.doClick();
                    colors.add(green);
                }
                else {
                    yellow.doClick();
                    colors.add(yellow);
                }
            }
            userInput.clear();
            while (userInput.size() != colors.size()) {
                Thread.sleep(2000);
            }
            if (userInput.equals(colors)) {
                score ++;
                numColors += 2;
                userScore.setText("Score: " + score);
                continue;
            }
            else {
                break;
            }
        }
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
}