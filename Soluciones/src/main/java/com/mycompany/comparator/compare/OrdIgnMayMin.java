/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.comparator.compare;

import java.util.Arrays;

/**
 *
 * @author Administrador
 */
 
class OrdIgnMayMin { 
 public static void main(String args[ ]) { 
     // Demuestra el comparador de cadenas que es insensible a
// diferencias entre mayúsculas y minúsculas. 

 // Crea una matriz simple de cadenas. 
 String cads[ ] = { "alfa", "Gama", "Zeta", "beta", }; 
 // Muestra el orden inicial. 
 System.out.print("Orden inicial: "); 
 for(String s : cads) 
 System.out.print(s + " "); 
 System.out.println("\n"); 
 // Ordena la matriz pero ignora las diferencias entre
 // mayúsculas y minúsculas. Crea un comparador de
 // cadenas que no es sensible a mayúsculas y minúsculas. 
 CompIgnMayMin cimm = new CompIgnMayMin( ); 
 // Ordena las cadenas usando el comparador. 
 Arrays.sort(cads, cimm); 
 // Muestra el orden no sensible a mayúsculas y minúsculas. 
 System.out.print("Orden insensible a may\u00a3sculas y min\u00a3sculas: "); 
 for(String s : cads) 
 System.out.print(s + " "); 
 System.out.println("\n"); 
 // Para comparación, ordena las cadenas en el orden predeterminado, 
 // que es sensible a diferencias entre mayúsculas y minúsculas. 
 Arrays.sort(cads); 
 // Muestra el orden sensible a mayúsculas y minúsculas. 
 System.out.print("Orden predeterminado, sensible a diferencias: "); 
 for(String s : cads) 
 System.out.print(s + " "); 
 System.out.println("\n"); 
}
}