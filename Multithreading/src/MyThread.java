public class MyThread extends Thread{

    private int threadNumber;
    public MyThread(int threadNumber){
        this.threadNumber=threadNumber;
    }
    @Override
    public void run(){
        for (int i=1; i<=5; i++){
            System.out.println(i + " from thread number " + this.threadNumber);
            try{
            Thread.sleep(1000);
            } catch(InterruptedException e){
                System.out.println("Error happened");
            }
        }
    }
}
