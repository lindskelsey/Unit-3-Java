package studios;

import java.util.Scanner;

//bonus mission 1

//Add validation to your program. If the user enters a negative number,
// print an error message and quit. You'll need to peek ahead to learn about conditional syntax in Java.

public class AreaBonusMission1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a radius: ");
        double radius = in.nextDouble();
        if (radius < 0) {
            System.out.println("Error: Radius cannot be a negative number");
        } else {
            double areaOfCircle = 3.14 * radius * radius;
            System.out.println("The area of a circle of radius " + radius + " is: " + areaOfCircle);

        }

    }
}