
package controladorVentanas;

import Vista.ListaRecursos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import javax.swing.JTextArea;
import modelo.recurso;

public class ControladorListaRecursos {
    
    private HashMap<String, String> coleccionRecursos;
    private JTextArea listaRecursos; // textAREA
    private static ListaRecursos Vista;
    private recurso modelo;
    
    //METODO CONSTRUCTOR
    public ControladorListaRecursos(recurso modelo, ListaRecursos Vista){
        
        this.modelo = modelo;
        this.Vista = Vista;
        this.coleccionRecursos = (HashMap<String, String>) recurso.getColeccionRecurso();
        this.listaRecursos = this.Vista.getListaRecursos();

        

        this.Vista.addbotonVisualizarListener(new CalculateListener());
        
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
            if(e.getActionCommand().equalsIgnoreCase("VISUALIZAR")){
                
                StringBuilder stringBuilder = new StringBuilder();
                
                for (String key : coleccionRecursos.keySet()) {
                    stringBuilder.append(key).append(": ").append(coleccionRecursos.get(key)).append("\n"); 
                }
                String elements = stringBuilder.toString();
                listaRecursos.setText(elements);
                
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
