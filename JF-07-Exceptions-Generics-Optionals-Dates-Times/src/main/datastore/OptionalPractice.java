package main.datastore;

import java.util.Optional;

public class OptionalPractice {
    public static void main(String[] args) {
        Optional<String> optMsg = Optional.of("Hello");
        System.out.println(optMsg);

        String msg2 = null;
        Optional<String> optMsg2 = Optional.ofNullable(msg2);

        String finalOutput = optMsg2.orElse("alternative");
        System.out.println(finalOutput);
    }
}
