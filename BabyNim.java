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
public class BabyNim {
    public static void main(String[] args){
        //variable declaration and scanner object creation
        int A=3, B=3, C = 3;
        Scanner input = new Scanner (System.in);
        int userInput;
        String userChoice;
        
        //prompt statements
        System.out.println("A: 3\tB: 3\tC: 3");
        System.out.print("Choose a pile: ");
        System.out.println();
        
        userChoice = input.next();
        
        while (userChoice.equals("A") || userChoice.equals("B") || userChoice.equals("C")){
            
            
            System.out.print("How many to remove from pile "+userChoice +": ");
            userInput = input.nextInt();
            
           
        }
        
        //
    }
    
}
