
import java.util.Scanner;

public class Greeting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        
        System.out.println("What's your name? ");
        
        // prompt - users name ?
        String name = scanner.nextLine();     
        
        // their name
        
        // program prints hi + their name
        System.out.println("Hi " + name);
    
    }
}