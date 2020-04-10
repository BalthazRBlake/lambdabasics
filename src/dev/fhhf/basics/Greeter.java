package dev.fhhf.basics;

public class Greeter {
    // Passing a thing that has a behavior NOT just a behavior
    public void greet(Greeting greeting){
        greeting.perform();
    }

    public static void main(String[] args) {

        Greeter greeter = new Greeter();

        HelloWorldGreeting helloWorldGreeting = new HelloWorldGreeting();
        Greeting lambdaGreeting = () -> System.out.println("Hello World Lambda");

        Greeting innerClassGreeting = new Greeting() {
            @Override
            public void perform() {
                System.out.println("Hello World innerClass");
            }
        };

        greeter.greet(helloWorldGreeting);
        greeter.greet(lambdaGreeting);
        greeter.greet(innerClassGreeting);
        greeter.greet(()-> System.out.println("Inline Lambda"));

        helloWorldGreeting.another();
        lambdaGreeting.another();
        innerClassGreeting.another();
    }
}
