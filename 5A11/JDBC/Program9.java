import java.sql.*;
import java.util.Scanner;

public class Program9 {    
    public static void main(String[] args) {
        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/pu5a11";
            String username = "root";
            String password = "";
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();
            
            
            String query = "delete from students where id = 1";
            statement.execute(query);
            System.out.println(statement.getUpdateCount()+" Rows Deleted ");
            
            statement.close();
            connection.close();
        } catch (Exception e) {
            System.out.println("Error is "+e);
        }
    }
}
