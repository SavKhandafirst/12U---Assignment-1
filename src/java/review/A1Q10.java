/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Java.Review;

import java.util.Scanner;

/**
 *
 * @author khans4349
 */
public class A1Q10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a scanner for input
        Scanner input = new Scanner(System.in);

        // make an array for the ten words
        String words[] = new String[1000000];

        // ask user to input words
        System.out.println("Input words");

        // make an array for the words
        // repeat process for the duration of the array
        for (int i = 0; i < words.length; i++) {
            words[i] = input.nextLine();

            // if the user enters exit, quit the program
            if (words[i].equalsIgnoreCase("exit")) {
                System.out.println("You ended program");

                // tell them how many words were inputted
                System.out.println("Number of words inputted is " + (i));
                break;
            }
        }
    }
}
