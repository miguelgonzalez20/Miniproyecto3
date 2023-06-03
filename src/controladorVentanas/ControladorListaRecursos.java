
package controladorVentanas;

import Vista.ListaRecursos;
import static controladorVentanas.ControladorVentanaPrincipal.ventana;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import javax.swing.JTextArea;
import modelo.recurso;
import modelo.usuario;

public class ControladorListaRecursos {
    
    private HashMap<String, String> coleccionRecursos;
    private JTextArea listaRecursos; // textAREA
    private ListaRecursos Vista;
    private recurso modelo;
    
    //METODO CONSTRUCTOR
    public ControladorListaRecursos(recurso modelo, ListaRecursos Vista){
        this.modelo = modelo;
        this.Vista = Vista;
        this.listaRecursos = this.Vista.getListaRecursos();
        
        this.coleccionRecursos = (HashMap<String, String>) recurso.getColeccionRecurso();
        
        Vista.setVisible(true);
        Vista.setLocationRelativeTo(null);
       
        this.Vista.addbotonVisualizarListener(new CalculateListener());
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
                /*nombreA = nombreAutor.getText();
                nombreR = nombreRecurso.getText();
                tipoR = (String) tipoUsuario.getSelectedItem();
                palabra = nombreA + " " + tipoR;
                coleccionRecursos.put(nombreR, palabra);*/
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
