package dev.fhhf.unit2;

public class ThisReferenceExample {

    public void doProcess(int i, Process p){
        p.process(i);
    }

    public void execute() {
        doProcess(10, i -> {
            System.out.println("Value of i: " + i);
            System.out.println(this); // points to the instance of the method calling the function lambda
        });
    }

    public static void main(String[] args) {

        ThisReferenceExample thisReferenceExample = new ThisReferenceExample();

        /*thisReferenceExample.doProcess(10, i -> {
            System.out.println("Value of i: " + i);
            //System.out.println(this); // this does'n work because it points to Static main.
            //Does not override the main this reference, nor creates an instance of a Non-StaticClass
        });*/

        thisReferenceExample.execute();
    }

    public String toString(){
        return "This is the main ThisReferenceExample Class instance";
    }
}
