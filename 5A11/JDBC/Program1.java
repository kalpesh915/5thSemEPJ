public class Program1 {
    public static void main(String[] args) {
        try {
            // Loading the JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver Successfully Loaded");
        } catch (Exception e) {
            System.out.println("Error is "+e);
        }
    }
}
