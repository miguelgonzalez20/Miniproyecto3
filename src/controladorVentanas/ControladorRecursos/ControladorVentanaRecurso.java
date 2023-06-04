
package controladorVentanas.ControladorRecursos;

import Vista.Recursos.VentanaRecursos;


public class ControladorVentanaRecurso {
    
    public static VentanaRecursos ventana = new VentanaRecursos();
    
    public static void mostrar(){
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
    }
    public static void ocultar(){
        ventana.setVisible(false);
        ventana.dispose();
    }
    
}
