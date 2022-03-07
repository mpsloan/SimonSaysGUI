import java.util.ArrayList;
import java.util.Random;

public class Sequence extends ArrayList<Color> {

    private static Random rng = new Random();
    
    public Sequence(Color color) {
        int randNum = rng.nextInt(4);
        if (randNum == 0) {
            color.doClick();
            this.add(color);
        }
        else if (randNum == 1) {
            this.add(color);
        }
        else if (randNum == 2) {
            this.add(color);
            }
        else {
            this.add(color);
        }
    }
}