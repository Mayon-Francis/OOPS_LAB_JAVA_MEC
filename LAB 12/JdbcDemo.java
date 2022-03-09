import java.sql.*; //PROGRAM TO IMPLEMENT SQL QUERIES
import java.util.Scanner;

public class JdbcDemo {
    public static void main(String arg[]) {
        try {
            Scanner sc = new Scanner(System.in);
            String database = "oopsLab";
            String username = "root";
            String pass = "root";
            Class.forName("com.mysql.cj.jdbc.Driver"); // REGISTER DRIVER
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + database, username, pass);
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM DICTIONARY");
            ResultSetMetaData rsmd = rs.getMetaData();
            int columnCount = rsmd.getColumnCount();

            // The column count starts from 1
            for (int i = 1; i <= columnCount; i++ ) {
                System.out.print(rsmd.getColumnName(i) + "\t");
            }
            System.out.println("");
            while (rs.next()) {
                for (int i = 1; i <= columnCount; i++ ) {
                    System.out.print(rs.getString(i) + "\t");
                }          
                System.out.println(""); 
            }
            System.out.println(""); 
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

// java -cp .:/usr/share/java/mysql-connector-java-8.0.28.jar JdbcDemo