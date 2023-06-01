
package controladorVentanas;

import Vista.ActualizarUsuario;
import Vista.ListaUsuarios;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.usuario;

public class ControladorActualizarUsuario {
    
    private ActualizarUsuario Vista;
    private usuario modelo;
     
    //METODO CONSTRUCTOR
    public ControladorActualizarUsuario(usuario modelo, ActualizarUsuario Vista){
        this.modelo = modelo;
        this.Vista = Vista;
        
        Vista.setVisible(true);
        Vista.setLocationRelativeTo(null);
       
        this.Vista.addebotonVisualizarListener(new CalculateListener());
    }
    
    class CalculateListener implements ActionListener{
         
        String usuarios;
        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getActionCommand().equalsIgnoreCase("VISUALIZAR")){
                StringBuilder stringBuilder = new StringBuilder();
                
                for (Integer key : usuario.coleccion.keySet()) {
                    stringBuilder.append(key).append(": ").append(usuario.coleccion.get(key)).append("\n"); 
                }
                String elements = stringBuilder.toString();
                Vista.setTxtUsuarios(elements);
            }   
        }  
    }
    
}
