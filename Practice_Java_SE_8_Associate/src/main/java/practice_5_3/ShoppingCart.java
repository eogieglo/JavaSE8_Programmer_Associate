/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice_5_3;

import practice_5_2.*;


/**
 *
 * @author eogieglo
 * 
 * Using a Loop to Process an Array
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
            
        //Iterate trough and print out the items form the items array
        System.err.println(" ");    
        System.err.println("Items purchased");
        System.err.println(" ");
        for (String item : items) {
            System.err.println(item + ", ");
        }
          
    }
}
