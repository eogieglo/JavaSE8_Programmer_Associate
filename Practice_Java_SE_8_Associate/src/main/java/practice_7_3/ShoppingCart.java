/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



        
package practice_7_3;

/**
 *
 * @author eogieglo
 * 
 * Declaring a long, float, and char
 * 
 */


public class ShoppingCart {
        public static void main(String[] args) {
        //Entry point of the program
        //code goes here in the code block
        //Write here
        
        int int1;
        
        //Declare variables
        long long1 = 99_000_000_000L;
        float fltl = 13.5F;
        char ch1 = 'U';
        
        //Print the long variable
            System.out.println("Long 1: " + long1);
        
        //Assign the long to the int and print the int variable
        int1 = (int) long1;
            System.out.println("Long assigned to int variable: " + int1);
    }
}
