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
public class Mecanico implements Serializable {
    //Atributos
    private String nombre;
    private String contraseña;
    private int horasTrabajadas;
    private boolean estado;

    //Constructor
    public Mecanico(String nombre, String contraseña, int horasTrabajadas, boolean estado) {
        this.nombre = nombre;
        this.contraseña = contraseña;
        this.horasTrabajadas = horasTrabajadas;
        this.estado = estado;
    }

    //Métodos getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Mecanico{" +
                "nombre='" + nombre + '\'' +
                ", contraseña='" + contraseña + '\'' +
                ", horasTrabajadas=" + horasTrabajadas +
                ", estado=" + estado +
                '}';
    }

}