/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import java.util.Scanner;



/**
 *
 * @author JHONATAN
 */
public class Ejercicio3 {


    public static void main(String[] args) {
            Scanner teclado = new Scanner (System.in);
       System.out.println("Por favor ingrese su edad");
       int edad = teclado.nextInt();
       
       if (edad >= 18){
           System.out.println("Puede continuar navegando");
       }
       else {
           System.out.println("Edad no correspondiente a mayor de edad");
    }
        
  }
       
   
}
