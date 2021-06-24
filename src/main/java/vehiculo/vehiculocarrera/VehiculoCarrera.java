/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiculo.vehiculocarrera;

import interfaces.MovimientoDerecha;
import interfaces.MovimientoIzquierda;
import vehiculo.Vehiculo;

/**
 *
 * @author DIEGO MALDONADO
 */
public class VehiculoCarrera extends Vehiculo implements MovimientoDerecha, MovimientoIzquierda{

    /**
     * Constructor para la clase vehiculo de carga
     * @param combustible, almacena el combustible
     * @param cantidadGalonesCombustible, almacena la cantidad de galones de combustible
     * @param cantidadPasajeros, almacena la cantidad de pasajeros
     * @param velocidadMaxima, almacena su velocidad maxima
     * @param aceleracionBase , almacena su aceleracion base
     */
    public VehiculoCarrera(String combustible, int cantidadGalonesCombustible, int cantidadPasajeros, int velocidadMaxima, double aceleracionBase) {
        super(combustible, cantidadGalonesCombustible, cantidadPasajeros, velocidadMaxima, aceleracionBase);
    }

    /**
     * Metodo de la clase abstract el cual es heredado y se define aqui
     */
    @Override
    public void presentarVehiculo() {
        System.out.println("Soy un vehiculo de carrera, puedo correr");
    }

    /**
     * Metodos de interfaces
     */
    @Override
    public void moverDerecha() {
        System.out.println("Me moví a la derecha");
    }

    @Override
    public void moverIzquierda() {
        System.out.println("Me movi a la izquierda");
    }
    
    
}
