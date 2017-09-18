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
public class A1Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Ask For user's name program

        // Ask for user's name
        System.out.println("What is your name?");

        // make scanner
        Scanner in = new Scanner(System.in);

        // collect persons name
        String name = in.nextLine();

        // say hello
        System.out.println("Hello " + name);
    }
}
