/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Trabajo;

import Personas.Mecanico;
import java.io.Serializable;
import java.util.Date;

/**
 * Clase que representa un trabajo realizado por un mecánico para un cliente.
 * Contiene información como id, horas trabajadas, precio del material, etc.
 *
 * @author Mondongo
 */
public abstract class Trabajo implements Serializable {

    private int idTrabajo; //LEER EN ARCHIVO

    private int horasTrabajo;

    private double precioMaterial;

    private boolean estadoTrabajo;

    private Date fechaInicio;

    private Date fechaFinal;

    private int plazoMaximo;

    private int idCliente;
    
    private Mecanico mecanico;

    private String detalles;

    //Constructor
    public Trabajo(int idTrabajo, int horasTrabajo, double precioMaterial, boolean estadoTrabajo,
            Date fechaInicio, Date fechaFinal, int plazoMaximo,
            int idCliente, Mecanico mecanico, String detalles) {

        this.horasTrabajo = horasTrabajo;
        this.precioMaterial = precioMaterial;
        this.estadoTrabajo = estadoTrabajo;

        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
        this.plazoMaximo = plazoMaximo;

        this.idCliente = idCliente;
        
        this.mecanico = mecanico;

        this.detalles = detalles;

    }

    @Override
    public String toString() {
        return null;
    }

    //Métodos getters y setters
    public int getIdTrabajo() {
        return idTrabajo;
    }

    public void setIdTrabajo(int idTrabajo) {
        this.idTrabajo = idTrabajo;
    }

    public int getHorasTrabajo() {
        return horasTrabajo;
    }

    public void setHorasTrabajo(int horasTrabajo) {
        this.horasTrabajo = horasTrabajo;
    }

    public double getPrecioMaterial() {
        return precioMaterial;
    }

    public void setPrecioMaterial(double precioMaterial) {
        this.precioMaterial = precioMaterial;
    }

    public boolean isEstadoTrabajo() {
        return estadoTrabajo;
    }

    public boolean getEstadoTrabajo() {
        return estadoTrabajo;
    }

    public void setEstadoTrabajo(boolean estadoTrabajo) {
        this.estadoTrabajo = estadoTrabajo;
    }

    public String getDetalles() {
        return detalles;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(Date fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public int getPlazoMaximo() {
        return plazoMaximo;
    }

    public void setPlazoMaximo(int plazoMaximo) {
        this.plazoMaximo = plazoMaximo;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

   

    public Mecanico getMecanico() {
        return mecanico;
    }

    public void setMecanico(Mecanico mecanico) {
        this.mecanico = mecanico;
    }

    public abstract double cotizarPrecio();

}
