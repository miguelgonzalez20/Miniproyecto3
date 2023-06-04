
package controladorVentanas;

import Vista.*;
import javax.swing.JOptionPane;

public class ControladorVentanaPrincipal {
    
    public static VentanaPrincipal ventana = new VentanaPrincipal();
    
    public static void mostrar(){
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
        
    }
    public static void ocultar(){
        ventana.setVisible(false);
        ventana.dispose();
    }
}
