import java.sql.*;
import java.util.Scanner;

public class Program6 {    
    public static void main(String[] args) {
        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/pu5a11";
            String username = "root";
            String password = "";
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();
            
            // Insert Data
            Scanner scanner = new Scanner(System.in);
            
            System.out.println("Enter Your First Name : ");
            String fname = scanner.next();
            System.out.println("Enter Your Last Name : ");
            String lname = scanner.next();
            
            String query = "insert into students (fname, lname) values ('"+fname+"', '"+lname+"')";
            statement.execute(query);
            System.out.println("New Record created");
            
            statement.close();
            connection.close();
        } catch (Exception e) {
            System.out.println("Error is "+e);
        }
    }
}
