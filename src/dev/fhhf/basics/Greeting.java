package dev.fhhf.basics;

@FunctionalInterface
public interface Greeting {
    void perform();
    default void another(){
        System.out.println("lalala");
    }
}
