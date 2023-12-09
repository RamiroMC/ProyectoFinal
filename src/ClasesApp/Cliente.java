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
public class Cliente implements Serializable {
    private int id;
    private String nombre;
    private Vehiculo vehiculo;  

    public Cliente(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.vehiculo = null; 
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", vehiculo=" + vehiculo +
                '}';
    }
    
}