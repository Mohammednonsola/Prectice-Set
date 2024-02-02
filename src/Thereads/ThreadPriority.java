package Thereads;

public class ThreadPriority extends Thread{
    public static void main(String[] args) {
        ThreadPriority t1=new ThreadPriority("mohammed ");
        t1.setPriority(1);
        t1.start();

        ThreadPriority t2=new ThreadPriority("nansola ");
        t2.setPriority(10);
        System.out.println(t2.getPriority());
        t2.start();

        ThreadPriority t3=new ThreadPriority("Ahemad ");
        t3.setPriority(5);
        t3.start();

    }

    @Override
    public void run() {
        System.out.println(this.name);
    }

    String name;
    public ThreadPriority(String name) {
       this.name=name;
    }
}
