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
public class A1Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // make a scanner
        Scanner in = new Scanner(System.in);
        
        // ask user for number requested
        System.out.println("Enter a number between 50 and 100 to stop at");
        
        // recieve value from user
        int number = in.nextInt();
        
        // create for loop to know when to stop
        for(int counter = 100; counter > number; counter -= 5){
            System.out.println(counter);
        }
    }
}
