/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClasesApp;

import java.io.Serializable;

/**
 *
 * @author Mondongo
 */
public class Automovil extends Vehiculo implements Serializable {
    public Automovil(String placa, String marca, String color, String tipoVehiculo) {
        super(placa, marca, color, "Automovil");
    }
    
}