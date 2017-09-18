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
public class A1Q8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a scanner for input
        Scanner input = new Scanner(System.in);

        // ask user amount in savings account
        System.out.println("Enter initial amount in savings account");
        double account = input.nextDouble();

        // know when account value is doubled
        double accountDoubled = account * 2;

        // ask user the interest rate
        System.out.println("Enter the interest rate applied onto the savings account");
        double rate = input.nextDouble();

        // add the one so that it retains the previous amount as well as the increase
        rate = rate + 1;

        // examine years interest rate is applied
        int year = 2017;

        // loop until money is doubled
        while (account != account * 2) {
            account = account * rate;
            year = year + 1;
            if (accountDoubled <= account) {
                System.out.println("Year when account doubles: " + year);
                break;
            }
        }

        // loop until reaches 1 million
        while (account < 1000000) {
            account = account * rate;
            year = year + 1;
        }
        // tell user when account reaches 1 million
        System.out.println("Year when account reaches 1 million: " + year);
    }
}
