import java.sql.*;

public class Program3 {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url, username, password;
            url = "jdbc:mysql://localhost:3306/epjdemo";
            username = "root";
            password = "";
            
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();
            
            // create table
            String query = "create table students (id int auto_increment primary key, fname varchar(20) not null, lname varchar(20) not null)";
            if(statement.execute(query)){
                System.out.println("Table Created");
            }else{
                System.err.println("Table not Created");
            }
            
            statement.close();
            connection.close();
        } catch (Exception err) {
            System.out.println("Error is "+err);
        }
    }
}
