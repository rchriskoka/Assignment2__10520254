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
public class AddingValuesForLoop {
    public static void main(String[] args) {
        int userInput;
        int sum = 0;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Number: ");
        userInput = input.nextInt();
        
        for (int i = 1; i <= userInput; i++) {
            System.out.print(i+" ");
            sum = sum+i;
            
                       
        }
        System.out.println();
        System.out.println("The sum is "+sum);
    }
    
}
