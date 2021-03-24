/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerjava;

/**
 *
 * @author JHONATAN
 */
class Vehículo {
     //atributos
    String marca;
    String modelo;
    int km;
    int pasajeros;
    String color;
    String dispo;
    
    public static void main (String [] args){
       Vehículo carro = new Vehículo ();
       
       carro.marca = "Subaru";
       carro.modelo = "2021";
       carro.km = 0;
       carro.pasajeros = 7;
       carro.color = "blanco";
       carro.dispo = "Si";
       
       
       System.out.println("La marca del carro es: " + carro.marca);
       System.out.println("El modelo del carro es: " + carro.modelo);
       System.out.println("El kilometraje del carro es: " + carro.km);
       System.out.println("El color del carro es: " + carro.color);
       System.out.println("El carro esta disponible en concesionario: " + carro.dispo);
    }
}
