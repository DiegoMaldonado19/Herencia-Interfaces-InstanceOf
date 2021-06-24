/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiculo;

import vehiculo.camioneta.VehiculoCamioneta;
import vehiculo.vehiculocarga.VehiculoCarga;
import vehiculo.vehiculocarrera.VehiculoCarrera;

/**
 *
 * @author DIEGO MALDONADO
 */
public class VectorVehiculo {
    /**
     * Vector de vehiculos
     */
    private Vehiculo[] vehiculos;
    
    /**
     * Constructor de vehiculos
     */
    public VectorVehiculo(){
        vehiculos = new Vehiculo[20];
    }

    /**
     * Metodo para obtener el vector de vehiculos
     * @return 
     */
    public Vehiculo[] getVehiculos() {
        return vehiculos;
    }
    
    /**
     * Metodo para inicializar vehiculos
     */
    public void incicializarVehiculos(){
        for(int i=0; i<vehiculos.length; i++){
            if(i>=0 && i<6){
                vehiculos[i] = new VehiculoCamioneta("Diesel",30, 20, 160, 3.5);
            }
            else if(i>=6 && i<=12){
                vehiculos[i] = new VehiculoCarrera("Gasolina",15, 20, 260, 5.5);
            }
            else if(i>12 && i<=19){
                vehiculos[i] = new VehiculoCarga("Diesel",10, 50, 100, 1.5);
            } 
        }
    }
}
