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
public class A1Q4 {

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

        // if 1 place one asterik
        if (number == 1) {
            System.out.println("*");
        }

        // if 2 place two asterik
        if (number == 2) {
            System.out.println("**");
        }

        // if 3 ...
        if (number == 3) {
            System.out.println("***");
        }

        // if 4 ...
        if (number == 4) {
            System.out.println("****");
        }

        // if 5 ...
        if (number == 5) {
            System.out.println("*****");
        }

        // if 6 ...
        if (number == 6) {
            System.out.println("******");
        }

        // if 7 ...
        if (number == 7) {
            System.out.println("*******");
        }

        // if 8 ...
        if (number == 8) {
            System.out.println("********");
        }

        // if 9 ...
        if (number == 9) {
            System.out.println("*********");
        }

        // if 10 ...
        if (number == 10) {
            System.out.println("**********");
        }
    }
}
