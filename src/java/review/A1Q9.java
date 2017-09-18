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
public class A1Q9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a scanner for input
        Scanner input = new Scanner(System.in);

        // make an array for the ten words
        String words[] = new String[10];

        // ask user to input ten words
        System.out.println("Input 10 words");
        for (int i = 0; i < 10; i++) {
            words[i] = input.nextLine();
        }

        //detrmine the total of all the words
        double total = words[0].length() + words[1].length() + words[2].length()
                + words[3].length() + words[4].length()
                + words[5].length() + words[6].length()
                + words[7].length() + words[8].length()
                + words[9].length();

        // tell the user the average word length    
        System.out.println(total / 10);
    }
}
