/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClasesApp;

import java.util.Date;

/**
 *
 * @author Mondongo
 */
public class Revision extends Trabajo {
    private String detalleRevision;  

    //Constructor
    public Revision(int idTrabajo, int horasTrabajo, double precioMaterial, boolean estadoTrabajo,
                    String tipoTrabajo, Date fechaInicio, Date fechaFinal, int plazoMaximo,
                    String detalleTrabajo, Cliente cliente, Mecanico mecanico, String detalleRevision) {
        super(idTrabajo, horasTrabajo, precioMaterial, estadoTrabajo, tipoTrabajo, fechaInicio, fechaFinal,
                plazoMaximo, detalleTrabajo, cliente, mecanico);
        this.detalleRevision = detalleRevision;
    }

    public String getDetalleRevision() {
        return detalleRevision;
    }

    public void setDetalleRevision(String detalleRevision) {
        this.detalleRevision = detalleRevision;
    }

    
    
    //Implementación del método abstracto cotizarPrecio para Revision
    @Override
    public double cotizarPrecio() {
   
        return 0.0;  
    }

    @Override
    public String toString() {
        return "Revision{" + "detalleRevision=" + detalleRevision + '}';
    }
    
}