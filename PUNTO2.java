/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto2;

import static punto2.PUNTO2.main;

/**
 *
 * @author JHONATAN
 */
public class PUNTO2 {
    String datos_personales() {
        String nombre="Jhonatan Stiven";
        int edad=21;
        char genero = 'M';
        String tipo_doc = "C.C";
        int nro_doc = 1060656920;
        boolean hijos = false;
        boolean casado = false;
        
        if (hijos == true)
            System.out.println("Si tengo hijos");
        else
            System.out.println("No tengo hijos");
        
        if (casado == true)
            System.out.println("Si estoy casado");
        else
            System.out.println("No estoy casado");
        
        return genero + " " + nombre + " " + edad + " años " +" "+ tipo_doc + " " + nro_doc + " ";
        
                
    }  
    
    public static void main(String[] args) {
        
        PUNTO2 instClass = new PUNTO2();
        System.out.println(instClass.datos_personales());
    }
    
}