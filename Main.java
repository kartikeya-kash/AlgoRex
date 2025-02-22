import java.util.Scanner; // for input 
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

public class Main {

    private static final String Url = "jdbc:mysql://127.0.0.1:3306/"; 

    private static final String username = "root";

    private static final String password = "Kash@17022005";

    public static void main(String [] args){
        userdata user = new userdata();
        user.user_input(); // used to take inputs from user 




    }
}
