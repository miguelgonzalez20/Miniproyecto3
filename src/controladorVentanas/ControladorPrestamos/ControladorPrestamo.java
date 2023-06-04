
package controladorVentanas.ControladorPrestamos;

import Vista.Prestamo.AgregarPrestamo;
import Vista.Prestamo.ConsultarPrestamo;
import Vista.Prestamo.EliminarPrestamo;
import Vista.Prestamo.VentanaPrestamo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JLabel;
import javax.swing.JTextField;
import modelo.prestamo;
import modelo.recurso;
import modelo.usuario;

public class ControladorPrestamo {

    //ATRIBUTOS
    private HashMap<String, ArrayList<String>> coleccionPrestamo;
    private HashMap<String, String> coleccionUsuario;
    
    private JTextField cedula;
    private JLabel nombreUsuario;
    private static VentanaPrestamo Vista;
    private prestamo prestamo;
    
    private static ArrayList<String> ArrayListPrestamos1 = new ArrayList<>(); // Array
    
    //METODO CONSTRUCTOR
    public ControladorPrestamo(prestamo prestamo, VentanaPrestamo Vista, usuario usuario){
        this.prestamo = prestamo;
        this.Vista = Vista;
        
        this.coleccionPrestamo = (HashMap<String, ArrayList<String> >) prestamo.getColeccionPrestamos();
        this.coleccionUsuario = (HashMap<String, String>) usuario.getColeccionUsuario();
        
        this.cedula = this.Vista.getCedula();
        this.nombreUsuario = this.Vista.getNombreUsuario();
        
        //this.ArrayListPrestamos1 = ArrayListPrestamos;
        
        this.Vista.addbotonFinalizarListener(new CalculateListener());
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
                ControladorAgregarPrestamo controlador = new ControladorAgregarPrestamo(recursos, vista, cc,ArrayListPrestamos1);
                
                System.out.println("le di agregar");
                
            }
            if(e.getActionCommand().equalsIgnoreCase("CONSULTAR")){
                Vista.setVisible(false);
                ConsultarPrestamo vista = new ConsultarPrestamo();
                recurso recursos = new recurso();
                ControladorConsultarPrestamo controlador = new ControladorConsultarPrestamo(recursos, vista, ArrayListPrestamos1);
                
            }
            if(e.getActionCommand().equalsIgnoreCase("ELIMINAR")){
                Vista.setVisible(false);
                EliminarPrestamo vista = new EliminarPrestamo();
                recurso recursos = new recurso();
                ControladorEliminarPrestamo controlador = new ControladorEliminarPrestamo(recursos, vista, ArrayListPrestamos1);
            }
            if(e.getActionCommand().equalsIgnoreCase("MODIFICAR")){
                
            }
            if(e.getActionCommand().equalsIgnoreCase("FINALIZAR PRESTAMO")){
                coleccionPrestamo.put(cc,ArrayListPrestamos1);
                
                System.out.println("le di finalizar");
                System.out.println(coleccionPrestamo.get(cc));
                
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

    public ArrayList<String> getArrayListPrestamos() {
        return ArrayListPrestamos1;
    }

    public static void setArrayListPrestamos(ArrayList<String> nombreArray) {
        ArrayListPrestamos1 = nombreArray;
    }
    
    
}
