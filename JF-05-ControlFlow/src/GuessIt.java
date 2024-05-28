import java.util.Random;

public class GuessIt {
    public static void main(String[] args) {
        int randomNum =  new Random().nextInt(5) + 1; //  1 , 2, 3, 4 , 5
        System.out.printf("Generated number is: %d.%n", randomNum);

        if (randomNum < 2 || (randomNum % 2 == 0)) {
            System.out.println("You got it!");
        } else {
            System.out.println("Sorry, you didn't get it. ");
        }

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
