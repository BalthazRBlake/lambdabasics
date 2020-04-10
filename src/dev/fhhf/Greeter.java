package dev.fhhf;

public class Greeter {
    // Passing a thing that has a behavior NOT just a behavior
    public void greet(Greeting greeting){
        greeting.perform();
    }

    public static void main(String[] args) {

        Greeter greeter = new Greeter();
        HelloWorldGreeting helloWorldGreeting = new HelloWorldGreeting();
        greeter.greet(helloWorldGreeting);

        MyLambda myLambdaFunction = () -> System.out.println("Hello World Lambda");
        MyAdd addLambdaFunction = (int a, int b) -> a + b;
    }
}

interface MyLambda {
    void foo();
}
interface MyAdd {
    int addInt(int a, int b);
}