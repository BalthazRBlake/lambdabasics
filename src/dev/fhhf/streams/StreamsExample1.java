package dev.fhhf.streams;

import dev.fhhf.lambdaexercise.Person;

import java.util.Arrays;
import java.util.List;

public class StreamsExample1 {

    public static void main(String[] args) {

        List<Person> people = Arrays.asList(
                new Person("La", "Ma", 32),
                new Person("Charles", "Dickens", 60),
                new Person("Lewis", "Carroll", 42),
                new Person("Thomas", "Carlyle", 51),
                new Person("Charlotte", "Bronte", 45),
                new Person("Matthew", "Arnold", 39)
        );

        people.stream()
                .filter(p -> p.getLastName().startsWith("C")) // Only people which meets the criteria pass to print
                .forEach(p -> System.out.println(p.getFirstName()));

        long count = people.parallelStream()
                .filter(p -> p.getLastName().startsWith("C"))
                .count();
        System.out.println(count);
    }
}
