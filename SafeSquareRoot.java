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
public class SafeSquareRoot {
    public static void main(String[] args){
        //variable declaration and scanner object creation
        int userInput;
        Scanner input = new Scanner (System.in);
        //prompt statement
        System.out.println("SQUARE ROOT!");
        System.out.print("Enter a number: ");
        
        //accept input
        userInput = input.nextInt();
        
        while(userInput<0){
            System.out.println("You can't take the sqare root of a negative number, silly");
            System.out.print("Try again: ");
            userInput = input.nextInt();
        }
        if (userInput > 0){
            System.out.println("The square root of "+userInput+" is "+Math.sqrt(userInput));
        }
    }
    
}
