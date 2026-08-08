import java.sql.*;

public class Program4 {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/pu5a11";
            String username = "root";
            String password = "";
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();
            
            // Create table
            String query = "create table students (id int auto_increment primary key, fname varchar(20) not null, lname varchar(20) not null)";
            statement.execute(query);
            System.out.println("Table Created");
            statement.close();
            connection.close();
        } catch (Exception e) {
            System.out.println("Error is "+e);
        }
    }
}
