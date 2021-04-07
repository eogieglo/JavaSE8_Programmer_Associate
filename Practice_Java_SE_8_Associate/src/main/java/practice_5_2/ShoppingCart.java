/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice_5_2;

import practice_5_1.*;


/**
 *
 * @author eogieglo
 * 
 * Using an Array
 * 
 */
public class ShoppingCart {
        public static void main(String[] args) {
        //Entry point of the program
        //code goes here in the code block
        //Write here
        String custName = "Mary Smith";
        String message;
        
        /* Declare and initialize the item String Array with
           4 item descriptions
        */
        String[] items={"Shirt","Socks","Scarf","Belt"};
        
        //Change message to show the items purchased
        message = custName + " wants to purchase " + items.length + " items.";
            System.out.println(message);
            
        //Print an element from the items array
            System.out.println(items[2]);
            System.out.println(items[3]);
            System.out.println(items[1]);
            //System.out.println(items[4]); // What happens if you use index number 4?
     
            /*
            Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 4
                at practice_5_2.ShoppingCart.main(ShoppingCart.java:39)
                    Command execution failed.
            */
    }
}
