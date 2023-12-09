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
public abstract class Reparacion extends Trabajo {
    

    //Constructor
    public Reparacion(int idTrabajo, int horasTrabajo, double precioMaterial, boolean estadoTrabajo,
                      String tipoTrabajo, Date fechaInicio, Date fechaFinal, int plazoMaximo,
                      String detalleTrabajo, Cliente cliente, Mecanico mecanico) {
       
       super(idTrabajo, horasTrabajo, precioMaterial, estadoTrabajo, tipoTrabajo, fechaInicio, fechaFinal,
             plazoMaximo, detalleTrabajo, cliente, mecanico);
       
        
    }
    
    public abstract void reparacion();

    
    //Implementación del método abstracto cotizarPrecio para Reparacion
    @Override
    public double cotizarPrecio() {
        
        return 0.0;  // Solo un ejemplo, debes ajustar según tus necesidades
    }
}