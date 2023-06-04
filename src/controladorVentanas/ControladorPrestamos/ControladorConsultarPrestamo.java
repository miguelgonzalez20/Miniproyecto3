
package controladorVentanas.ControladorPrestamos;

import Vista.Prestamo.ConsultarPrestamo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JTextArea;
import modelo.recurso;

public class ControladorConsultarPrestamo {
    
    //ATRIBUTOS

    private static ConsultarPrestamo Vista;
    private recurso recursos;
    
    private JTextArea nombreRecursos;
    
    private HashMap<String, String> coleccionRecursos;
    
    private ArrayList<String> ArrayListPrestamos = new ArrayList<>();

    //METODO CONSTRUCTOR
    public ControladorConsultarPrestamo(recurso recursos, ConsultarPrestamo Vista, ArrayList<String> ArrayPrestamo){
        
        this.Vista = Vista;
        this.recursos = recursos;
        this.nombreRecursos = this.Vista.getNombreRecursos();
        this.coleccionRecursos = (HashMap<String, String>) recursos.getColeccionRecurso();

        this.ArrayListPrestamos = ArrayPrestamo;
        
        this.Vista.addbotonVisualizarListener(new CalculateListener());
        this.Vista.addbotonMenuPrincipalListener(new CalculateListener());
        
        Vista.setVisible(true);
        Vista.setLocationRelativeTo(null);
    }
    
    class CalculateListener implements ActionListener{
         String RecursosMostrar;
         
        @Override
        public void actionPerformed(ActionEvent e) {
             
            if(e.getActionCommand().equalsIgnoreCase("VISUALIZAR")){
                StringBuilder stringBuilder = new StringBuilder();
                
                for (int i = 0; i < ArrayListPrestamos.size(); i++) {
                    
                    String elemento = ArrayListPrestamos.get(i);
                    stringBuilder.append(elemento);
                    stringBuilder.append("\n");
                }
                RecursosMostrar = stringBuilder.toString();
                nombreRecursos.setText(RecursosMostrar);
                //Vista.setNombreRecursos(nombreRecursos);     
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
