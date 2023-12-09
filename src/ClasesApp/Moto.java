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
public class Moto extends Vehiculo implements Serializable {
     public Moto(String placa, String marca, String color, String tipoVehiculo) {
        super(placa, marca, color, "Moto");
    }
}