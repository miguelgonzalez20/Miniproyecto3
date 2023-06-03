
package controladorVentanas;

import Vista.AgregarPrestamo;
import static controladorVentanas.ControladorVentanaPrincipal.ventana;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import javax.swing.JTextField;
import modelo.prestamo;

public class ControladorAgregarPrestamo {
    
    //ATRIBUTOS 
    private HashMap<String, String> coleccionPrestamo;
    
    private AgregarPrestamo Vista;
    private prestamo modelo;
    
    private JTextField nombreRecursoPrestamo;

    //METODO CONSTRUCTOR
    public ControladorAgregarPrestamo(prestamo modelo, AgregarPrestamo Vista){
        this.modelo = modelo;
        this.Vista = Vista;
        this.coleccionPrestamo = (HashMap<String, String>) prestamo.getColeccionPrestamos();
        
        this.Vista.addbotonFinalizarListener(new CalculateListener());
       
        Vista.setVisible(true);
        Vista.setLocationRelativeTo(null);
    }
    
    class CalculateListener implements ActionListener{
         String nombreRecurso;
         
        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getActionCommand().equalsIgnoreCase("FINALIZAR")){
                nombreRecurso = nombreRecursoPrestamo.getText();
                
                coleccionPrestamo.put(nombreRecurso,nombreRecurso);
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
