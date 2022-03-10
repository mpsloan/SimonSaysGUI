import java.util.ArrayList;
import java.util.Random;

public class SimonSays {

    private Random rng = new Random();

    public SimonSays() throws InterruptedException {
        Instructions instructions = new Instructions();
        if (instructions.windowIsClosed() == false) {
            int score = 0;
        ArrayList<Color> colors = new ArrayList<>();
        Color red = new Color("red.png", "red");
        Color blue = new Color("blue.png", "blue");
        Color green = new Color("green.png", "green");
        Color yellow = new Color("yellow.png", "yellow");
        colors.add(red);
        colors.add(blue);
        colors.add(green);
        colors.add(yellow);

        ArrayList<Color> userInput = new ArrayList<>();

        ButtonPanel root = new ButtonPanel(colors, userInput);
        LabelPanel panel = new LabelPanel(score, root);
        new Frame(panel);
        

        ArrayList<Color> randColors = new ArrayList<>();
        int breakout = 0;
        int numColors = 1;
        while (breakout == 0) {
            for (int i = 0; i < numColors + 2; i++) {
                Thread.sleep(2000);
                int randNum = rng.nextInt(4);
                if (randNum == 0) {
                    red.doClick();
                    randColors.add(red);
                }
                else if (randNum == 1) {
                    blue.doClick();
                    randColors.add(blue);
                }
                else if (randNum == 2) {
                    green.doClick();
                    randColors.add(green);
                }
                else {
                    yellow.doClick();
                    randColors.add(yellow);
                }
            }
            userInput.clear();
            while (userInput.size() != randColors.size()) {
                Thread.sleep(2000);
            }
            if (userInput.equals(randColors)) {
                score ++;
                LabelPanel.updateScore(score);
                randColors.clear();
                numColors += 2;
                continue;
            }
            else {
                break;
            }
        }
        }
        
    }
}