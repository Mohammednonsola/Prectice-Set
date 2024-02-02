package Thereads;

public class BusBooking extends Thread{

    int seat;
    @Override
    public void run() {
        BusTickit b=new BusTickit();
        b.bookseats(seat);
    }

    public static void main(String[] args) {

    BusBooking b1=new BusBooking();
    b1.seat=1;
    b1.start();

        BusBooking b2=new BusBooking();
        b2.seat=7;
        b2.start();

    }
}
