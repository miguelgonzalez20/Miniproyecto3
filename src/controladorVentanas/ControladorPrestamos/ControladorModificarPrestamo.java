
package controladorVentanas.ControladorPrestamos;

import Vista.Prestamo.ModificarPrestamo;
import controladorVentanas.ControladorVentanaPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JTextField;
import modelo.prestamo;
import modelo.recurso;

public class ControladorModificarPrestamo {
    
    //ATRIBUTOS

    private static ModificarPrestamo Vista;
    private recurso recursos;  // COLECCION DE RECURSOS
    private prestamo prestamos;  // COLECCCION DE PRESTAMOS
    private String cedula;
    private JTextField txtRecursos_Para_Entregar;  //Recursos pendientes para entregar
    private JTextField txtRecursos_A_Entregar;  // Recursos que tengo para entregar
    
    private HashMap<String, String> coleccionRecursos;
    private HashMap<String, ArrayList<String>> coleccionPrestamos;
    
    //private ArrayList<String> ArrayListPrestamos = new ArrayList<>();

    //METODO CONSTRUCTOR
    public ControladorModificarPrestamo(recurso recursos, prestamo prestamos, ModificarPrestamo Vista, String cc){
        
        this.Vista = Vista;
        this.recursos = recursos;
        this.cedula = cc;
        this.txtRecursos_Para_Entregar = Vista.getTxtRecursos_Para_Entregar();
        this.txtRecursos_A_Entregar = Vista.getTxtRecursos_A_Entregar();
        
        this.coleccionRecursos = (HashMap<String, String>) recursos.getColeccionRecurso();
        this.coleccionPrestamos = (HashMap<String, ArrayList<String>>) prestamos.getColeccionPrestamos();

        this.Vista.addbotonFinalizarListener(new CalculateListener());
        this.Vista.addbotonVisualizarListener(new CalculateListener());
        this.Vista.addbotonEntregarListener(new CalculateListener());
        
        Vista.setVisible(true);
        Vista.setLocationRelativeTo(null);
    }
    
    class CalculateListener implements ActionListener{
        
        
        
        @Override
        public void actionPerformed(ActionEvent e) {
            
            
            if(e.getActionCommand().equalsIgnoreCase("VISUALIZAR")){
                coleccionPrestamos.get(cedula);
                txtRecursos_Para_Entregar.setText();
            }
            if(e.getActionCommand().equalsIgnoreCase("ENTREGAR")){ 
            }
            if(e.getActionCommand().equalsIgnoreCase("FINALIZAR")){
                ControladorVentanaPrincipal.mostrar();
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
