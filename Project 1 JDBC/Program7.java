import java.sql.*;

public class Program7 {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url, username, password;
            url = "jdbc:mysql://localhost:3306/epjdemo";
            username = "root";
            password = "";
            
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();

            // Update data
            String query = "update students set fname = 'RAJVEER' where id = 2";
            int count = statement.executeUpdate(query);
            
            System.out.println(count+ " Rows Updated in Table");
            
            statement.close();
            connection.close();
        } catch (Exception err) {
            System.out.println("Error is "+err);
        }
    }
}
