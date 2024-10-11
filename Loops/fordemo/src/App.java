/*Use the for loop to create a programm that ask the user to input a name and then prints each of the letters of the name
Hint You can use the following String functions:

lenght() -> returns the total number of characters of a given String
chartAt(i) -> returns the character at the given position(i) of a String */

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception 
    {
        System.out.println("FOR loop example");

        Scanner scanner = new Scanner(System.in);

        // Ask the user to input a name
        System.out.print("Please enter your name: ");
        String name = scanner.nextLine();

        // Get the length of the name
        int length = name.length();

        // Use a for loop to print each character
        for (int i = 0; i < length; i++) 
        {
            char letter = name.charAt(i);
            System.out.println(letter);
        }

        scanner.close();
    }
}
