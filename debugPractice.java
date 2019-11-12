//Name:
//VUNetID:
//Class: CS 1101
//Section:
//Date:
//Description: This class contains three methods with errors that can be used to practice various
//              debugging techniques.

import java.util.Scanner;

public class debugPractice {

    public static void main(String[] args) {

        // Can you find the two errors in this method? How can the scanner help
        // 1.
        // 2.
        // TODO: Uncomment the line below to call the method
         scannerPractice();

        // What indexing error did we make in this method? How could the debugger easily show that.
        // What happens if testString doesn't end with an exclamation mark?
        // TODO: Uncomment the line below to call the method
        String testString = "Yoooooo!!!!! That was soooooo dope!!!!!!!!!!!! OMG!!! THANKU!!!!";
        //stringDebugging(testString);

        // Can you tell me what the fourth iteration of num is in this method without modifying
        // the code? The debugger makes it easy
        // TODO: Uncomment the line below to call the method
        // numberLoop();
    }

    public static void scannerPractice() {
        Scanner scnr = new Scanner(System.in);
        int num = -1;

        //TODO: Hints
        // Why is this loop infinite?
        // What happens if you enter an invalid input?
        while (num < 0) {
            System.out.println("Enter a positive number.");
            if (scnr.hasNextInt()) {
                int num2 = scnr.nextInt();
            }
        }
        System.out.println("You picked " +num);
    }

    /**
     * Example for debugging String indexing errors
     */
    private static void stringDebugging(String userString) {
        String tempStr = "";
        int i = 0;

        // Loop through every character in userString
        while (i < userString.length()) {
            if (userString.charAt(i) != '!') {
                // TODO - We've made a String indexing error. Can you find it?
                i++;
                tempStr += userString.charAt(i);
            } else {
                while ((i < userString.length()) && (userString.charAt(i) == '!')) {
                    i++;
                }

                tempStr += '!';
            }
        }

        // Replace exclamation points with periods
        tempStr = tempStr.replace("!", ".");

        // Print out corrected String
        System.out.println("Corrected: " + tempStr);
    }


    public static void numberLoop() {
        int num = 32;

        //TODO: How can you use a break statement to incrementally move through this loop?
        for (int i = 0; i < 10; ++i) {
            num = num * (15 ^ 2);
        }

    }

}