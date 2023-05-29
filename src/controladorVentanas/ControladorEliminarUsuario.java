/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladorVentanas;

import Vista.EliminarUsuario;

/**
 *
 * @author Miguel
 */
public class ControladorEliminarUsuario {
    
    public static EliminarUsuario ventana = new EliminarUsuario();
    
    public static void mostrar(){
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
    }
    public static void ocultar(){
        ventana.setVisible(false);
    }
    
}
