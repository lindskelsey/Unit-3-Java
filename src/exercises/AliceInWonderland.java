//Prep 3.1
//The first sentence of Alice's Adventures in Wonderland is below.
// Store this sentence in a string, and then prompt the user for a term to search for within this string.
// Print whether or not the search term was found. See if you can make the search case-insensitive,
// so that searching for "alice", for example, prints true.

package exercises;

import java.util.Scanner;

public class AliceInWonderland {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String book = "Alice was beginning to get very tired of sitting by her sister on the bank, " +
                "and of having nothing to do: once or twice she had peeped into the book her sister was reading, " +
                "but it had no pictures or conversations in it, " +
                "'and what is the use of a book,' thought Alice 'without pictures or conversation?'";

        System.out.print("Search term: ");
        String searchTerm = in.next();

        //covert book to lowercase and check if it contains searchTerm converted to lowercase
        if(book.toLowerCase().contains(searchTerm.toLowerCase())) {
            System.out.print("true");
        } else {
            System.out.print("false");
        }
    }
}
