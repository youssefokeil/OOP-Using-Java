public class B extends Thread{
    @Override
    public void run(){
        for(int j=1; j<=5; j++){
            System.out.println("\t From ThreadB: j= "+j);
        }
        System.out.println("Exit from B");
    }
}
