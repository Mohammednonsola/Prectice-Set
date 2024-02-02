package StringConcept;

import java.util.Scanner;

public class StringConcept {

public static void main(String[] args) {
//------------------------- reverse String---------------------------------------
//String name="mohammed nansola";
//for (int i=name.length()-1;i>=0;i--){
//    System.out.print(name.charAt(i));
//}
//------------------------- Count  String---------------------------------------
//    String name="mohammmed nansola";
//    int length = name.length();
//    System.out.println(length);
// ------------------------- opening and closing breacket program   String---------------------------------------
//    Scanner sc= new Scanner(System.in);
//    System.out.println("Enter the paranthasis");
//    String s = sc.next();
//    int count1 =0;
//    int count2=0;
//    for (int i = 0; i < s.length(); i++) {
//        if (s.charAt(i)=='('){
//            count1++;
//        } else if (s.charAt(i)==')') {
//            count2++;
//        }
//
//
//    }
//    if (count1==count2) {
//        System.out.println("no Error");
//    } else {
//        System.out.println("Error");
//    }

// ------------------------- Star pattern ---------------------------------------
//    int x=10;
//    for (int i = 5; i >=0; i--) {
//        for (int j = 0; j <=i; j++) {
//            System.out.print(i*x);
//        }
//        System.out.println();
//    }

//    for (int i = 0; i <=5; i++) {
//        for (int j = 0; j <=i; j++) {
//            System.out.print("*");
//        }
//        System.out.println();
//    }
//    for (int i = 5; i>=0; i--) {
//        for (int j = 0; j <=i; j++) {
//            System.out.print("*");
//        }
//        System.out.println();
//    }
//    int counnt=1;
//    for (int i = 0; i<=5; i++) {
//        for (int j = 1; j <=i; j++) {
//            System.out.print(counnt++  +" ");
//        }
//        System.out.println();
//    }

//-------------------------swap two number without using third variale---------------------------
//  int x=5;
//  int y=10;
// x=x+y;
// y=x-y;
// x=x-y;
//    System.out.println(x);
//    System.out.println(y);

//-------------------------Count the latter which latter A and which B---------------------------
//    String str="aaaabbaaabbb";
//    int count1 =0;
//    int count2 =0;
//    for (int i = 0; i <str.length(); i++) {
//        if (str.charAt(i)=='a'){
//
//            count1++;
//        } else if (str.charAt(i)=='b') {
//            count2++;
//        }
//    }
//    System.out.println("A latters accures in the program : "+count1);
//    System.out.println("B latters accures in the program : "+count2);
//}
//-----------------sort and Remove Duplicate Elemnt in the array--------------------------
//   int x[]={13,67,4,3,22,134,23,2,90};
//   int temp[]=new int[x.length];
//   int j=0;
//   int temprary;
//    for (int i = 0; i <x.length-1 ; i++) {
//        for (int k = 0; k < x.length-1; k++) {
//            if (x[k]>x[k+1]){
//                temprary=x[k];
//                x[k]=x[k+1];
//                x[k+1]=temprary;
//            }
//        }} for (int p:x){
//
//    }
//
//        for (int z = 0; z < x.length-1; z++) {
//            if (x[z]!=x[z+1]){
//                temp[j]=x[z];
//                j++;
//            }
//        }
//       temp[j]=x[x.length-1];
//
//        for (int t = 0; t < j; t++) {
//            System.out.println(temp[t]);
//        }

}}
