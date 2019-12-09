/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.com.davidj.proyecto02;
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
       
       System.out.println("Resultado suma: " + suma(2, 2));
   }
   
   public static int suma(int num1, int num2) {
	   return num1 + num2;
   }
    
}
