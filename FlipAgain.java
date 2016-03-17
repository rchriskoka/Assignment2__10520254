/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Richmond Chris-Koka
 */


import java.util.Random;
import java.util.Scanner;

public class FlipAgain
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		Random rng = new Random();

		String again;
		//again = keyboard.nextLine();
		// System.out.print("You flip a coin and it is...
		int flip = rng.nextInt(2);
			String coin;

			if ( flip == 1 ){
				coin = "HEADS";
			}
			else {
				coin = "TAILS";
			}

			System.out.println( "You flip a coin and it is... " + coin );

			System.out.print( "Would you like to flip again (y/n)? " );
			again = keyboard.next();

		while ( again.equals("y") )
		{
			//int flip = rng.nextInt(2);
			//String coin;

			if ( flip == 1 )
				coin = "HEADS";
			else
				coin = "TAILS";

			System.out.println( "You flip a coin and it is... " + coin );

			System.out.print( "Would you like to flip again (y/n)? " );
			again = keyboard.next();
		}
	}
}
