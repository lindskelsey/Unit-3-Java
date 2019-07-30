package studios;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


//Make the counts case-insensitive
//Exclude non-alphabetic characters
//User input


public class CountingCharactersBonusMissions {
    public static void main(String[] args) {

        //initialize empty HashMap that takes a key as a character and a value as an integer
        HashMap<Character, Integer> characterCounts = new HashMap<>();
        //get user input
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String testString = in.nextLine();
        //convert string to array of characters
        char[] charactersInString = testString.toCharArray();

        //loop through each element in array
        for (char character : charactersInString) {

            //if character is not a letter, continue
            if(!Character.isLetter(character)) {
                continue;
            }
            //if the character already exists in the characterCounts HashMap, add 1 to value
            //convert to lowercase to make case insensitive
            else if (characterCounts.containsKey(Character.toLowerCase(character))) {
                characterCounts.put(Character.toLowerCase(character), characterCounts.get(Character.toLowerCase(character)) + 1);
                //if character does not exist in HashMap, add key and value
            } else {
                characterCounts.put(Character.toLowerCase(character), 1);
            }
        }
        //for each element in HashMap, print key and value
        for (Map.Entry<Character, Integer> oneChar : characterCounts.entrySet()) {
            System.out.println(oneChar.getKey() + ": " + oneChar.getValue());
        }

    }
}
