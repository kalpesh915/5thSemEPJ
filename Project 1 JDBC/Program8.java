import java.sql.*;

public class Program8 {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url, username, password;
            url = "jdbc:mysql://localhost:3306/epjdemo";
            username = "root";
            password = "";
            
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();

            // Delete data
            String query = "delete from students where id = 1";
            int count = statement.executeUpdate(query);
            
            System.out.println(count+ " Rows Deleted in Table");
            
            statement.close();
            connection.close();
        } catch (Exception err) {
            System.out.println("Error is "+err);
        }
    }
}
