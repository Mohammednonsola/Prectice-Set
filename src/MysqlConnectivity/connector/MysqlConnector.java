package MysqlConnectivity.connector;

import java.sql.*;
import java.util.Scanner;

public class MysqlConnector {
    public static void main(String[] args) {
        try {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the Content");
            String content = sc.nextLine();
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/myblog", "root", "9967314923");
            Statement stt = con.createStatement();
           stt.executeUpdate("insert into blog values('111','"+content+"','jarfile','How to Downlod')");
//          stt.executeUpdate("delete from blog where id='10'");
//          stt.executeUpdate("update blog set id='1' where id='2'");
            ResultSet set = stt.executeQuery("Select * from blog ");
            while (set.next()){
                System.out.println("id is"+set.getString(1));
                System.out.println("Content is"+set.getString(2));
                System.out.println("Title is"+set.getString(3));
                System.out.println("Comment is"+set.getString(4));
                System.out.println();
            }
            con.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
