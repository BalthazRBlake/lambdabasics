package dev.fhhf.unit3;

import dev.fhhf.lambdaexercise.Person;

import java.util.Arrays;
import java.util.List;

public class CollectionsIterationExample {

    public static void main(String[] args) {

        List<Person> people = Arrays.asList(
                new Person("La", "Ma", 32),
                new Person("Charles", "Dickens", 60),
                new Person("Lewis", "Carroll", 42),
                new Person("Thomas", "Carlyle", 51),
                new Person("Charlotte", "Bronte", 45),
                new Person("Matthew", "Arnold", 39)
        );

        System.out.println("Printing people classic enhanced for");
        for (Person p : people) {
            System.out.println(p); // runs sequentially, the process starts and finishes in one thread
        }

        System.out.println("Printing people");
        people.forEach(System.out::println); // Because it doesn't run sequentially it can run in parallel
        // That's why lambda allows multi-threading
    }
}
