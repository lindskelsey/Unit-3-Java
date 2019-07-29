//Prep 3.1
//Write a program that asks a user for the number of miles they have driven
// and the amount of gas they've consumed (in gallons), and print their miles-per-gallon.

package exercises;
import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("How many miles have you driven?: ");
        double miles = in.nextDouble();
        System.out.print("How many gallons of gas have you used?: ");
        double gallons = in.nextDouble();
        System.out.println(miles/gallons);
    }
}
