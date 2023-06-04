
package controladorVentanas;

import Vista.AgregarPrestamo;
import Vista.VentanaPrestamo;
//import static controladorVentanas.ControladorVentanaPrincipal.ventana;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import javax.swing.JLabel;
import javax.swing.JTextField;
import modelo.prestamo;
import modelo.recurso;
import modelo.usuario;

public class ControladorPrestamo {

    //ATRIBUTOS
    private HashMap<String, String> coleccionPrestamo;
    private HashMap<String, String> coleccionUsuario;
    
    private JTextField cedula;
    private JLabel nombreUsuario;
    private static VentanaPrestamo Vista;
    private prestamo prestamo;
    
    //METODO CONSTRUCTOR
    public ControladorPrestamo(prestamo prestamo, VentanaPrestamo Vista, usuario usuario){
        this.prestamo = prestamo;
        this.Vista = Vista;
        this.coleccionPrestamo = (HashMap<String, String>) prestamo.getColeccionPrestamos();
        this.coleccionUsuario = (HashMap<String, String>) usuario.getColeccionUsuario();
        
        this.cedula = this.Vista.getCedula();
        this.nombreUsuario = this.Vista.getNombreUsuario();
        
        this.Vista.addbotonBuscarListener(new CalculateListener()); 
        
        this.Vista.addbotonAgregarListener(new CalculateListener());
        this.Vista.addbotonEliminarListener(new CalculateListener());
        this.Vista.addbotonConsultarListener(new CalculateListener());
        this.Vista.addbotonModificarListener(new CalculateListener());
        
        Vista.setVisible(true);
        Vista.setLocationRelativeTo(null);
    }
    
    class CalculateListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            String cc = cedula.getText();
            
            if(e.getActionCommand().equalsIgnoreCase("BUSCAR")){
                nombreUsuario.setText(coleccionUsuario.get(cc));
                System.out.println("cedula digitada : "+ cc);
                System.out.println(coleccionUsuario.get(cc));
  
            }
            if(e.getActionCommand().equalsIgnoreCase("AGREGAR")){
                Vista.setVisible(false);
                AgregarPrestamo vista = new AgregarPrestamo();
                recurso recursos = new recurso();
                prestamo prestamo = new prestamo();
                ControladorAgregarPrestamo controlador = new ControladorAgregarPrestamo(recursos,prestamo, vista, cc);
                
                System.out.println("le di agregar");
                
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
        Vista.setVisible(true);
        Vista.setLocationRelativeTo(null);
    }
    public static void ocultar(){
        Vista.setVisible(false);
        Vista.dispose();
    }
    
}
