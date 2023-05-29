
package controladorVentanas;

import Vista.*;

public class ControladorVentanaPrincipal {
    
    public static VentanaPrincipal ventana = new VentanaPrincipal();
    
    public static void mostrar(){
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
    }
    public static void ocultar(){
        ventana.setVisible(false);
    }
}
