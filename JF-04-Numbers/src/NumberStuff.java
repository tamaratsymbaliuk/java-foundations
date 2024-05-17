import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class NumberStuff {
    public static void main(String[] args) {
        byte myByte = 0x1f; // in hexadecimal
        int myInt = 0b01 | 0b10; // in binary 1 or 2 which gives the result of 3
        int anotherInt = 1 | 2 |4;

        // 192.168.1.1 = IP Address
        // Netmask / network mask
        // 5.5.5.3
        // 0b0101 0b0101 0b0101 0b0011 - 0101 0101 0101 0011

        System.out.println(myInt); // 3
        System.out.println(anotherInt); // 7

        BigDecimal num1 = new BigDecimal("2.15");
        BigDecimal num2 = new BigDecimal("1.10");
        System.out.println(num1.subtract(num2));

        MathContext mc = new MathContext(5, RoundingMode.HALF_UP);
        System.out.println(new BigDecimal("5.686").divide(new BigDecimal("4.366"),mc));

    }
}
