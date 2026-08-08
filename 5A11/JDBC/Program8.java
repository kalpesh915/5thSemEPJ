import java.sql.*;
import java.util.Scanner;

public class Program8 {    
    public static void main(String[] args) {
        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/pu5a11";
            String username = "root";
            String password = "";
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();
            
            
            //String query = "update students set lname = 'Pandit'";
            String query = "update students set lname = 'Patel' where id = 4";
            statement.execute(query);
            System.out.println(statement.getUpdateCount()+" Rows Updated ");
            System.out.println("New Record Updated");
            
            statement.close();
            connection.close();
        } catch (Exception e) {
            System.out.println("Error is "+e);
        }
    }
}
