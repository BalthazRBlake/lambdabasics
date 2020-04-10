package dev.fhhf;

@FunctionalInterface
public interface Greeting {
    void perform();
    default void another(){
        System.out.println("lalala");
    }
}
