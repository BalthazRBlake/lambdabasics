package dev.fhhf.unit2;

public class ClosureExample {

    public static void main(String[] args) {
        int a = 10;
        int b = 20; //its a final value because it is use inside the lambda expression

        doProcess(a, i -> {
            //b = 30; //can't change
            System.out.println(i + b);
        });
    }

    public static void doProcess(int i, Process p){
        p.process(i);
    }
}

interface Process {
    void process(int i);
}