package ExceptionHandling;

import java.util.Scanner;

public class A {
    public static void main(String[] args) throws insufficiant {
       int bal=500;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the amount");
        int i = sc.nextInt();
        if (bal>=i){
            System.out.println("collect money");
        } else {
            try {
               throw new insufficiant("Sorry");
            }catch (insufficiant e){
                e.printStackTrace();
                System.out.println("Balance is low");
            }
        }
    }
}
