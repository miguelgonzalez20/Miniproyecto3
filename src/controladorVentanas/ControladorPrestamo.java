
package controladorVentanas;

import Vista.VentanaPrestamo;
import static controladorVentanas.ControladorVentanaPrincipal.ventana;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import javax.swing.JTextField;
import modelo.prestamo;

public class ControladorPrestamo {
    
    private HashMap<String, String> coleccionPrestamo;
    
    private JTextField cc;

    private VentanaPrestamo Vista;
    private prestamo prestamo;
    
    //METODO CONSTRUCTOR
    public ControladorPrestamo(prestamo prestamo, VentanaPrestamo Vista){
        this.prestamo = prestamo;
        this.Vista = Vista;
        this.coleccionPrestamo = (HashMap<String, String>) prestamo.getColeccionPrestamos();

        Vista.setVisible(true);
        Vista.setLocationRelativeTo(null);

        this.Vista.addbotonBuscarListener(new CalculateListener());
    }
    
    class CalculateListener implements ActionListener{
        
        String cedula = cc.getText();
        

        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getActionCommand().equalsIgnoreCase("AGREGAR")){
                
            }
            if(e.getActionCommand().equalsIgnoreCase("ELIMINAR")){
                
            }
            if(e.getActionCommand().equalsIgnoreCase("CONSULTAR")){
                
            }
            if(e.getActionCommand().equalsIgnoreCase("MODIFICAR")){
                
            }
            
        }  
    }
    
    
    
    public static void mostrar(){
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
    }
    public static void ocultar(){
        ventana.setVisible(false);
        ventana.dispose();
    }
    
}
