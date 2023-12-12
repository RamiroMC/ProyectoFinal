/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Trabajo;

import java.time.LocalDate;

/**
 *
 * @author Mondongo
 */
public class Oficios extends Trabajo {

    private String tipoTrabajo; //MECANICA O LATONERIA O REVISION

    //Constructor
    public Oficios(String idTrabajo, String tipoTrabajo, LocalDate fechaInicio, int plazoMaximo, String idCliente, String mecanico,
            String detalles) {

        super(idTrabajo, fechaInicio, plazoMaximo, idCliente, mecanico, detalles);
        
        this.tipoTrabajo = tipoTrabajo;

    }

    //Implementación del método abstracto cotizarPrecio para Oficios
    @Override
    public double cotizarPrecio() {

        return 1500;  // Solo un ejemplo, debes ajustar según tus necesidades
    }

    public String getTipoTrabajo() {
        return tipoTrabajo;
    }

    public void setTipoTrabajo(String tipoTrabajo) {
        this.tipoTrabajo = tipoTrabajo;
    }

    @Override
    public String toString() {
        return "Trabajo{"
                + "idTrabajo = " + this.getIdTrabajo()
                + ", diasTrabajo = " + this.getDiasTrabajo()
                + ", precioMaterial = " + this.getPrecioMaterial()
                + ", estadoTrabajo = " + this.getEstadoTrabajo()
                + ", tipoTrabajo = '" + this.getTipoTrabajo() + '\''
                + ", fechaInicio= " + this.getFechaInicio()
                + ", fechaFinal = " + this.getFechaFinal()
                + ", plazoMaximo = " + this.getPlazoMaximo()
                + ", detalles = '" + this.getDetalles() + '\''
                + ", cliente = " + this.getIdCliente()
                + ", mecanico = " + this.getIdMecanico()
                + '}';

    }

}
