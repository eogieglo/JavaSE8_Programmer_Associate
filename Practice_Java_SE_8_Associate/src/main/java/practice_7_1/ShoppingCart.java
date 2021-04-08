/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



        
package practice_7_1;



/**
 *
 * @author eogieglo
 * 
 * Use the indexOf() and substring() Methods 
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
        
        
    }
}
