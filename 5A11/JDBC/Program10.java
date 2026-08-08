import java.sql.*;
import java.util.Scanner;

public class Program10 {    
    public static void main(String[] args) {
        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/pu5a11";
            String username = "root";
            String password = "";
            Connection connection = DriverManager.getConnection(url, username, password);
            PreparedStatement ps = connection.prepareStatement("insert into students (fname, lname) values(?, ?)");
            
            ps.setString(1, "Anuj");
            ps.setString(2, "Pandey");
            ps.execute();
            
            ps.setString(1, "Arpit");
            ps.setString(2, "Pandey");
            ps.execute();
            
            ps.setString(1, "Aryan");
            ps.setString(2, "Pandey");
            ps.execute();
            
            ps.setString(1, "Amar");
            ps.setString(2, "Pandey");
            ps.execute();
            
            ps.setString(1, "Arjun");
            ps.setString(2, "Pandey");
            ps.execute();
            
            connection.close();
        } catch (Exception e) {
            System.out.println("Error is "+e);
        }
    }
}
