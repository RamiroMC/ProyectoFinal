/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Trabajo;

import Personas.Mecanico;
import java.util.Date;

/**
 *
 * @author Mondongo
 */
public class Oficios extends Trabajo {

    private String tipoTrabajo; //MECANICA O LATONERIA O REVISION
  

    //Constructor
    public Oficios(int idTrabajo, int horasTrabajo, double precioMaterial, boolean estadoTrabajo,
            String tipoTrabajo, Date fechaInicio, Date fechaFinal, int plazoMaximo, int idCliente, Mecanico mecanico
            ,String detalles) {

        super(idTrabajo, horasTrabajo, precioMaterial, estadoTrabajo, fechaInicio, fechaFinal,
                plazoMaximo, idCliente, mecanico, detalles);

    }

    public void reparacion() {

    };

    
    //Implementación del método abstracto cotizarPrecio para Oficios
    @Override
    public double cotizarPrecio() {

        return 0.0;  // Solo un ejemplo, debes ajustar según tus necesidades
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
                + ", horasTrabajo = " + this.getHorasTrabajo()
                + ", precioMaterial = " + this.getPrecioMaterial()
                + ", estadoTrabajo = " + this.getEstadoTrabajo()
                + ", tipoTrabajo = '" + this.getTipoTrabajo() + '\''
                + ", fechaInicio= " + this.getFechaInicio()
                + ", fechaFinal = " + this.getFechaFinal()
                + ", plazoMaximo = " + this.getPlazoMaximo()
                + ", detalles = '" + this.getDetalles() + '\''
                + ", cliente = " + this.getIdCliente()
                + ", mecanico = " + this.getMecanico()
                + '}';

    }

}
