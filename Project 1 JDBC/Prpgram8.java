import java.sql.*;
public class Prpgram8 {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/5a17";
            String username = "root";
            String password = "";
            Connection connection = DriverManager.getConnection(url, username, password);
            
            PreparedStatement ps = connection.prepareStatement("insert into students (fname, lname) values (?,?)");
            ps.setString(1, "Demo");
            ps.setString(2, "Text");
            
            ps.execute();
            
            System.out.println("Data Inserted");
            
        } catch (Exception e) {
            System.out.println("Error "+e);
        }
    }
}
