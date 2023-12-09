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
public class ReparacionLatoneria extends Reparacion {
    //Atributos específicos de ReparacionLatoneria

    //Constructor
    public ReparacionLatoneria(int idTrabajo, int horasTrabajo, double precioMaterial, boolean estadoTrabajo,
                               String tipoTrabajo, Date fechaInicio, Date fechaFinal, int plazoMaximo,
                               String detalleTrabajo, Cliente cliente, Mecanico mecanico) {
        
        super(idTrabajo, horasTrabajo, precioMaterial, estadoTrabajo, tipoTrabajo, fechaInicio, fechaFinal,
                plazoMaximo, detalleTrabajo, cliente, mecanico);
        //Inicialización de atributos específicos de ReparacionLatoneria
    }

    //Implementación del método abstracto reparacion para ReparacionLatoneria
    @Override
    public void reparacion() {
        //Lógica de reparación de latonería específica
    }
}