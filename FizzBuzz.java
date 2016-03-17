/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Richmond Chris-Koka
 */
public class FizzBuzz {
    public static void main(String[] args) {
        
        for (int i = 1; i <= 100; i++) {
            //System.out.println(i);
            if(i%3==0){
                System.out.println("Fizz");
            }
            else if (i%5==0) {
                System.out.println("Buzz");
            }
            else if (i%3 == 0 && i%5==0){
                System.out.println("FizzBuzz");
            }
            else{
                System.out.println(i);
            }
        }
    }
}
