/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2_10533695;

/**
 *
 * @author Emmanuel Owusu
 * 10533695
 *
 */
import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        Random r = new Random();
        
        int x = 1 + r.nextInt(10);
        
        int y = 0;
        
        System.out.println("I'm thinking of a number from 1 to 10.");
        System.out.println("Your Guess:  ");
        y = input.nextInt();
        
        if( y == x ){
            System.out.println("That,s right! My secret number was " + x);
            
        }
        if (y != x){
            System.out.println("Sorry, but i was really thinking of " + x);
            
        }
    }
}
