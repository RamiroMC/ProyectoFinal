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
public class ReparacionMecanica extends Reparacion {
    //Atributos específicos de ReparacionMecanica

    //Constructor
    public ReparacionMecanica(int idTrabajo, int horasTrabajo, double precioMaterial, boolean estadoTrabajo,
                              String tipoTrabajo, Date fechaInicio, Date fechaFinal, int plazoMaximo,
                              String detalleTrabajo, Cliente cliente, Mecanico mecanico) {
    super(idTrabajo, horasTrabajo, precioMaterial, estadoTrabajo, tipoTrabajo, fechaInicio, fechaFinal, plazoMaximo, detalleTrabajo, cliente, mecanico);
        //Inicialización de atributos específicos de ReparacionMecanica
    }

    //Implementación del método abstracto reparacion para ReparacionMecanica
    @Override
    public void reparacion() {
        //Lógica de reparación mecánica específica
    }
}