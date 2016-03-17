/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Richmond Chris-Koka
 */
public class Dice {
    public static void main(String[] args){
        //variable declaration
        int dice1, dice2, total;
        
        //generate random numbers from 1-6 for both dice
        //the random value is converted to an integer as its by default a double
        //and then 1 is added since by default it generates from 0.0
        dice1 = (int)(6*Math.random()+1); 
        dice2 = (int)(6*Math.random()+1);
        total = dice1 + dice2;
        
        //display output
        System.out.println("HERE COMES THE DICE!");
        System.out.println();
        System.out.println("Roll #1: "+dice1);
        System.out.println("Roll #2: "+dice2);
        System.out.println("The total is "+total+"!");
        
    }
    
}
