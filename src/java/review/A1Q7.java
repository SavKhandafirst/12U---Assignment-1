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
public class A1Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a scanner for input
        Scanner input = new Scanner(System.in);

        // population checker
        double currentPopulation = 6;

        // create year counter to see how many times the population increase is applied
        int count = 1999;

        // make while loop to figure out year automatically
        while (currentPopulation <= 10) {
            currentPopulation = currentPopulation * 1.014;
            count = count + 1;

        }
        // tell the user when the population will be 10 billion
        System.out.println("The Population will be 10 Billion in " + count);



    }
}
