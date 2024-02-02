package Thereads;

public class BusTickit {
    int total_seat=13;
   synchronized void bookseats(int seat){
        if (total_seat>=seat){
            System.out.println(seat+"seat is booked");
            total_seat = total_seat - seat;
            System.out.println("left seat is"+total_seat);
        } else  {
            System.out.println("seat is not avilable");
            System.out.println("total "+total_seat+"avilable");
        }
    }

}
