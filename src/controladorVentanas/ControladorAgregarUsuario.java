package controladorVentanas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Vista.AgregarUsuario;
import java.util.HashMap;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import modelo.usuario;


public class ControladorAgregarUsuario{
    
    //ATRIBUTOS 
    private HashMap<String, String> coleccionUsuario;
    private JComboBox<String> listaTipoUsuario;
    private JTextField nombre;
    private JTextField cedula;
    private static AgregarUsuario Vista;
    private usuario modelo;

    //METODO CONSTRUCTOR
    public ControladorAgregarUsuario(usuario modelo, AgregarUsuario Vista){
        
        this.coleccionUsuario = (HashMap<String, String>) usuario.getColeccionUsuario();
        this.listaTipoUsuario = this.Vista.getListaTipoUsuario();
        this.nombre = this.Vista.getNombreUsuario();
        this.cedula = this.Vista.getCedula();
        
        this.Vista = Vista;
        this.modelo = modelo;
        
        this.Vista.addBotonAceptarListener(new CalculateListener());
        
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
                System.out.println(coleccionUsuario);
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

