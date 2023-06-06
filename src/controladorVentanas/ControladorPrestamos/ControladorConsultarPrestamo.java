/*NOMPRE DE PARTICIPANTES :Miguel Gonzales , Ana Mezu ,Vanesa Chavez . 
PROFESOR: Luis Romo.
GRUPO DE FPOE:01.
MINI PROYECTO 3.*/
package controladorVentanas.ControladorPrestamos;

import Vista.Prestamo.ConsultarPrestamo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JTextArea;
import modelo.prestamo;
import modelo.recurso;

public class ControladorConsultarPrestamo {
    
    //ATRIBUTOS

    private static ConsultarPrestamo Vista;
    private prestamo prestamos;
    
    private JTextArea nombreRecursos;
    
    private HashMap<String, ArrayList<String>> coleccionPrestamos;

    //METODO CONSTRUCTOR
    public ControladorConsultarPrestamo(ConsultarPrestamo Vista, prestamo prestamos){
        
        this.Vista = Vista;
        this.prestamos = prestamos;
        
        this.nombreRecursos = this.Vista.getNombreRecursos();
        
        this.coleccionPrestamos = (HashMap<String, ArrayList<String>>) prestamo.getColeccionPrestamos();

        this.Vista.addbotonVisualizarListener(new CalculateListener());
        this.Vista.addbotonMenuPrincipalListener(new CalculateListener());
        
        Vista.setVisible(true);
        Vista.setLocationRelativeTo(null);
    }
    
    class CalculateListener implements ActionListener{
         String RecursosMostrar;
         String palabra;
        @Override
        public void actionPerformed(ActionEvent e) {
             
            if(e.getActionCommand().equalsIgnoreCase("VISUALIZAR")){
                StringBuilder stringBuilder = new StringBuilder();
                
                for (Map.Entry<String, ArrayList<String>> entry : coleccionPrestamos.entrySet()) {
                    String clave = entry.getKey();
                    ArrayList<String> valor = entry.getValue();
                    palabra = "Cedula Usuario: " + clave + "  /  " + valor + "\n";
                    stringBuilder.append(palabra);
                }
                RecursosMostrar = stringBuilder.toString();
                nombreRecursos.setText(RecursosMostrar);

            }
            if(e.getActionCommand().equalsIgnoreCase("MENU PRINCIPAL")){
                ControladorPrestamo.mostrar();
                Vista.setVisible(false);  
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
