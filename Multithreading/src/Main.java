//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // try to run multiple times and see how it changes

        A threadA= new A();
        B threadB= new B();
        C threadC= new C();

        threadA.setPriority(Thread.MAX_PRIORITY);
        threadB.setPriority(Thread.NORM_PRIORITY);
        threadC.setPriority(Thread.MIN_PRIORITY);

        threadA.setName("Thread Ab");


        threadA.start();



        System.out.println("Started Thread C "+threadC);
        threadC.start();

        System.out.println("Started Thread B "+ threadB);
        threadB.start();

        System.out.println("End of main thread");



    }
}