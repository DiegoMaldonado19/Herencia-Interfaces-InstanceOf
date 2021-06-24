/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiculo.vehiculocarga;

import interfaces.MovimientoDerecha;
import interfaces.MovimientoIzquierda;
import vehiculo.Vehiculo;

/**
 *
 * @author DIEGO MALDONADO
 */
public class VehiculoCarga extends Vehiculo implements MovimientoDerecha, MovimientoIzquierda{

    /**
     * Constructor para la clase vehiculo de carga
     * @param combustible, almacena el combustible
     * @param cantidadGalonesCombustible, almacena la cantidad de galones de combustible
     * @param cantidadPasajeros, almacena la cantidad de pasajeros
     * @param velocidadMaxima, almacena su velocidad maxima
     * @param aceleracionBase , almacena su aceleracion base
     */
    public VehiculoCarga(String combustible, int cantidadGalonesCombustible, int cantidadPasajeros, int velocidadMaxima, double aceleracionBase) {
        super(combustible, cantidadGalonesCombustible, cantidadPasajeros, velocidadMaxima, aceleracionBase);
    }

    /**
     * Metodo que define de la clase abstracta padre y se define aqui
     */
    @Override
    public void presentarVehiculo() {
        System.out.println("Soy un vehiculo de carga, puedo cargar");
    }

    /**
     * Metodos de interfaces
     */
    @Override
    public void moverDerecha() {
        System.out.println("Me movi a la derecha");
    }

    @Override
    public void moverIzquierda() {
        System.out.println("Me movi a la izquierda");
    }
}
