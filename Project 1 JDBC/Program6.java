import java.sql.*;

public class Program6 {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url, username, password;
            url = "jdbc:mysql://localhost:3306/epjdemo";
            username = "root";
            password = "";
            
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();
            
            // fetch the data from student table
            String quetry = "select * from students";
            ResultSet resultSet = statement.executeQuery(quetry);
            
            //ResultSetMetaData rsm = resultSet.getMetaData();
            //System.out.println("Number of rows in Resultset "+rsm.getColumnCount());
            
            // loop through our resultset
            while(resultSet.next()){
                System.out.println("Welcome "+resultSet.getNString("fname") + " "+resultSet.getString("lname")+" Your ID is "+resultSet.getInt("id"));
            }
            
            resultSet.close();
            statement.close();
            connection.close();
        } catch (Exception err) {
            System.out.println("Error is "+err);
        }
    }
}
