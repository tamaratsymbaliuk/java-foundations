import java.util.Random;

public class GuessItForLoop {
    private static final int MAX_ALLOWED_TRIES = 4;

    public static void main(String[] args) {
        int randomNum = new Random().nextInt(10) + 1; //  1 - 10
        String guessedNumText = null;
        int wrongGuessCount;

        for (wrongGuessCount = 1; wrongGuessCount <= MAX_ALLOWED_TRIES; wrongGuessCount++) {
            guessedNumText = System.console().readLine("Please guess a number between 1 and 10: ");
            if (guessedNumText.matches("-?\\d{1,2}")) {
                int guessedNum = Integer.parseInt(guessedNumText);

                if (guessedNum == randomNum) {
                    String tryText = wrongGuessCount == 1 ? "try" : "tries";
                    System.out.printf("The random number was %d. You got it in %d %s!%n", randomNum, wrongGuessCount, tryText);
                    break;
                } else {
                    System.out.println("You didn't get it!");
                }
            }
        }

        if (wrongGuessCount >= MAX_ALLOWED_TRIES) {

            System.out.printf("You've had %d incorrect guesses. The random number is %d. Ending program now.%n", wrongGuessCount - 1, randomNum);

        }
    }
}

