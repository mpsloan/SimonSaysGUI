import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class SimonSaysGUI implements ActionListener {

    private static Random rng;
    public SimonSaysGUI() {
        JFrame frame = new JFrame("Simon Says!");

        JPanel root = new JPanel();
        GridLayout layout = new GridLayout(2, 2);
        root.setLayout(layout);

        ImageIcon redPic = new ImageIcon("red.png");
        JButton red = new JButton(redPic);
        red.addActionListener((ActionListener) new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("red was clicked");
            }
        });

        ImageIcon bluePic = new ImageIcon("blue.png");
        JButton blue = new JButton(bluePic);
        blue.addActionListener((ActionListener) new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("blue was clicked");
            }

        });

        ImageIcon greenPic = new ImageIcon("green.png");
        JButton green = new JButton(greenPic);
        green.addActionListener((ActionListener) new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("green was clicked");
            }

        });

        ImageIcon yellowPic = new ImageIcon("yellow.png");
        JButton yellow = new JButton(yellowPic);
        yellow.addActionListener((ActionListener) new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("yellow was clicked");
            }

        });


        root.add(red);
        root.add(blue);
        root.add(green);
        root.add(yellow);

        frame.getContentPane().add(root);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(750, 750);
        frame.setVisible(true);
    }

    public void randClick() {
        int randNum = rng.nextInt(2);
        if (randNum == 0) {
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
}