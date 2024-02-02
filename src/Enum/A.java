package Enum;

import static Enum.Calender.*;

public class A {
    public static void main(String[] args) {
        System.out.println(JAN);
        for (Calender s:Calender.values()){
            System.out.println(s);
        }

    }
}
