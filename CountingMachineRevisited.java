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

public class CountingMachineRevisited
{
     public static void main( String[] args )
     {
	
	int userInput1, userInput2, userInput3;
        Scanner keyboard = new Scanner(System.in);
	
	System.out.print( "Count from: " );
	userInput1 = keyboard.nextInt();
	
	System.out.print( "Count to: " );
	userInput2 = keyboard.nextInt();

	System.out.print( "Count by: " );
	userInput3 = keyboard.nextInt();


	for ( int i = userInput1; i <= userInput2; i+=userInput3 )
  	{
  	   System.out.print(i + " ");
	   
	}
  
     }
}
