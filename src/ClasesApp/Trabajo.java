/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClasesApp;

import java.io.Serializable;
import java.util.Date;

/**
 * Clase que representa un trabajo realizado por un mecánico para un cliente.
 * Contiene información como id, horas trabajadas, precio del material, etc.
 * 
 * @author Mondongo
 */
public abstract class Trabajo implements Serializable {
    private int idTrabajo;
    private int horasTrabajo;
    private double precioMaterial;
    private boolean estadoTrabajo;
    private String tipoTrabajo;
    private Date fechaInicio;
    private Date fechaFinal;
    private int plazoMaximo;  
    private String detalleTrabajo;  
    private Cliente cliente;
    private Mecanico mecanico;

    //Constructor
    public Trabajo(int idTrabajo, int horasTrabajo, double precioMaterial, boolean estadoTrabajo,
                   String tipoTrabajo, Date fechaInicio, Date fechaFinal, int plazoMaximo,
                   String detalleTrabajo, Cliente cliente, Mecanico mecanico) {
        
        this.idTrabajo = idTrabajo;
        this.horasTrabajo = horasTrabajo;
        this.precioMaterial = precioMaterial;
        this.estadoTrabajo = estadoTrabajo;
        this.tipoTrabajo = tipoTrabajo;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
        this.plazoMaximo = plazoMaximo;
        this.detalleTrabajo = detalleTrabajo;
        this.cliente = cliente;
        this.mecanico = mecanico;
        
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

    public void setEstadoTrabajo(boolean estadoTrabajo) {
        this.estadoTrabajo = estadoTrabajo;
    }

    public String getTipoTrabajo() {
        return tipoTrabajo;
    }

    public void setTipoTrabajo(String tipoTrabajo) {
        this.tipoTrabajo = tipoTrabajo;
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

    public String getDetalleTrabajo() {
        return detalleTrabajo;
    }

    public void setDetalleTrabajo(String detalleTrabajo) {
        this.detalleTrabajo = detalleTrabajo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Mecanico getMecanico() {
        return mecanico;
    }

    public void setMecanico(Mecanico mecanico) {
        this.mecanico = mecanico;
    }

    public abstract double cotizarPrecio();
    
    @Override
    public String toString() {
        return "Trabajo{" +
                "idTrabajo = " + idTrabajo +
                ", horasTrabajo = " + horasTrabajo +
                ", precioMaterial = " + precioMaterial +
                ", estadoTrabajo = " + estadoTrabajo +
                ", tipoTrabajo = '" + tipoTrabajo + '\'' +
                ", fechaInicio= " + fechaInicio +
                ", fechaFinal = " + fechaFinal +
                ", plazoMaximo = " + plazoMaximo +
                ", detalleTrabajo = '" + detalleTrabajo + '\'' +
                ", cliente = " + cliente +
                ", mecanico = " + mecanico +
                '}';
    }
}