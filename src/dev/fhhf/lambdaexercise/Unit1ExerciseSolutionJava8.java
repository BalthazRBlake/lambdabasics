package dev.fhhf.lambdaexercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Unit1ExerciseSolutionJava8 {

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
        printConditionally(people, p -> true);
        //Step 3. Create a method that prints all people that have
        // last name beginning with "accepted behavior instead of hardcoded"
        System.out.println("\nConditionally   :::   lastName");
        printConditionally(people, p -> p.getLastName().startsWith("C"));
        System.out.println("\nConditionally   :::   firstName");
        printConditionally(people, p -> p.getFirstName().startsWith("L"));
    }

    private static void printConditionally(List<Person> people, Condition condition){
        for(Person p : people){
            if(condition.test(p)) {
                System.out.println(p);
            }
        }
    }
}
