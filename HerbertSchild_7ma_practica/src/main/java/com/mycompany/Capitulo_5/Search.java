/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.Capitulo_5;

/**
 *
 * @author Administrador
 */
public class Search {
    // Ejemplo de búsqueda en un arreglo utilizando un ciclo estilo for-each

 public static void main(String args[]) {
     
    int nums[] = { 6, 8, 3, 7, 5, 6, 1, 4 };
    int val = 5;
    boolean found = false;
    
    // Utiliza el ciclo estilo for-each para buscar val en el arreglo nums.
        for(int x : nums) {
            if (x == val) {
            found = true;
            break;
        }
        }
        if (found)
            System.out.println("Valor encontrado");
        }
}

