package dev.fhhf;

public class Greeter {
    // Passing a thing that has a behavior NOT just a behavior
    public void greet(Greeting greeting){
        greeting.perform();
    }

    public static void main(String[] args) {

        Greeter greeter = new Greeter();

        HelloWorldGreeting helloWorldGreeting = new HelloWorldGreeting();
        Greeting myLambdaFunction = () -> System.out.println("Hello World Lambda");

        //greeter.greet(helloWorldGreeting);
        helloWorldGreeting.perform();
        myLambdaFunction.perform();
    }
}
