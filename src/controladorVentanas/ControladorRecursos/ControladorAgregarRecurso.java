/*NOMPRE DE PARTICIPANTES :Miguel Gonzales , Ana Mezu ,Vanesa Chavez . 
PROFESOR: Luis Romo.
GRUPO DE FPOE:01.
MINI PROYECTO 3.*/
package controladorVentanas.ControladorRecursos;

import Vista.Recursos.AgregarRecurso;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import modelo.recurso;

public class ControladorAgregarRecurso {
    
    //ATRIBUTOS
    private HashMap<String, String> coleccionRecursos;
    private JComboBox<String> tipoRecurso;
    private JTextField nombreAutor;
    private JTextField nombreRecurso;

    private static AgregarRecurso Vista;
    private recurso modelo;
    
    //METODO CONSTRUCTOR
    public ControladorAgregarRecurso(recurso modelo, AgregarRecurso Vista){
        this.modelo = modelo;
        this.Vista = Vista;
        this.coleccionRecursos = (HashMap<String, String>) recurso.getColeccionRecurso();
        this.tipoRecurso = this.Vista.getTipoRecurso(); // Metodo que retorna un JcomboBox

        this.nombreAutor = this.Vista.getNombreAutor();
        this.nombreRecurso = this.Vista.getNombreRecurso();

        this.Vista.addbotonFinalizarListener(new CalculateListener());
        
        Vista.setVisible(true);
        Vista.setLocationRelativeTo(null);
    }
    
    class CalculateListener implements ActionListener{
         String palabra;  // Palabra concatenada
         String nombreA; // nombreAutor
         String tipoR; // Tipo Recurso
         String nombreR; // nombreR

        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getActionCommand().equalsIgnoreCase("AGREGAR")){
                nombreA = nombreAutor.getText();
                nombreR = nombreRecurso.getText();
                tipoR = (String) tipoRecurso.getSelectedItem();
                palabra = nombreA + " " + tipoR;
                coleccionRecursos.put(nombreR, palabra);
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
