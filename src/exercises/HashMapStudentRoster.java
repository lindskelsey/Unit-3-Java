//Prep 3.2

//Make a program similar to GradebookHashMap, but which takes in students names and ID numbers (as integers)
// instead of names and grades. In this case, however, the keys should be integers (the IDs)
// and the values should be strings (the names). Modify the roster printing code accordingly.

package exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapStudentRoster {
    public static void main(String[] args) {

        //initialize hashMap with int key and string value
        HashMap<Integer, String> students = new HashMap<>();
        Scanner in = new Scanner(System.in);
        String newStudent;

        System.out.println("Enter your students (or ENTER to finish):");

        // Get student names and ids
        do {

            System.out.print("Student: ");
            newStudent = in.nextLine();

            if (!newStudent.equals("")) {
                System.out.print("Id Number: ");
                int idNumber = in.nextInt();
                students.put(idNumber, newStudent);

                // Read in the newline before looping back
                in.nextLine();
            }

        } while(!newStudent.equals(""));

        // Print class roster
        System.out.println("\nClass roster:");

        for (Map.Entry<Integer, String> student : students.entrySet()) {
            System.out.println(student.getKey() + " " + student.getValue());
        }
    }
}
