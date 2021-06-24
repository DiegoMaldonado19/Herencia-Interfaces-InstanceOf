/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiculo;

/**
 *
 * @author DIEGO MALDONADO
 */
public abstract class Vehiculo{
    /**
     * Atributos de la clase vehiculo
     */
    private String combustible;
    private int cantidadGalonesCombustible;
    private int cantidadPasajeros;
    private int velocidadMaxima;
    private double aceleracionBase;
    
    /**
     * Constructor de la clase abstracta vehiculo, para poder crear objetos
     * @param combustible , almacena la cantidad de combustible
     * @param cantidadGalonesCombustible , almacena la cantidad de galones necesarios
     * @param cantidadPasajeros , almacena la cantidad de pasajeros
     * @param velocidadMaxima , almacena la velocidad maxima
     * @param aceleracionBase , almacena la aceleracion base
     */
    public Vehiculo(String combustible, int cantidadGalonesCombustible, int cantidadPasajeros, int velocidadMaxima,
            double aceleracionBase){
        
        this.combustible = combustible;
        this.cantidadGalonesCombustible = cantidadGalonesCombustible;
        this.cantidadPasajeros = cantidadPasajeros;
        this.velocidadMaxima = velocidadMaxima;
        this.aceleracionBase = aceleracionBase;
        
    }

    /**
     * Metodo para obtener combustible
     * @return 
     */
    public String getCombustible() {
        return combustible;
    }

    /**
     * Metodo para settear el combustible
     * @param combustible 
     */
    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    /**
     * Metodo para obtener la cantidad de galones de combustible
     * @return 
     */
    public int getCantidadGalonesCombustible() {
        return cantidadGalonesCombustible;
    }

    /**
     * Metodo para settear la cantidad de galones combustible 
     * @param cantidadGalonesCombustible 
     */
    public void setCantidadGalonesCombustible(int cantidadGalonesCombustible) {
        this.cantidadGalonesCombustible = cantidadGalonesCombustible;
    }

    /**
     * Metodo para obtener la cantidad de pasajeros
     * @return 
     */
    public int getCantidadPasajeros() {
        return cantidadPasajeros;
    }

    /**
     * Metodo para settear para obtener la cantidad de pasajeros
     * @param cantidadPasajeros 
     */
    public void setCantidadPasajeros(int cantidadPasajeros) {
        this.cantidadPasajeros = cantidadPasajeros;
    }

    /**
     * Metodo para obtener la velocidad maxima del vehiculo
     * @return 
     */
    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    /**
     * Metodo para settear la velocidad maxima
     * @param velocidadMaxima 
     */
    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    /**
     * Metodo para obtener la aceleracion base
     * @return 
     */
    public double getAceleracionBase() {
        return aceleracionBase;
    }

    /**
     * Metodo para settear la aceleracion base
     * @param aceleracionBase 
     */
    public void setAceleracionBase(double aceleracionBase) {
        this.aceleracionBase = aceleracionBase;
    }
    
    /**
     * Metodo para presentar vehiculo
     */
    public abstract void presentarVehiculo();
}
