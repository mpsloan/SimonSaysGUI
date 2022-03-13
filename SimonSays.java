/* SimonSays logic for the game. I wanted to separate the drawing of the GUI from
the actual logic in order to retain the object oriented priciples as well as keep
the code more neat and organized in each class */
import java.util.ArrayList;
import java.util.Random;

public class SimonSays {
    // random variable that generates a random number to randomize color sequence
    private Random rng = new Random();
    // constructor that throws InterruptedException to allow for pauses in the game
    public SimonSays() throws InterruptedException {
        // score variable
        int score = 0;
        // ArrayList to store the colors for ButtonPanel.java method
        ArrayList<Color> colors = new ArrayList<>();
        // initializing colors and adding them to the ArrayList
        Color red = new Color("red.png", "red");
        Color blue = new Color("blue.png", "blue");
        Color green = new Color("green.png", "green");
        Color yellow = new Color("yellow.png", "yellow");
        colors.add(red);
        colors.add(blue);
        colors.add(green);
        colors.add(yellow);
        // ArrayList to hold user input
        ArrayList<Color> userInput = new ArrayList<>();
        // creating button panel, and label panel as well as initializing main frame
        ButtonPanel root = new ButtonPanel(colors, userInput);
        LabelPanel panel = new LabelPanel(score, root);
        Frame frame = new Frame(panel);
        
        // ArrayList to store the random sequence of colors
        ArrayList<Color> randColors = new ArrayList<>();
        // breakout variable that to escape while loop
        int breakout = 0;
        // number of colors variable for user to remember, increases by two each round
        int numColors = 3;
        // while loop to keep game running
        while (breakout == 0) {
            // for loop that randomly picks a color each time
            for (int i = 0; i < numColors; i++) {
                // slight pause between colors to allow for user to distinguish clicks
                Thread.sleep(2000);
                // new random number each time through for loop
                int randNum = rng.nextInt(4);
                // conditionals that determines which color is clicked
                if (randNum == 0) {
                    red.doClick();
                    // adding the color to randColors ArrayList
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
            /* clearing the userInput ArrayList because the computer was clicking the buttons which
            triggered the button listener but the user hasn't had a chance to enter what they think
            the sequence was */
            userInput.clear();
            /* pausing the game while the user clicks the colors until they pick enough colors 
            that were randomly selected */
            while (userInput.size() != randColors.size()) {
                Thread.sleep(2000);
            }
            // conditional that handles if user got the sequence correct by comparing the 2 ArrayLists
            if (userInput.equals(randColors)) {
                // incrementing score and updating it on the panel
                score ++;
                LabelPanel.updateScore(score);
                // clearing the sequence of random colors for a new sequence next round
                randColors.clear();
                // adding 2 to the number of colors
                numColors += 2;
                // letting the user know how many colors they will face and calling NextLevel GUI 
                new NextLevel(numColors);
                // checking if user agreed to move to next level, pausing if they haven't
                while (NextLevel.clicked() == false) {
                    Thread.sleep(2000);
                }
            }
            // displaying GameOver GUI and disposing the current GUI
            else {
                new GameOver();
                frame.dispose();
            }
        }
        
    }
}