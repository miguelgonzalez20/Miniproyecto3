
package controladorVentanas;

import Vista.AgregarUsuario;


public class ControladorAgregarUsuario {
    
    public static AgregarUsuario ventana = new AgregarUsuario();
    
    public static void mostrar(){
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
    }
    public static void ocultar(){
        ventana.setVisible(false);
    }
    
}
