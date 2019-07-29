package exercises;

import java.util.ArrayList;
import java.util.Collections;

//Prep 3.2

//Write a static method to find the sum of all the even numbers in a list.
// Within main, create a list with at least 10 integers and call your method on the list.


public class ArrayListSum {
    public static void main(String[] args) {

        //initialize arrayList
        ArrayList<Integer> numberList = new ArrayList<>();
        //add numbers to arrayList
        Collections.addAll(numberList, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        //call sumOfEvens method with arrayList
        sumOfEvens(numberList);

    }

    public static void sumOfEvens(ArrayList<Integer> numberList) {

        //initialize counter
        int sum = 0;

        //loop through every item in arrayList
        for (int i = 0; i < numberList.size(); i++) {
            //check if the item at index is divisible by 2
            if ((numberList.get(i) % 2) == 0) {
                //if divisible by 2, add to counter
                sum += numberList.get(i);
            }
        }
        //print sum
        System.out.println(sum);
    }
}
