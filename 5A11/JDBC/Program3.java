import java.sql.*;

public class Program3 {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/pu5a11";
            String username = "root";
            String password = "";
            Connection connection = DriverManager.getConnection(url, username, password);
            // statmemt
            Statement statement = connection.createStatement();
            
            statement.close();
            connection.close();
        } catch (Exception e) {
            System.out.println("Error is "+e);
        }
    }
}
