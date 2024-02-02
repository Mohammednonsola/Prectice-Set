package Regx;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
    public static void main(String[] args) {
//     grouping
//        Pattern p= Pattern.compile("[0-9]{2}");
//        Matcher m=p.matcher("9998");
//        while (m.find()){
//            System.out.println(m.start()+"...."+m.group());
//       ******** All Patterns********************
//String s="c d s v..@35676hnn";
//      Pattern p=Pattern.compile("//d");
//      Pattern p=Pattern.compile("//D");
//      Pattern p=Pattern.compile("//w");
//      Pattern p=Pattern.compile("//W");
//      Pattern p=Pattern.compile("//s");
//      Pattern p=Pattern.compile("//S");
//      Pattern p=Pattern.compile("//.");
//      Pattern p=Pattern.compile("//B");
//       Matcher m=p.matcher(s);
//   while (m.find()){
//            System.out.println(m.start()+"...."+m.group());
//        }
//  ....................name Validator...........................
//        Scanner sc= new Scanner(System.in);
//        System.out.println("Enter the name");
//        String s = sc.next();
//        int count=0;
//         String regx="^[a-zA-Z]+$";
//      if (s.matches(regx)&&s.length()>3) {
//          System.out.println("name is valid");
//      }else {
//          System.out.println("Name is Invalid");
//      }
//        }


//        ...................MobileNumber Validator..................................
//      String regx="^[789][0-9]{9}$";
//
//        if (s.matches(regx)){
//            System.out.println("valid numbers");
//        }else {
//            System.out.println("Invalid Mobile Number");
//        }

        Pattern p=Pattern.compile("ab+c");
        Matcher m=p.matcher("acdfgbgbabcac");
        while (m.find()){
            System.out.println(m.start()+"....."+m.group());
        }

    }

}

