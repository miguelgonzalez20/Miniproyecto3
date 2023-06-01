/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladorVentanas;

import Vista.AgregarRecurso;
import static controladorVentanas.ControladorVentanaPrincipal.ventana;

/**
 *
 * @author Miguel
 */
public class ControladorAgregarRecurso {
    
    public static AgregarRecurso ventana = new AgregarRecurso();
    
    public static void mostrar(){
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
    }
    public static void ocultar(){
        ventana.setVisible(false);
        ventana.dispose();
    }
    
}
