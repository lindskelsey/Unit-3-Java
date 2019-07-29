//Prep 3.2

//Write a static method to print out each word in a list that has exactly 5 letters.

package exercises;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListAndStrings {
    public static void main(String[] args) {
        //initialize arrayList
        ArrayList<String> wordList = new ArrayList<>();
        //add numbers to arrayList
        Collections.addAll(wordList, "hello", "dog", "apple", "cat", "pencil");
        //call sumOfEvens method with arrayList
        printFives(wordList);

    }

    public static void printFives(ArrayList<String> wordList) {
        //loop through every item in arrayList
        for (int i = 0; i < wordList.size(); i++) {
            //check if length of string at index is 5
            if (wordList.get(i).length() == 5) {
                //print out word
                System.out.println(wordList.get(i));
            }
        }

    }
}
