package Exercises;

public class Address {


    public static void main(String[] args) {
        String address = "12345 Big St., Alphabet City, CA 90210";

        String buildingNumber = address.substring(0,5);
        System.out.println(buildingNumber);
    }
}
