/*NOMPRE DE PARTICIPANTES :Miguel Gonzales , Ana Mezu ,Vanesa Chavez . 
PROFESOR: Luis Romo.
GRUPO DE FPOE:01.
MINI PROYECTO 3.*/
package controladorVentanas.ControladorPrestamos;

import Vista.Prestamo.EliminarPrestamo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JOptionPane;

import javax.swing.JTextField;
import modelo.recurso;

public class ControladorEliminarPrestamo {
    
    //ATRIBUTOS

    private static EliminarPrestamo Vista;
    private recurso recursos;
    
    private JTextField nombreRecursoDigitado;
    
    private HashMap<String, String> coleccionRecursos;
    
    private ArrayList<String> ArrayListPrestamos = new ArrayList<>();

    //METODO CONSTRUCTOR
    public ControladorEliminarPrestamo(recurso recursos, EliminarPrestamo Vista, ArrayList<String> ArrayPrestamo){
        
        this.Vista = Vista;
        this.recursos = recursos;
        
        this.nombreRecursoDigitado = Vista.getNombreRecursoDigitado();
        
        this.coleccionRecursos = (HashMap<String, String>) recursos.getColeccionRecurso();

        this.ArrayListPrestamos = ArrayPrestamo;
        
        this.Vista.addbotonEliminarListener(new CalculateListener());
        
        Vista.setVisible(true);
        Vista.setLocationRelativeTo(null);
    }
    
    class CalculateListener implements ActionListener{
         String nombreRecurso;
         String Cadena;
         
        @Override
        public void actionPerformed(ActionEvent e) {
            nombreRecurso = nombreRecursoDigitado.getText();   
            if(e.getActionCommand().equalsIgnoreCase("ELIMINAR")){
                JOptionPane.showMessageDialog(null, "Tu prestamo ha sido eliminado, da click en el botón  FINALIZAR para volver al menú principal.");
  
                if(coleccionRecursos.get(nombreRecurso)== null){
                    System.out.println("no existe");
                }
                else{
                    ArrayListPrestamos.remove(nombreRecurso);
                    ControladorPrestamo.setArrayListPrestamos(ArrayListPrestamos);
                }
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
