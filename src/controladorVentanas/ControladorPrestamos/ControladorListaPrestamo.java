/*NOMPRE DE PARTICIPANTES :Miguel Gonzales , Ana Mezu ,Vanesa Chavez . 
PROFESOR: Luis Romo.
GRUPO DE FPOE:01.
MINI PROYECTO 3.*/
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
