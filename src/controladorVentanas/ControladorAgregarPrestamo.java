/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladorVentanas;

import Vista.AgregarPrestamo;
import static controladorVentanas.ControladorVentanaPrincipal.ventana;

/**
 *
 * @author Miguel
 */
public class ControladorAgregarPrestamo {
    
    public static AgregarPrestamo ventana = new AgregarPrestamo();
    
    public static void mostrar(){
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
    }
    public static void ocultar(){
        ventana.setVisible(false);
        ventana.dispose();
    }
    
}
