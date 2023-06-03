package controladorVentanas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Vista.AgregarUsuario;
import static controladorVentanas.ControladorVentanaPrincipal.ventana;
import java.util.HashMap;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import modelo.usuario;


public class ControladorAgregarUsuario{
    
    //ATRIBUTOS 
    private HashMap<String, String> coleccionUsuario;
    private AgregarUsuario Vista;
    private usuario modelo;
    private JComboBox<String> listaTipoUsuario;
    private JTextField nombre;
    private JTextField cedula;
    
    
    //METODO CONSTRUCTOR
    public ControladorAgregarUsuario(usuario modelo, AgregarUsuario Vista){
        this.modelo = modelo;
        this.Vista = Vista;
        this.Vista.addBotonAceptarListener(new CalculateListener());
        this.coleccionUsuario = (HashMap<String, String>) usuario.getColeccionUsuario();
        this.listaTipoUsuario = this.Vista.getListaTipoUsuario();
        this.nombre = this.Vista.getNombreUsuario();
        this.cedula = this.Vista.getCedula();
        Vista.setVisible(true);
        Vista.setLocationRelativeTo(null);
    }
    
    class CalculateListener implements ActionListener{
         String palabra; //Palabra concatenada
         String nombreUsuario; //Nombre de usuario
         String tipoU; // 
         String cc; //Identificación
         
        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getActionCommand().equalsIgnoreCase("ACEPTAR")){
                nombreUsuario = nombre.getText();
                cc = cedula.getText();
                tipoU = (String) listaTipoUsuario.getSelectedItem();
                palabra = nombreUsuario + " " + tipoU;
                coleccionUsuario.put(cc, palabra);
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

