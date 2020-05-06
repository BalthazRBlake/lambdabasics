package dev.fhhf.unit2;

public class ThisReferenceExample {

    public void doProcess(int i, Process p){
        p.process(i);
    }

    public static void main(String[] args) {

        ThisReferenceExample thisReferenceExample = new ThisReferenceExample();

        //System.out.println(this); // this can't be reference in Static methods

        thisReferenceExample.doProcess(10, new Process() {
            @Override
            public void process(int i) {
                System.out.println("Value of i: " + i);
                System.out.println(this); // this works because it points to new instance of Process.
            }

            @Override
            public String toString() {
                return "This is the anonymous inner class";
            }
        });
    }
}
