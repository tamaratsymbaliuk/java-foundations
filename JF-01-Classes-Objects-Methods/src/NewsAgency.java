import business.Company;

import java.time.LocalDate;

public class NewsAgency {
    Company company;
    String name;

    public void accessMethod(){
        Person person = new Person("Tom","Ken", LocalDate.of(2000,4,5));
        person.dob = LocalDate.now();
        person.saySomething("Hello");
        person.getMiddleInitial();

        Person johnny = new Person("Johnny", "Smith", LocalDate.of(1979,11,1));
    }

    public static void main(String[] args) {
        Person tom = new Person("tom","Smith", LocalDate.of(2000,11,1));
        System.out.format("The person's first name is: %s.", tom.getFirstName());
    }


}
