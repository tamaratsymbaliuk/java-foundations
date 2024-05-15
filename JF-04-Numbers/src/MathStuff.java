import java.security.SecureRandom;
import java.util.Random;

public class MathStuff {
    public static void main(String[] args) {
        System.out.println(Math.abs(-5)); // 5
        System.out.println(Math.ceil(5.4)); // 6.0
        System.out.println(Math.floor(5.4)); // 5.0
        System.out.println(Math.pow(2,3)); // 8.0

        Random random = new Random();
        System.out.println(random.nextInt(10));

        SecureRandom secureRandom = new SecureRandom();
        System.out.println(random.nextInt(10));

        System.out.println(calcAreaOfCircle(3));
    }

    /**
     * This method calculates the area of a circle
     * @param radius
     * @return
     */
    public static double calcAreaOfCircle(double radius) {
        // A = PI * r^2
        return Math.PI * Math.pow(radius,2);
    }

}
