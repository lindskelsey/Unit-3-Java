//Prep 3.2

//Create and initialize an array with the following values in a single line: 1, 1, 2, 3, 5, 8.
// Then loop through the array and print out each value.

package exercises;

public class ArrayPrintValue {
    public static void main(String[] args) {
        //initialize array of integers
        int[] intArray = {1, 1, 2, 3, 5, 8};
        //loop through each item in array
        for (int i = 0; i < intArray.length; i++) {
            //print item at index in array
            System.out.println(intArray[i]);
        }

    }
}
