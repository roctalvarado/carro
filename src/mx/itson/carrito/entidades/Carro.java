/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.carrito.entidades;

import mx.itson.carrito.enums.TipoMotor;
import mx.itson.carrito.enums.Transmisión;

/**
 *
 * @author rocta
 */
public class Carro {

    /**
     * @return the transmision
     */
    public Transmisión getTransmision() {
        return transmision;
    }

    /**
     * @param transmision the transmision to set
     */
    public void setTransmision(Transmisión transmision) {
        this.transmision = transmision;
    }

    /**
     * @return the tipoMotor
     */
    public TipoMotor getTipoMotor() {
        return tipoMotor;
    }

    /**
     * @param tipoMotor the tipoMotor to set
     */
    public void setTipoMotor(TipoMotor tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    /**
     * @return the kilometraje
     */
    public double getKilometraje() {
        return kilometraje;
    }

    /**
     * @param kilometraje the kilometraje to set
     */
    public void setKilometraje(double kilometraje) {
        this.kilometraje = kilometraje;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the anio
     */
    public int getAnio() {
        return anio;
    }

    /**
     * @param anio the anio to set
     */
    public void setAnio(int anio) {
        this.anio = anio;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    private String color;
    private int anio;
    private String marca;
    private double kilometraje;
    private TipoMotor tipoMotor;
    private Transmisión transmision;
    
    /**
     * Calcula el tiempo que tarda el carro en recorrer una distancia.
     * @param distancia Distancoa que recorrerá el carro.
     * @param velocidad Velocidad a la que viaja el carro.
     * @return Tiempo en el que llegará el carro.
     */
    public double calcularTiempo(double distancia, double velocidad) {
        this.kilometraje += distancia;
        // La línea de arruva es lo mismo que esta de abajo
        // this.kilometraje = this kilometraje + distancia
        double tiempo = distancia / velocidad;
        return tiempo;
    }
}
