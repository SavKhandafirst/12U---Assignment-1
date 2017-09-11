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
public class A1Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // create scanner
        Scanner in = new Scanner(System.in);
        
        // create an array
        double[] number = new double[3];
        
        // ask person for three numbers
        System.out.println("Please input 3 numbers");
        number[0] = in.nextDouble();
        number[1] = in.nextDouble();
        number[2] = in.nextDouble();
        
        // determine the product of the three numbers multiplied
        double product = number[0] * number[1] * number[2];
        
        // determine the square root of product
        double squareRooted = Math.sqrt(product);
        
        // determine the square of product
        double square = Math.pow(product, 2);
        
        // tell the answer to user
        System.out.println("The product of the numbers are " + product + ".");
        
        // tell the square root of product
        System.out.println("The square root of the product is " + squareRooted + ".");
        
        // tell the square of product
        System.out.println("The product's square is " + square + ".");
        
        
        
        
        
        
        
    }
}
