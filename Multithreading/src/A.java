public class A extends Thread{
    @Override
    public void run(){
        for(int i=1; i<=5; i++){
            System.out.println("\t From ThreadA: i= "+i);
        }
        System.out.println("Exit from A");
    }
}
