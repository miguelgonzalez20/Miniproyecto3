
package controladorVentanas;

import Vista.AgregarPrestamo;
import Vista.VentanaPrestamo;
import static controladorVentanas.ControladorVentanaPrincipal.ventana;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;
import modelo.prestamo;
import modelo.recurso;
import modelo.usuario;

public class ControladorAgregarPrestamo {
    
    //ATRIBUTOS 
    private HashMap<String, String> coleccionPrestamo;
    private HashMap<String, String> coleccionUsuario;
    private JComboBox<String> comboBox;
    
    private JTextField nombreRecurso;
    private JLabel nombreUsuario;
    
    private AgregarPrestamo Vista;
    private prestamo prestamo;

    //METODO CONSTRUCTOR
    public ControladorAgregarPrestamo(prestamo modelo, AgregarPrestamo Vista, usuario usuario, recurso recurso){
        this.prestamo = prestamo;
        this.Vista = Vista;
        this.coleccionPrestamo = (HashMap<String, String>) prestamo.getColeccionPrestamos();
        this.coleccionUsuario = (HashMap<String, String>) usuario.getColeccionUsuario();
        this.comboBox = this.Vista.getjComboBox1();
        this.nombreUsuario = this.Vista.getNombreUsuario();
        
        
        this.Vista.addbotonFinalizarListener(new CalculateListener());
        this.Vista.addbotonVisualizarRecursosListener(new CalculateListener()); 

        Vista.setVisible(true);
        Vista.setLocationRelativeTo(null);
    }
    
    class CalculateListener implements ActionListener{
         String nombreRecurso;
         
        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getActionCommand().equalsIgnoreCase("VISUALIZAR RECURSOS")){
                Vista.setjComboBox1(comboBox);
            } 
            if(e.getActionCommand().equalsIgnoreCase("FINALIZAR")){
                //nombreRecurso = nombreRecursoPrestamo.getText();
                
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
