/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.davidj.proyecto02;
import java.util.Scanner;

/**
 *
 * @author davidj
 */
public class Proyecto02 {
    
   public static void main(String[] args) {
       String cadena;
       Scanner console = new Scanner(System.in);
       
       System.out.print("Introduce la cadena de caracteres para mostrar: ");
       cadena = console.nextLine();
       
       System.out.println(cadena);
   }
    
}
