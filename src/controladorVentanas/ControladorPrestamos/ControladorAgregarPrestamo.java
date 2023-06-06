/*NOMPRE DE PARTICIPANTES :Miguel Gonzales , Ana Mezu ,Vanesa Chavez . 
PROFESOR: Luis Romo.
GRUPO DE FPOE:01.
MINI PROYECTO 3.*/
package controladorVentanas.ControladorPrestamos;

import Vista.Prestamo.AgregarPrestamo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import java.util.HashMap;
import javax.swing.JLabel;
import javax.swing.JTextField;
import modelo.prestamo;
import modelo.recurso;

public class ControladorAgregarPrestamo {
    
    //ATRIBUTOS
    
    private HashMap<String, String> coleccionRecursos;
    
    private JLabel nombreUsuario;
    private JTextField nombreRecursoDigitado;
    private static AgregarPrestamo Vista;
    private prestamo prestamo;
    private recurso recursos;
   
    private ArrayList<String> ArrayListPrestamos = new ArrayList<>(); // 
    
    //METODO CONSTRUCTOR
    public ControladorAgregarPrestamo(recurso recursos, AgregarPrestamo Vista, String cc, ArrayList<String> ArrayPrestamo){

        this.Vista = Vista;
        this.recursos = recursos;
        
        this.nombreRecursoDigitado = Vista.getNombreRecurso();
        this.coleccionRecursos = (HashMap<String, String>) recursos.getColeccionRecurso();
        

        this.ArrayListPrestamos = ArrayPrestamo;
        
        this.Vista.addbotonFinalizarListener(new CalculateListener());
 
        Vista.setVisible(true);
        Vista.setLocationRelativeTo(null);
    }
    
    class CalculateListener implements ActionListener{
         String nombreRecurso;
         String Cadena;
         
        @Override
        public void actionPerformed(ActionEvent e) {
            nombreRecurso = nombreRecursoDigitado.getText();   
            if(e.getActionCommand().equalsIgnoreCase("FINALIZAR")){
  
                if(coleccionRecursos.get(nombreRecurso)== null){
                    System.out.println("no existe"); // No existe el recurso en el map de RECURSOS
                }
                else{
                    ArrayListPrestamos.add(nombreRecurso);
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
