package main.datastore;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class Repository<T extends Repository.IDable<V> & Repository.Saveable, V> {
    record Person(String firstName, String lastName, Long id) implements IDable<Long>, Saveable{};
    interface Saveable {}
    interface IDable<T> {
        T id();
    }

    private List<T> records = new ArrayList<>();

    List<T> findAll() {
        return records;
    }

    T save(T record) {
        records.add(record);
        return record;
    }
    Optional<T> findById(long id) {
        return records.stream().filter(p -> p.id().equals(id)).findFirst();
    }
    static <T, V> V encrypt(T data, Function<T, V> func) {
        return func.apply(data);
    }

    public static void main(String[] args) {
        /*Repository<String> repo = new Repository<>();
        repo.save("house");
        repo.save("tree");
        repo.save("car");

        never going to work with String because String doesn't implement Repository.IDable
        */


        Repository<Person, Long> pRepo = new Repository<>();
        pRepo.save(new Person("Jake", "Pit", 23L));

        Optional<Person> foundPerson = pRepo.findById(23L);
        System.out.println(foundPerson);


        System.out.println(pRepo.findAll());

        System.out.println(Repository.<String, String>encrypt("Hello", m -> m.toUpperCase()));
        System.out.println(Repository.<String, Integer>encrypt("Hello", m -> m.hashCode()));
    }



}
