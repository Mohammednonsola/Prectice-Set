package Thereads;

public class ThreadConcept extends Thread{
    @Override
    public void run() {
        for (int i = 0; i <1000 ; i++) {
            System.out.println(this.name);
        }
    }
    String name;
    public ThreadConcept(String name){
        this.name=name;
    }

    public static void main(String[] args) {

        ThreadConcept t1= new ThreadConcept("mohammed");
        ThreadConcept t2= new ThreadConcept("nansola");
        ThreadConcept t3= new ThreadConcept("Ahemad");
        ThreadConcept t4= new ThreadConcept("nandoliya");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }


}

