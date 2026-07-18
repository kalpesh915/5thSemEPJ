import java.sql.*;
public class Program2 {
    public static void main(String[] args) {
        try {
            // Step 1: Loading JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Step 2: Establish Connection
            String url, username, password;
            url = "jdbc:mysql://localhost:3306/epjdemo";
            username = "root";
            password = "";
            
            Connection connection = DriverManager.getConnection(url, username, password);
            System.out.println("Connected");
            
        } catch (Exception err) {
            System.out.println("Error is "+err);
        }
    }
}
