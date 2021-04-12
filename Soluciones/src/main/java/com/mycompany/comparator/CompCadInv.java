/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.comparator;

import java.util.*;
        
/**
 *
 * @author eogieglo
 */

    
    // Ordena una matriz de cadenas en orden inverso.  
// Crea un Comparator que devuelve la salida 
// de una comparación de cadena inversa. 
public class CompCadInv implements Comparator<String> { 
 // Implementa el método compare( ) de modo que 
 // invierte el orden de la comparación de la cadena. 
 public int compare(String cadA, String cadB) { 
 // Compara cadB con cadA, en lugar de cadA con cadB. 
 return cadB.compareTo(cadA); 
 } 
} 
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
}
}
