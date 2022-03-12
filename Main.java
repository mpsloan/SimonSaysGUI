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