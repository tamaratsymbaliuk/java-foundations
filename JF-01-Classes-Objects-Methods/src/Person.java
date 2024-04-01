import business.Company;

public class Person {
    //constant variable uppercase
    private final double PI = 3.14;
    private final String MY_BIG_CONSTANT ="My constant";
    private String firstName;
    private int age;
    private long id;
    private char middleInitial;
   //creating instance of a class Company and storing it into the variable company
    static private Company company = new Company();
    private NewsAgency agency;
    private String middleName = "Maria";


    //void doesn't return anything
    public void sayHello() {
        System.out.println("Hello");
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

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.sayHello();
        p1.saySomething("Hey what's up?");
        System.out.println(p1.getMiddleInitial());
        System.out.println(p1.add(2,5));

    }


}
