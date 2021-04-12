/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.comparator.collator;

import java.text.Collator;
import java.util.*;
        
/**
 *
 * @author eogieglo
 */


// Este Comparator usa un Collator para determinar 
// el orden lexicográfico apropiado, insensible a mayúsculas 
// y minúsculas de dos cadenas. 
class CompIgnMayMin implements Comparator<String> { 
 Collator col; 
 CompIgnMayMin( ) { 
 // Obtiene un Collator para este idioma. 
 col = Collator.getInstance( ); 
 // Sólo tiene que considerar diferencias primarias. 
 col.setStrength(Collator.PRIMARY); 
 } 
 // Usel el método compare( ) de Collator para comparar cadenas. 
 public int compare(String cadA, String cadB) { 
 return col.compare(cadA, cadB); 
 } 
}