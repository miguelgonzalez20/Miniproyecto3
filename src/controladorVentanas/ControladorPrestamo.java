
package controladorVentanas;

import Vista.VentanaPrestamo;
import static controladorVentanas.ControladorVentanaPrincipal.ventana;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import javax.swing.JTextField;
import modelo.prestamo;

public class ControladorPrestamo {

    //ATRIBUTOS
    private HashMap<String, String> coleccionPrestamo;
    
    private JTextField cedula;

    private VentanaPrestamo Vista;
    private prestamo prestamo;
    
    //METODO CONSTRUCTOR
    public ControladorPrestamo(prestamo prestamo, VentanaPrestamo Vista){
        this.prestamo = prestamo;
        this.Vista = Vista;
        this.coleccionPrestamo = (HashMap<String, String>) prestamo.getColeccionPrestamos();
        this.cedula = this.Vista.getCedula();
        
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
            prestamo.setCedula(cc);
            
            if(e.getActionCommand().equalsIgnoreCase("BUSCAR")){
                System.out.println("cedula digitada : "+ cc);
            }
            if(e.getActionCommand().equalsIgnoreCase("AGREGAR")){
                System.out.println("le di agregar");
                
                /*AgregarPrestamo vista = new AgregarPrestamo();
                prestamo modelo = new prestamo();
                ControladorAgregarPrestamo controlador = new ControladorAgregarPrestamo(modelo, vista);
       
                ControladorVentanaUsuarios.ocultar();
                //this.dispose();*/
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
