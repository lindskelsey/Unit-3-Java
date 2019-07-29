//Prep 3.1
//Numeric types: Write a program to calculate the area of a rectangle and print the answer to the console.
// You should prompt the user for the dimensions. (What data types should the dimensions be?)

package exercises;
import java.util.Scanner;

public class AreaRectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the width: ");
        int width = in.nextInt();
        System.out.print("Enter the height: ");
        int height = in.nextInt();
        System.out.println(width * height);
    }
}
