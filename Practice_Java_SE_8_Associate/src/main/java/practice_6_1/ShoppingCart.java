/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



        
package practice_6_1;

import practice_5_3.*;
import practice_5_2.*;


/**
 *
 * @author eogieglo
 * 
 * Modify the ShoppingCart to Use the Item fields 
 * 
 */


public class ShoppingCart {
        public static void main(String[] args) {
        //Entry point of the program
        //code goes here in the code block
        //Write here
        
        //Declare and initialize 2 items object
        Item item1,item2;
        item1=new Item();
        item2=new Item();
        
        //Print both items descriptions and run code
        item1.desc="Shirt";
        item2.desc="Pants";
        
        //Assign one item to another and run it again
        item1 = item2;
        System.out.println("Item1: " + item1.desc);
        System.out.println("Item2: " + item2.desc);
        
    }
}
