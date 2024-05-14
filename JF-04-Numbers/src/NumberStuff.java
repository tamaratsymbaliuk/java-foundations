public class NumberStuff {
    public static void main(String[] args) {
        byte myByte = 0x1f; // in hexadecimal
        int myInt = 0b01 | 0b10; // in binary 1 or 2 which gives the result of 3
        int anotherInt = 1 | 2 |4;
        System.out.println(myInt); // 3
        System.out.println(anotherInt); // 7

    }
}
