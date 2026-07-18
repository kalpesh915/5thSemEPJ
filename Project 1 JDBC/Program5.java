import java.sql.*;
import java.util.Scanner;
public class Program5 {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url, username, password, fname, lname;
            url = "jdbc:mysql://localhost:3306/epjdemo";
            username = "root";
            password = "";
            
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();
            
            Scanner scanner = new Scanner(System.in);
            
            // geting values from keyboard
            System.out.println("Enter First Name");
            fname = scanner.nextLine();
            System.out.println("Enter Last  Name");
            lname = scanner.nextLine();
            
            // Insert new rows in our table
            String query = "insert into students (fname, lname) values ('"+fname+"', '"+lname+"')";
            int count = statement.executeUpdate(query);
            System.out.println(count+ " Rows created in our students table");
            statement.close();
            connection.close();
        } catch (Exception err) {
            System.out.println("Error is "+err);
        }
    }
}
