/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.comparator;

import java.util.Arrays;

/**
 *
 * @author eogieglo
 */
// Demuestra el comparador de cadena inverso. 
class OrdenCadInv { 
 public static void main(String args[ ]) { 
 // Crea una matriz simple de cadenas. 
 String cads[ ] = { "perro", "caballo", "cebra", "vaca", "gato" }; 
 // Muestra el orden inicial. 
 System.out.print("Orden inicial: "); 
 for(String s : cads) 
 System.out.print(s + " "); 
 System.out.println("\n"); 
 // Ordena la matriz a la inversa. 
 // Empieza por crear un comparador de cadena inversa. 
 CompCadInv cci = new CompCadInv( ); 


// Ahora, ordena las cadenas empleando el comparador inverso. 
 Arrays.sort(cads, cci); 
 // Muestra el orden inverso. 
 System.out.print("Orden inverso: "); 
 for(String s : cads) 
 System.out.print(s + " "); 
 System.out.println("\n"); 
 // Para comparación, ordena la cadena de manera natural. 
 Arrays.sort(cads); 
 // Muestra el orden natural. 
 System.out.print("Orden natural: "); 
 for(String s : cads) 
 System.out.print(s + " "); 
 System.out.println("\n"); 
 } 
}