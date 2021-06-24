/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;
import vehiculo.VectorVehiculo;
import vehiculo.camioneta.VehiculoCamioneta;
import vehiculo.vehiculocarga.VehiculoCarga;
import vehiculo.vehiculocarrera.VehiculoCarrera;

/**
 *
 * @author DIEGO MALDONADO
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /**
         * Objeto scanner para leer desde consola
         */
        Scanner scanner = new Scanner(System.in);
        int opcion=0;
        /**
         * Objeto vehiculos que contiene un arreglo de vehiculos
         */
        VectorVehiculo vehiculos = new VectorVehiculo();
        
        /**
         * Inicializamos vehiculos
         */
        vehiculos.incicializarVehiculos();
        
        /**
         * Para la un for, hacemos comparaciones para ver que tipo de vehiculos es, dependiendo de su instancia
         */
        for(int i=0; i<vehiculos.getVehiculos().length; i++){
            if(vehiculos.getVehiculos()[i] instanceof VehiculoCamioneta){
                System.out.println("Camioneta:");
                vehiculos.getVehiculos()[i].presentarVehiculo();
                System.out.println("\n");
            }
            else if(vehiculos.getVehiculos()[i] instanceof VehiculoCarga){
                System.out.println("Vehiculo de carga:");
                vehiculos.getVehiculos()[i].presentarVehiculo();
                System.out.println("\n");
            }
            else if(vehiculos.getVehiculos()[i] instanceof VehiculoCarrera){
                System.out.println("Vehiculo de carrera:");
                vehiculos.getVehiculos()[i].presentarVehiculo();
                System.out.println("\n");
            }
        }
    }
}
