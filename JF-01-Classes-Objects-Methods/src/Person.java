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

    public static void main(String[] args) {
        System.out.println(company);
    }

}
