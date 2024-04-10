import business.Company;

import java.time.LocalDate;

public class NewsAgency {
    Company company;
    String name;

    public void accessMethod(){
        Person person = new Person();
        person.dob = LocalDate.now();
        person.saySomething("Hello");
        person.getMiddleInitial();
    }


}
