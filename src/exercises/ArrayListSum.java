package exercises;

import java.util.ArrayList;
import java.util.Collections;

//Prep 3.2

//Write a static method to find the sum of all the even numbers in a list.
// Within main, create a list with at least 10 integers and call your method on the list.


public class ArrayListSum {
    public static void main(String[] args) {

        ArrayList<Integer> numberList = new ArrayList<>();
        Collections.addAll(numberList, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        sumOfEvens(numberList);

    }

    public static void sumOfEvens(ArrayList<Integer> numberList) {

        int sum = 0;

        for (int i = 0; i < numberList.size(); i++) {
            if (numberList.get(i) % 2 == 0) {
                sum += numberList.get(i);
            }
        }
        System.out.println(sum);
    }
}
