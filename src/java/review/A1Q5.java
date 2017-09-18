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
public class A1Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // make a scanner
        Scanner in = new Scanner(System.in);

        // ask user for number requested
        System.out.println("Please input desired number between 1 and 10");

        // record value given by user
        int number = in.nextInt();

        // set the asterik string
        String asterik = "*";

        // make a for loop to repeat the asterik grid
        for (int x = 0; x < number; x++) {
            // add another loop within the loop to form the 2D asterik grid
            for (int z = 0; z < number; z++) {
                // print out asterik
                System.out.print(asterik);
            }
            // add another space for each line
            System.out.println();
        }



    }
}
