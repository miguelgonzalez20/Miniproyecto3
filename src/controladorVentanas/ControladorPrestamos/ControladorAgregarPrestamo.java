
package controladorVentanas.ControladorPrestamos;

import Vista.Prestamo.AgregarPrestamo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;
import modelo.prestamo;
import modelo.recurso;

public class ControladorAgregarPrestamo {
    
    //ATRIBUTOS
    private String cadenaRecursos = " ";
    private HashMap<String, String> coleccionPrestamos;
    private HashMap<String, String> coleccionRecursos;
    private JComboBox<String> comboBox;
    private JLabel nombreUsuario;
    private JTextField nombreRecursoDigitado;
    private static AgregarPrestamo Vista;
    private prestamo prestamo;
    private recurso recursos;
    private String cedula;

    //METODO CONSTRUCTOR
    public ControladorAgregarPrestamo(recurso recursos, prestamo prestamo, AgregarPrestamo Vista, String cc){
        
        this.prestamo = prestamo;
        this.Vista = Vista;
        this.recursos = recursos;
        this.nombreRecursoDigitado = Vista.getNombreRecurso();
        this.coleccionPrestamos = (HashMap<String, String>) prestamo.getColeccionPrestamos();
        this.coleccionRecursos = (HashMap<String, String>) recursos.getColeccionRecurso();
        this.nombreUsuario = this.Vista.getNombreUsuario();
        this.cedula = cc;
        this.Vista.addbotonFinalizarListener(new CalculateListener());

        Vista.setVisible(true);
        Vista.setLocationRelativeTo(null);
    }
    
    class CalculateListener implements ActionListener{
         String nombreRecurso;
         String Cadena;
         
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("CADENA DE RECURSOS ACTUAL : " + cadenaRecursos);

            if(e.getActionCommand().equalsIgnoreCase("FINALIZAR")){
                nombreRecurso = nombreRecursoDigitado.getText();
  
                if(coleccionRecursos.get(nombreRecurso)== null){
                    System.out.println("no existe");
                }
                else{
                    Cadena = prestamo.getCadenaRecursos() + " / " + nombreRecurso;
                    
                    //cadenaRecursos = cadenaRecursos + " / " + nombreRecurso;
                    coleccionPrestamos.put(cedula,Cadena);
                    prestamo.setCadenaRecursos(Cadena);
                }
                ControladorPrestamo.mostrar();
                Vista.setVisible(false);
                System.out.println(coleccionPrestamos.get(cedula));
                
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
