public class Program1 {
    public static void main(String[] args) {
        try{
            // Following code is used for load required drivers from our JAR file
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver Loaded");
        }catch(Exception err){
            //System.out.println("Error is "+err.getMessage());
            System.out.println("Error is "+err);
        }
    }
}
