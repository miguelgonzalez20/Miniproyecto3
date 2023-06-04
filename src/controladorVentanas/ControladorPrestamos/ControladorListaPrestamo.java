
package controladorVentanas.ControladorPrestamos;

import Vista.Prestamo.ListaPrestamo;

public class ControladorListaPrestamo {
    
    public static ListaPrestamo ventana = new ListaPrestamo();
    
    public static void mostrar(){
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
    }
    public static void ocultar(){
        ventana.setVisible(false);
        ventana.dispose();
    }
    
}
