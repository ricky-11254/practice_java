import java.util.Scanner;
import java.io.Console;
public class Assignment2{
    // a function to enter and check the password
    public void login()
    {
        String username, password;
        Scanner input = new Scanner(System.in);
        int tries = 1;
        // give the user three trials to input correct password and username
        while( tries<3){
            System.out.println("Enter Username: ");
            username = input.nextLine();
            // Use console to enter password securely
            Console console = System.console();
            char[] passwordArray = console.readPassword("Enter Password: ");
            password =  new String(passwordArray);
            System.out.println("Password entered: " + password);
            if ((username != username) && (password != password)) {
                System.out.println("Invalid username or password.");
            } 
            else if((username == username) && (password == password)) {
                System.out.println("Login Successful!");
            }
            tries++; 
        }
    }
    public static void main(String[] args){
        Assignment2 output = new Assignment2();
        output.login();
    }
}