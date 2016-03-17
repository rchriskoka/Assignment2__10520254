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

public class CountingMachine
{
     public static void main( String[] args )
     {
	
	int userInput;
        Scanner keyboard = new Scanner(System.in);
	
	System.out.print( "Count to: " );
	userInput = keyboard.nextInt();

	for ( int i = 0; i <= userInput; i++ )
  	{
  	   System.out.print(i + " ");
	}
  
     }
}
