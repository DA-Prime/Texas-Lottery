/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.eclipse.danielavalos;

/**
 *
 * @author da720
 */
import java.util.Scanner;

public class TexasLottoDA {

    public static void main(String[] args) {
        // Generate a 3-Digit lottery ticket
        String lotNum = "" + (int)(Math.random() * 10)
        + (int)(Math.random() * 10) + (int)(Math.random() * 10);
        
        // The User will enter a guess
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your lottery pick (3-Digit): ");
        String guessNum = input.nextLine();
        
        // Digits from the lottery
        char lD1 = lotNum.charAt(0);
        char lD2 = lotNum.charAt(1);
        char lD3 = lotNum.charAt(2);
        
        // Digits from the User's pick
        char gD1 = guessNum.charAt(0);
        char gD2 = guessNum.charAt(1);
        char gD3 = guessNum.charAt(2);
        
        System.out.println("The lottery number is " + lotNum);
        
        // Checks if the Guess matches at least any form of the Lot ticket.
        if (guessNum.equals(lotNum)) {
            System.out.println("Exact match, Congratulations "
            + "you've won $10,000!!!");
        } else if ((lD1 == gD2 && lD2 == gD3 && lD3 == gD1)
                || (lD1 == gD3 && lD2 == gD1 && lD3 == gD2)
                || (lD1 == gD1 && lD2 == gD3 && lD3 == gD2)
                || (lD2 == gD2 && lD1 == gD3 && lD3 == gD1)
                || (lD3 == gD3 && lD1 == gD2 && lD2 == gD1)
        ) {
            System.out.println("All the Digits match, you win $3,000!!!");
        }
        else if (lD1 == gD1 || lD1 == gD2 || lD1 == gD3
                || lD2 == gD2 || lD2 == gD1 || lD2 == gD3
                || lD3 == gD3 || lD3 == gD1 || lD3 == gD2) {
            System.out.println("One of the Digits match, you win $1,000!!!");
        } else {
            System.out.println("Sorry no matches, better luck next time!!!");
        }
    }
}
