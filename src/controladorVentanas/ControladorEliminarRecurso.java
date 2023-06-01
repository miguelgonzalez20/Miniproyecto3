/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladorVentanas;

import Vista.EliminarRecurso;
import static controladorVentanas.ControladorVentanaPrincipal.ventana;

/**
 *
 * @author Miguel
 */
public class ControladorEliminarRecurso {
    
    public static EliminarRecurso ventana = new EliminarRecurso();
    
    public static void mostrar(){
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
    }
    public static void ocultar(){
        ventana.setVisible(false);
        ventana.dispose();
    }
    
}
