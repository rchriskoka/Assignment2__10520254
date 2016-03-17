/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package assignment2_10513947;

/**
 *
 * @author Richmond Chris-Koka
 */
import java.util.Scanner;
public class ALetterAtATime {
    public static void main(String[] args) {
        //variable declaration and scanner object creation
        String message;
        Scanner input = new Scanner (System.in);
        System.out.print("What is your message? ");
        message = input.nextLine();
        
        int length = message.length();
        int last = length-1;
        System.out.println("Your message is "+length+" characters long.");
        System.out.println("Your first character is at position 0 and is "+message.charAt(0));
        System.out.println("Your last character is at position "+last+" and is "+message.charAt(length-1));
        
        System.out.println("\nHere are all the characters, one at a time: ");
        
        for (int i = 0; i <length; i++) {
            System.out.println(i+ "- "+message.charAt(i));
        }
    }
}
