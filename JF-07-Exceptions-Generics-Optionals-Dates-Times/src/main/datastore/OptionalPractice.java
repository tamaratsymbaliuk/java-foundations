package main.datastore;

import javax.swing.text.html.Option;
import java.time.Year;
import java.util.List;
import java.util.Optional;

public class OptionalPractice {
    record Car(String make, String model, String color, Year year){}
    record Person(Long id, String firstName, String lastName, Optional<Car> car) implements Repository.IDable<Long>, Repository.Saveable {}
    public static void main(String[] args) {
        Optional<String> optMsg = Optional.of("Hello");
        System.out.println(optMsg);

        String msg2 = null;
        Optional<String> optMsg2 = Optional.ofNullable(msg2);

        String finalOutput = optMsg2.orElse("alternative");
        System.out.println(finalOutput);

        System.out.println(optMsg2.filter(s -> s.length() > 3));

        String msg3 = "Tamara";
        Optional<String> optMsg3 = Optional.ofNullable(msg3);

        System.out.println(optMsg3.filter(s -> s.length() > 3));


        Repository<Person, Long> repo = new Repository<>();
        Person p1 = new Person(100L, "Tom", "Pit", Optional.of(new Car("Tesla", "X", "Red", Year.of(2018))));
        Person p2 = new Person(101L, "Jerry", "Pit", Optional.of(new Car("Tesla", "Y", "White", Year.of(2022))));
        Person p3 = null;


        repo.save(p1);
        repo.save(p2);


        System.out.println("repo");
        System.out.println(repo.findById(101L).map(Person::firstName).orElse("firstname not found"));

        Optional<Person> optPerson = Optional.of(p1);
        System.out.println(optPerson.flatMap(Person::car).map(Car::make).orElse("unknown"));

        List<Optional<Person>> people = List.of(Optional.of(p1), Optional.of(p2), Optional.ofNullable(p3));
        people.stream()
                .filter(Optional::isPresent)
                        .map(Optional::get)
                .map(Person::firstName)
                                .forEach(System.out::println);
    }
}
