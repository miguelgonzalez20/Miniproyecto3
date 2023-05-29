
package controladorVentanas;

import Vista.ActualizarUsuario;

public class ControladorActualizarUsuario {
    
    public static ActualizarUsuario ventana = new ActualizarUsuario();
    
    public static void mostrar(){
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
    }
    public static void ocultar(){
        ventana.setVisible(false);
    }
    
}
