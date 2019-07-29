//Prep 3.1
//Input/output: Modify your "Hello, World" program to prompt the user for their name, and greet them by name.

package exercises;
import java.util.Scanner;

public class HelloName {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String message = in.next();
        System.out.println("Hello " + message);
    }
}
