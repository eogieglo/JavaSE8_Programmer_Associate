/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice_5_1;

import practice_4_2.*;

/**
 *
 * @author eogieglo
 * 
 * Using and Manipulation numbers
 * 
 */
public class ShoppingCart {
        public static void main(String[] args) {
        //Entry point of the program
        //code goes here in the code block
        //Write here
        System.out.println(" ");
        System.out.println("Welcome to the Shopping Cart");
        
        //System.out.println(<some string value>);  String literal 
        
        //Practice 4-2
        String custName = "Mary Smith";
        String itemDesc = "Shirt";
        String message;
        //Numeric Fields
        double price = 25.50;
        double tax = 2;
        int quantity = 3;
        double total;
        
        //Assign de message variable
        System.out.println(" ");
        message = custName + " wants to a purchase a " + quantity + " " +itemDesc;
        
        //Calculate total
        total = price * quantity * tax;
        
        //Use if statement to test the quantity of the item
            if (quantity > 1) {
                System.out.println(" ");
                System.out.println(message +"s");
                System.out.println(" ");
            }
       
             //Boolean
        boolean outOfStock = true;//Try RUN false or true
        
        //Use if / else statement to test Stock
        if(outOfStock){
            System.out.println(itemDesc + " product is unavailable");
        }else{
            System.out.println(" ");
            System.out.println("And the total is: " + total);    
        }
            
        
    }
}
