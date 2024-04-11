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


}
