package Thereads;

public class ThreadLifeCycle extends Thread{

    public static void main(String[] args) {
        ThreadLifeCycle tl=new ThreadLifeCycle();
        System.out.println(tl.getState());
        tl.start();
        try {
            Thread.sleep(5000);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println(tl.getState());
    }

    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread());
        System.out.println(Thread.activeCount());
        System.out.println("Test");

    }
}
