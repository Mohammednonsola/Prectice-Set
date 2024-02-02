package Thereads;

public class ThreadsConceptUsingRunnable implements Runnable{
    public static void main(String[] args) {
        ThreadsConceptUsingRunnable  runnable1= new ThreadsConceptUsingRunnable("Mohammed");
        ThreadsConceptUsingRunnable  runnable2= new ThreadsConceptUsingRunnable("jabir");
        ThreadsConceptUsingRunnable  runnable3= new ThreadsConceptUsingRunnable("jawad");
        ThreadsConceptUsingRunnable  runnable4= new ThreadsConceptUsingRunnable("Ahemad");
      Thread thread=new Thread(runnable1);
      thread.start();
      thread.setPriority(10);
      Thread thread1=new Thread(runnable2);
      thread1.start();
      thread1.setPriority(10);
      Thread thread2=new Thread(runnable3);
      thread2.start();
      thread2.setPriority(5);
      Thread thread3=new Thread(runnable4);
      thread3.start();
      thread3.setPriority(7);
    }
String name;
    public ThreadsConceptUsingRunnable(String name) {
        this.name=name;
    }

    @Override
    public void run() {
        for (int i = 0; i <12000 ; i++) {
            System.out.println(this.name);
        }
    }
}


