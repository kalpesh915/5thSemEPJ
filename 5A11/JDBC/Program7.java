import java.sql.*;
import java.util.Scanner;

public class Program7 {    
    public static void main(String[] args) {
        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/pu5a11";
            String username = "root";
            String password = "";
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();
            
            // Select Data
            
            String query = "select * from students";
            ResultSet rs = statement.executeQuery(query);
            
            while(rs.next()){
                System.out.println("Welcome "+rs.getString("fname")+" "+rs.getString("lname")+" your id is "+rs.getInt("id"));
            }
            
            statement.close();
            connection.close();
        } catch (Exception e) {
            System.out.println("Error is "+e);
        }
    }
}
