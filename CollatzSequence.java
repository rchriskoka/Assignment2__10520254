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
public class CollatzSequence {
    public static void main(String[] args){
        //variable declaration and scanner object creation
        int userInput;
        int count = 0;
        Scanner input = new Scanner(System.in);
        
        //prompt statement
        System.out.print("Starting number: ");
        //accept input 
        userInput = input.nextInt();
        //computation
        System.out.println();
        System.out.print(userInput+" ");
        while (userInput != 1){
            if (userInput%2==0){
             userInput = userInput/2;
            
                System.out.print(userInput+" ");
                 count++;
        }
        else if (userInput%2 != 0){
             userInput = userInput*3 + 1;
             
                System.out.print(userInput+" ");
                count++;
        }
            //System.out.println("HI" + me);
        }
        System.out.println();
        System.out.println();
        System.out.println("Terminated after "+count+" steps");
        
    }
    
}
