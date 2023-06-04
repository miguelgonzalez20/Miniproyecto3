
package controladorVentanas;

import Vista.VentanaUsuarios;

public class ControladorVentanaUsuarios {
    
    public static VentanaUsuarios ventana = new VentanaUsuarios();
    
    public static void mostrar(){
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
    }
    public static void ocultar(){
        ventana.setVisible(false);
        ventana.dispose();
    }
    
}
