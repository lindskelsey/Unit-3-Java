package studios;

import java.util.HashMap;
import java.util.Map;


public class CountingCharacters {
    public static void main(String[] args) {

        //initialize empty HashMap that takes a key as a character and a value as an integer
        HashMap<Character, Integer> characterCounts = new HashMap<>();
        //string to test code with
        String testString = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc accumsan sem ut ligula scelerisque sollicitudin. Ut at sagittis augue. Praesent quis rhoncus justo. Aliquam erat volutpat. Donec sit amet suscipit metus, non lobortis massa. Vestibulum augue ex, dapibus ac suscipit vel, volutpat eget massa. Donec nec velit non ligula efficitur luctus.";

        //convert string to array of characters
        char[] charactersInString = testString.toCharArray();

        //loop through each element in array
        for (char character : charactersInString) {
            //if the character already exists in the characterCounts HashMap, add 1 to value
            if (characterCounts.containsKey(character)) {
                characterCounts.put(character, characterCounts.get(character) + 1);
                //if character does not exist in HashMap, add key and value
            } else {
                characterCounts.put(character, 1);
            }
        }
        //for each element in HashMap, print key and value
        for (Map.Entry<Character, Integer> oneChar : characterCounts.entrySet()) {
            System.out.println(oneChar.getKey() + ": " + oneChar.getValue());
        }

    }
}
