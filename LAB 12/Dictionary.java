import java.sql.*; //PROGRAM TO IMPLEMENT SQL QUERIES
import java.util.Scanner;

public class Dictionary {
    public static void main(String arg[]) {
        try {
            Scanner sc = new Scanner(System.in);
            String database = "oopsLab";
            String username = "root";
            String pass = "root";
            Class.forName("com.mysql.cj.jdbc.Driver"); // REGISTER DRIVER
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + database, username, pass);
            Statement stmt = con.createStatement();
            System.out.print("\nENTER WORD : ");
            String w = sc.nextLine();
            ResultSet rs = stmt.executeQuery("SELECT * FROM DICTIONARY WHERE WORD='" + w + "'");
            if (!rs.isBeforeFirst() ) {    
                System.out.println("Meaning Not Found");
            } 
            while (rs.next()) {
                String word = rs.getString("WORD");
                String meaning = rs.getString("MEANING");
                System.out.println(word + " :  " + meaning);
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

// java -cp .:/usr/share/java/mysql-connector-java-8.0.28.jar Dictionary