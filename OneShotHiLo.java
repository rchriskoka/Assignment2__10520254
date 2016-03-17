/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Richmond Chris-Koka
 */
import java.util.Scanner;
public class OneShotHiLo {
    public static void main(String[] args){
        //variable declaration and scanner object creation
        int compuGuess, userGuess;
        Scanner input = new Scanner (System.in);
        
        //generate random number and store in compuGuess
        compuGuess = (int)(100*Math.random()+1);
        //prompt statement
        System.out.println("I'm thinking of a number between 1-100. Try to guess it.");
        //accept user's input
        userGuess = input.nextInt();
        //checking if user's guess is the same as computer's guess.
        if (userGuess == compuGuess){
            System.out.println("You guessed it! What are the odds?!?");
        }
        else if (userGuess < compuGuess){
            System.out.print("Sorry, you are too low.");
            System.out.println(" I was thinking of "+compuGuess);
        }
        else{
            System.out.print("Sorry, you are too high.");
            System.out.println(" I was thinking of "+compuGuess);
        }
    }
    
}
