/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.carrito.ui;

import java.util.Scanner;
import mx.itson.carrito.entidades.Carro;

/**
 *
 * @author rocta
 */
public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingresa la distancia recorrida:");
        double distancia = sc.nextDouble();
        
        System.out.println("Ingresa la velocidad a la que viaja el carro:");
        double velocidad = sc.nextDouble();
        
        // Generamos una instancia de la clase Carro.
        Carro bmw = new Carro();
        bmw.setMarca("BMW");
        bmw.setColor("Negro");
        bmw.setAnio(2021);
        bmw.setKilometraje(10000);
        
        // Iniciamos el método contenido en la clase Carro.        
        double tiempo = bmw.calcularTiempo(distancia, velocidad);
        
        System.out.println("El tiempo que le tomará al carro " 
                + bmw.getMarca() + 
                " de color " + bmw.getColor() + 
                " y cuyo modelo es " + bmw.getAnio() 
                + " será " + tiempo +
                " y ahora su kilometraje es de " + bmw.getKilometraje());
        
    }
}
