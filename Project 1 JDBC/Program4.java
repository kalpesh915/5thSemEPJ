import java.sql.*;

public class Program4 {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url, username, password;
            url = "jdbc:mysql://localhost:3306/epjdemo";
            username = "root";
            password = "";
            
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();
            
            // Insert new rows in our table
            String query = "insert into students (fname, lname) values ('Ayush', 'Agrawal')";
            int count = statement.executeUpdate(query);
            System.out.println(count+ " Rows created in our students table");
            statement.close();
            connection.close();
        } catch (Exception err) {
            System.out.println("Error is "+err);
        }
    }
}
