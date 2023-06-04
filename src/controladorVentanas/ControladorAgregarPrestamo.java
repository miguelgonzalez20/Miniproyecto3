
package controladorVentanas;

import Vista.AgregarPrestamo;
import Vista.VentanaPrestamo;
import static controladorVentanas.ControladorVentanaPrincipal.ventana;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;
import modelo.prestamo;
import modelo.recurso;
import modelo.usuario;

public class ControladorAgregarPrestamo {
    
    //ATRIBUTOS
    private String cadenaRecursos;
    private HashMap<String, String> coleccionPrestamos;
    private HashMap<String, String> coleccionRecursos;
    private JComboBox<String> comboBox;
    private JLabel nombreUsuario;
    private JTextField nombreRecursoDigitado;
    private AgregarPrestamo Vista;
    private prestamo prestamo;
    private recurso recursos;
    private String cedula;

    //METODO CONSTRUCTOR
    public ControladorAgregarPrestamo(recurso recursos, prestamo prestamo, AgregarPrestamo Vista, String cc){
        this.cadenaRecursos = " ";
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
         
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println(cadenaRecursos);

            if(e.getActionCommand().equalsIgnoreCase("FINALIZAR")){
                String nombreRecurso = nombreRecursoDigitado.getText();
  
                if(coleccionRecursos.get(nombreRecurso)== null){
                    System.out.println("no existe");
                }
                else{
                    cadenaRecursos = cadenaRecursos + " / " + nombreRecurso;
                    coleccionPrestamos.put(cedula,cadenaRecursos);
                    ocultar();
                    ControladorPrestamo.mostrar();
                }
                System.out.println(coleccionPrestamos.get(cedula));
                
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
