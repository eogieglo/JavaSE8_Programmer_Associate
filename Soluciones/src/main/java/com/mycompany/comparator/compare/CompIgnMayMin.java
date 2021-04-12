/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.comparator.compare;

/**
 *
 * @author eogieglo
 */

// Ordena una matriz de cadenas, ignora la diferencia 
// entre mayúsculas y minúsculas. 

import java.util.*; 


// Crea un Comparator que devuelve el resultado 
// de una comparación no sensible a mayúsculas y minúsculas. 
class CompIgnMayMin implements Comparator<String> { 
 // Implementa el método compare( ) para que ignore las 
 // diferencias entre mayúsculas y minúsculas cuando compare cadenas. 
 public int compare(String cadA, String cadB) { 
 return cadA.compareToIgnoreCase(cadB); 
 } 
} 

