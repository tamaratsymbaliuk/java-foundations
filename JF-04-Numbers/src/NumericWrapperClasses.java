public class NumericWrapperClasses {
    public static void main(String[] args) {
        int age = Integer.parseInt(args[0]);
        int num1 = 7;
        Integer num1B = Integer.valueOf(num1); // auto-boxing
        Double myDouble = Double.valueOf(2345.12);
        Float myFloat = Float.valueOf(23.23f);
        Byte myByte = Byte.valueOf("23");
        storeData(num1B);
        System.out.println(num1B.byteValue());

    }

    /**
     * Takes in any type of data and stores it somewhere generically
     */
    public static void storeData(Object obj) {

    }

}
