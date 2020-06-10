package dev.fhhf.unit2;

import dev.fhhf.lambdaexercise.Person;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class StandardFunctionalInterfacesExample {

    public static void main(String[] args) {

        List<Person> people = Arrays.asList(
                new Person("La", "Ma", 32),
                new Person("Charles", "Dickens", 60),
                new Person("Lewis", "Carroll", 42),
                new Person("Thomas", "Carlyle", 51),
                new Person("Charlotte", "Bronte", 45),
                new Person("Matthew", "Arnold", 39)
        );

        //Step 1. Sort list by name
        Collections.sort(people, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));
        //Step 2. Create a method that print all elements in the list
        System.out.println("\nConditionally   :::   All");
        performConditionally(people,
                             p -> true,
                             System.out::println);
        //Step 3. Create a method that prints all people that have
        // last name beginning with "accepted behavior instead of hardcoded"
        System.out.println("\nConditionally   :::   lastName");
        performConditionally(people,
                             p -> p.getLastName().startsWith("C"),
                             p -> System.out.println(p));
        System.out.println("\nConditionally   :::   firstName");
        performConditionally(people,
                             p -> p.getFirstName().startsWith("L"),
                             p -> System.out.println(p.getFirstName()));
    }

    private static void performConditionally(List<Person> people,
                                             Predicate<Person> predicate,
                                             Consumer<Person> consumer){
        for(Person p : people){
            if(predicate.test(p)) {
                consumer.accept(p);
            }
        }
    }
}
