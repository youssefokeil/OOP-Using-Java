public class C extends Thread{
    @Override
    public void run(){
        for(int k=1; k<=5; k++){
            System.out.println("\t From ThreadC: k= "+k);
        }
        System.out.println("Exit from C");
    }
}
