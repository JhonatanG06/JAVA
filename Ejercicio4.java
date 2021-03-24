/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import java.util.Scanner;

/**
 *
 * @author JHONATAN
 */
public class Ejercicio4 {

    
    public static void main(String[] args) {
        
     Scanner teclado = new Scanner (System.in);
       System.out.println("¿Usted utiliza redes sociales?");
        String respuesta;
        respuesta = teclado.nextLine();
        
       if ("si".equals(respuesta)){
           System.out.println("https://www.facebook.com/jhonatan.giraldo.102/");
       }
       if ("no".equals(respuesta)){
           System.out.println("No utilizo redes sociales");
       }
  }
       
   si
}
