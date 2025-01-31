package dev.fhhf.unit3;

public class MethodReferenceExample1 {

    public static void main(String[] args) {

        //Thread t = new Thread(() -> printMessage());
        Thread t = new Thread(MethodReferenceExample1::printMessage);
        t.start();//t.run();
    }

    static void printMessage() {
        System.out.println("Method reference with no params");
    }
}
