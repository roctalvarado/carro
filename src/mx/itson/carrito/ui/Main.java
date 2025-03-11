/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.carrito.ui;

import java.util.Scanner;
import mx.itson.carrito.entidades.Aseguradora;
import mx.itson.carrito.entidades.Carro;
import mx.itson.carrito.entidades.EquipoSonido;
import mx.itson.carrito.entidades.Propietario;
import mx.itson.carrito.enums.TipoMotor;
import mx.itson.carrito.enums.Transmision;

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
        bmw.setTipoMotor(TipoMotor.HÍBRIDO);
        bmw.setTransmision(Transmision.AUTOMÁTICO);
        
        Propietario prop = new Propietario();
        prop.setNombre("Panfilo Kevin");
        prop.setDomicilio("Calle 23 colonia Cengro");
        prop.setTelefono("6221734422");
        prop.setEmail("panfilomeno@gmail.com");
        
        bmw.setPropietario(prop);
                
        Aseguradora aser = new Aseguradora();
        aser.setNombre("AXA");
        aser.setTelefono("8009001292");
        aser.setEmail("axasoluciones@axa.com.mx");
        aser.setFondos(50000);
        
        EquipoSonido e = new EquipoSonido();
        e.setMusica("Sony");
        e.setPrecio(5000);
        e.TieneBluetooth(true);
        e.setMusica("Drum and Bass");
        
        bmw.setEstereo(e);
        
        // Iniciamos el método contenido en la clase Carro.        
        double tiempo = bmw.calcularTiempo(distancia, velocidad);
        
        System.out.println("El tiempo que le tomará al carro " 
                + bmw.getMarca() + 
                " de color " + bmw.getColor() + 
                " y cuyo modelo es " + bmw.getAnio() 
                + " será " + tiempo +
                " y ahora su kilometraje es de " + bmw.getKilometraje() +
                " El propietario de este carro es " + bmw.getPropietario().getNombre() +
                " La aseguradora de este carro es " + bmw.getAseguradora().getNombre() +
                " El equipo de sonido está reproduciendo " + bmw.getEstereo().getMusica()); 
        
    }
}
