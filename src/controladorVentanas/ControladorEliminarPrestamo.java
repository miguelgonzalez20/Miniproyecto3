
package controladorVentanas;

import Vista.EliminarPrestamo;

public class ControladorEliminarPrestamo {
    
    public static EliminarPrestamo ventana = new EliminarPrestamo();
    
    public static void mostrar(){
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
    }
    public static void ocultar(){
        ventana.setVisible(false);
        ventana.dispose();
    }
    
}
