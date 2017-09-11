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
public class A1Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // make a scanner
        Scanner in = new Scanner(System.in);
        
        // ask person for food expenses
        System.out.println("What are the food expenses?");
        double food = in.nextDouble();
        
        // DJ Expenses
        System.out.println("What is the DJ expenses?");
        double dJ = in.nextDouble();
        
        // Hall Rental
        System.out.println("What is the Hall Rental Expenses?");
        double hall = in.nextDouble();
        
        // Deco Expenses
        System.out.println("What are the expenses for Decorations?");
       double deco = in.nextDouble();
        
        // Wait Staff
        System.out.println("What are the Wait Staff Expenses?");
        double staff = in.nextDouble();
        
        // Miscellaneous Expenses
        System.out.println("What are the Miscellaneous Expenses?");
        double misc = in.nextDouble();
        
        // total amount of expenses
        double expenses = food + dJ + hall + deco + staff + misc;
        
        // determine break even price of tickets
        double breakEven = Math.ceil(expenses / 35);
               
        //Tell Break Even Amount of Tickets
        System.out.println("In order to reach break even, you must sell " + breakEven + " tickets.");
        
    }
}
