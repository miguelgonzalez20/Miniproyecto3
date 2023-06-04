
package controladorVentanas;

import Vista.ListaUsuarios;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JTextArea;
import modelo.usuario;

public class ControladorListaUsuarios {
    
    //ATRIBUTOS
    private HashMap<String, String> coleccionlistaUsuario;
    private JTextArea TxtUsuarios;
    private static ListaUsuarios Vista;
    private usuario modelo;

    //METODO CONSTRUCTOR
    public ControladorListaUsuarios(usuario modelo, ListaUsuarios Vista){
        
        this.coleccionlistaUsuario = (HashMap<String, String>) usuario.getColeccionUsuario();
        this.TxtUsuarios = this.Vista.getTxtUsuarios();

        this.modelo = modelo;
        this.Vista = Vista;
       
        this.Vista.addbotonVisualizarListener(new CalculateListener());
        
        Vista.setVisible(true);
        Vista.setLocationRelativeTo(null);
    }

    
    
    class CalculateListener implements ActionListener{
        
        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getActionCommand().equalsIgnoreCase("VISUALIZAR")){

                StringBuilder stringBuilder = new StringBuilder();
                
                for (String key : coleccionlistaUsuario.keySet()) {
                    stringBuilder.append(key).append(": ").append(coleccionlistaUsuario.get(key)).append("\n"); 
                }
                String elements = stringBuilder.toString();
                
                TxtUsuarios.setText(elements);
            }   
        }  
    }

    /*public static String hashMapToString(HashMap<?, ?> hashMap) {
        StringBuilder sb = new StringBuilder();

        for (Map.Entry<?, ?> entry : hashMap.entrySet()) {
            sb.append(entry.getKey()).append(": ").append(entry.getValue()).append(", ");
        }

        // Eliminar la última coma y espacio
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 2);
        }

        return sb.toString();
    }*/
    
    public static void mostrar(){
        Vista.setVisible(true);
        Vista.setLocationRelativeTo(null);
    }
    public static void ocultar(){
        Vista.setVisible(false);
        Vista.dispose();
    }
}
