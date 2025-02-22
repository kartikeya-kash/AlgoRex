import java.util.Scanner; // for input 
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

public class Main {

    private static final String Url = "jdbc:mysql://127.0.0.1:3306/hackx"; 

    private static final String username = "root";

    private static final String password = "Kash@17022005";


    public static void main (String args[]) throws SQLException, ClassNotFoundException{ // can throw exception 

        userdata user = new userdata();
        user.user_input(); // used to take inputs from user

        try{
            Class.forName("com.mysql.cj.jdbc.Driver"); // load all drivers
        }catch(ClassNotFoundException e){
            System.out.println(e.getMessage());
        }

        try{
            Connection connection = DriverManager.getConnection(Url, username, password); // load the connection in "connection"
            while (true) {
                System.out.println();
                System.out.println("👋 Welcome! I’m your AI-powered Medical Examiner Assistant 🤖🩺, here to conduct preliminary health assessments for insurance underwriters. I streamline the evaluation process with accuracy and efficiency. How can I assist you today? 😊");
                System.out.println("1. ✅ Ask about a specific medical condition ❓ ");
                System.out.println("2. ✅ Start the preliminary health assessment 📝");
                System.out.println("0. Exit");
                System.out.println("Select an option: ");
                Scanner scanner = new Scanner(System.in);
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                       
                        break;
                    case 2:
                    
                        break;
                    case 0:
                        exit(); //exit function
                        scanner.close();
                        return;
    
                    default:
                    System.out.println("Invalid input please select again!");
                        break;
                }
            }

        }catch(SQLException e){
            System.out.println(e.getMessage());
        }catch(InterruptedException e){
            throw new RuntimeException(e);
        }
    

    }
    
}
