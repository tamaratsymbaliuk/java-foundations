import java.util.Random;

public class GuessIt {
    private static final int MAX_ALLOWED_TRIES = 4;

    public static void main(String[] args) {
        int randomNum =  new Random().nextInt(10) + 1; //  1 - 10
        String guessedNumText = null;
int wrongGuessCount = 1;
   do {
            guessedNumText = System.console().readLine("Please guess a number between 1 and 10: ");
            if (guessedNumText.matches("-?\\d{1,2}")) {
                int guessedNum = Integer.parseInt(guessedNumText);

                if (guessedNum == randomNum) {
                    String tryText = wrongGuessCount == 1 ? "try" : "tries";
                    System.out.printf("The random number was %d. You got it in %d %s!%n", randomNum, wrongGuessCount, tryText);
                    return;
                } else {
                    System.out.println("You didn't get it!");
                    wrongGuessCount++;
                }
            }
        } while (!"quit".equals(guessedNumText) && wrongGuessCount <= MAX_ALLOWED_TRIES);
        if (wrongGuessCount >= MAX_ALLOWED_TRIES) {
            System.out.printf("You've had %d incorrect guesses. The random number is %d. Ending program now.%n", wrongGuessCount-1, randomNum);

        }


//        System.out.printf("Generated number is: %d.%n", randomNum);
//
//        if (randomNum < 2 || (randomNum % 2 == 0)) {
//            System.out.println("You got it!");
//        } else {
//            System.out.println("Sorry, you didn't get it. ");
//        }

//        switch (randomNum) {
//            case 1:
//                System.out.println("Color is red");
//                break;
//            case 2:
//                System.out.println("The color is blue");
//                break;
//            case 3:
//                System.out.println("The color is purple");
//                break;
//            default:
//                System.out.println("The color is whatever");
//        }


    }
}
