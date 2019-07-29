package studios;

import java.util.Scanner;

//bonus mission 2

//Extend your program further by using a while or do-while loop,
// so that when the user enters a negative number they are re-prompted.

public class AreaBonusMission2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a radius: ");
        double radius = in.nextDouble();
        while (radius < 0) {
            System.out.println("Enter a radius: ");
            radius = in.nextDouble();
        }
        double areaOfCircle = 3.14 * radius * radius;
        System.out.println("The area of a circle of radius " + radius + " is: " + areaOfCircle);

    }

}
