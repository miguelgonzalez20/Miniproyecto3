/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladorVentanas;

import Vista.EliminarPrestamo;

/**
 *
 * @author Miguel
 */
public class ControladorEliminarPrestamo {
    
    public static EliminarPrestamo ventana = new EliminarPrestamo();
    
    public static void mostrar(){
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
    }
    public static void ocultar(){
        ventana.setVisible(false);
    }
    
}
