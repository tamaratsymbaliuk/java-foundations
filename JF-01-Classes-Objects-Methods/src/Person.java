import business.Company;

import java.time.LocalDate;

public class Person {
    //same as public class Person extends Object(parent for every class that doesn't have extends keyword)
    private final String MY_BIG_CONSTANT ="My constant";
    private String firstName;
    private String lastName;
    protected LocalDate dob;
    private int age;
    private long id;
    private char middleInitial;
   //creating instance of a class Company and storing it into the variable company
    static private Company company = new Company();
    private NewsAgency agency;
    private String middleName = "Maria";
    //every instance of the Person class will share this static variable
    public static double PI = 3.14;
    public static int[]nums = initNums();

    //constructor
    public Person(){
    }
    //constructors allow properties to be set when an object is created
    public Person(String firstName, String lastName, LocalDate dob){
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
    }




    //static initializer
    static {
        nums = new int[5];
        nums[0] = 3;
        nums[1] = 3;
        nums[2] = 3;
    }
 //second better option
    public static int[] initNums(){
        int[] nums = new int[5];
        nums[0] = 3;
        nums[1] = 3;
        nums[2] = 3;
        return nums;
    }




    //void doesn't return anything
    public void sayHello() {
        System.out.println("Hello");
    }
    //a static method belongs to the class rather than any instance of the class. You can call a static method without creating an instance of the class in which it's defined
    public static void checkStatic(){
        System.out.println("static");
    }

    //has 1 parameter
    public void saySomething(String message) {
        System.out.println(message);
    }

    public char getMiddleInitial(){
        return middleName.charAt(0);
    }

    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public void test(String... words){
        //use varargs of type String... to set array parameter to any value
    }


    public static void main(String[] args) {
        Person p1 = new Person();
        p1.sayHello();
        p1.saySomething("Hey what's up?");
        System.out.println(p1.getMiddleInitial());
        System.out.println(p1.add(2,5));
        p1.test("one","two","three");
        checkStatic();
        p1.firstName ="Jake";
        p1.lastName ="Smith";

    }


}
