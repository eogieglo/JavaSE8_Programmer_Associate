/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



        
package practice_7_2;

/**
 *
 * @author eogieglo
 * 
 * Instantiating a StringBuilder Object
 * 
 */


public class ShoppingCart {
        public static void main(String[] args) {
        //Entry point of the program
        //code goes here in the code block
        //Write here
        
        String custName = "Steve Smith";
        String firstName;
        int spaceIdx;
        
        //Get the index of Space character (" ") in custName
        spaceIdx = custName.indexOf(" ");
        
        //Use the substring method to parse out the first name and print it.
        firstName = custName.substring(0,spaceIdx);
        
            System.out.println(firstName);
            
             //Instantiate and initialize sb to firstName
        StringBuilder sb = new StringBuilder(firstName);
        
        //Put the full name back together, using Stringbuilder append Method.
        //You can just enter the String literal for the last name
        //Print the full name
        sb.append(" Smith");
        
        //Optional ** Can you append the last name without a String literal?
        sb.append(custName.substring(spaceIdx));
            System.out.println(sb);
    }
}
