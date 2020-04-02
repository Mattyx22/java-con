import org.apache.ibatis.jdbc.ScriptRunner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;
import java.sql.Connection;
import java.sql.DriverManager;


public class Main{
    public static void main(String args[]) throws Exception {
        //Registering the Driver
        DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
        //Getting the connection
        String mysqlUrl = "jdbc:mysql://localhost:3306?serverTimezone=UTC";
        Connection con = DriverManager.getConnection(mysqlUrl, "root", "ZAQ!2wsx");
        System.out.println("Connection established......");
        //Initialize the script runner
        ScriptRunner sr = new ScriptRunner(con);
        //Creating a reader object
        Reader reader = new BufferedReader(new FileReader("C:\\Users\\matty\\IdeaProjects\\KMProjekt1\\src\\main\\resources\\query.sql"));
        //Running the script
        sr.runScript(reader);
    }
}