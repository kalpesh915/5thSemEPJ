import java.sql.*;
public class Program2 {
    public static void main(String[] args) {
        try {
            // step 1 Loading driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // step 2 Create Connection
            String url = "jdbc:mysql://localhost:3306/pu5a11";
            String username = "root";
            String password = "";
            Connection connection = DriverManager.getConnection(url, username, password);
            System.out.println("Connection Created");
            connection.close();
        } catch (Exception e) {
            System.out.println("Error is "+e);
        }
    }
}
