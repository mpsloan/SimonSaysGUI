/*
Michael Sloan
CS 1181L-07
Luke Holt
March 11, 2022
This is the main method of a SimonSaysGUI which selects random sequences of the colors
red, blue, green, and yellow and highlights them to the user. Once the combination is 
done, the program pauses and allows the user to enter the sequence in the exact order. 
If the user's sequence is the exact same as the randomly generated one, the game moves
on to the next level and adds two more colors to the sequence each time.
*/
public class Main {
    public static void main(String[] args) throws InterruptedException {
        // game instructions
        new Instructions();
        /* while loop that checks if the user has agreed to the game's instructions
        and pauses the game's initalization if they haven't */
        while (Instructions.userAgreement() == false) {
            Thread.sleep(2000);
        }
        // actual simon says game
        new SimonSays();
    }
}