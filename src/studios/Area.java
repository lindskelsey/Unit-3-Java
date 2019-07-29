package studios;

import java.util.Scanner;

//Write a program/class Area that prompts the user for a number,
// and then calculate the area of a circle with that radius and print the result.


//studio solution

public class Area {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a radius: ");
        double radius = in.nextDouble();
        double areaOfCircle = 3.14 * radius * radius;
        System.out.println("The area of a circle of radius " + radius + " is: " + areaOfCircle);
    }

}