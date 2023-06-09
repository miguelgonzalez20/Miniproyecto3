/*NOMPRE DE PARTICIPANTES :Miguel Gonzales , Ana Mezu ,Vanesa Chavez . 
PROFESOR: Luis Romo.
GRUPO DE FPOE:01.
MINI PROYECTO 3.*/
package controladorVentanas.ControladorPrestamos;

import Vista.Prestamo.AgregarPrestamo;
import Vista.Prestamo.ConsultarPrestamo;
import Vista.Prestamo.EliminarPrestamo;
import Vista.Prestamo.ModificarPrestamo;
import Vista.Prestamo.VentanaPrestamo;
import controladorVentanas.ControladorVentanaPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import modelo.prestamo;
import modelo.recurso;
import modelo.usuario;

public class ControladorPrestamo {

    //ATRIBUTOS
    private HashMap<String, ArrayList<String>> coleccionPrestamo;
    private HashMap<String, String> coleccionUsuario;
    
    private JTextField cedula;
    private JLabel nombreUsuario;
    private static VentanaPrestamo Vista;
    private prestamo prestamo;
    
    private static ArrayList<String> ArrayListPrestamos1 = new ArrayList<>(); // Array
    
    //METODO CONSTRUCTOR
    public ControladorPrestamo(prestamo prestamo, VentanaPrestamo Vista, usuario usuario){
        this.prestamo = prestamo;
        this.Vista = Vista;
        
        this.coleccionPrestamo = (HashMap<String, ArrayList<String> >) prestamo.getColeccionPrestamos();
        this.coleccionUsuario = (HashMap<String, String>) usuario.getColeccionUsuario();
        
        this.cedula = this.Vista.getCedula();
        this.nombreUsuario = this.Vista.getNombreUsuario();
                
        this.Vista.addbotonFinalizarListener(new CalculateListener());
        this.Vista.addbotonBuscarListener(new CalculateListener());  
        this.Vista.addbotonAgregarListener(new CalculateListener());
        this.Vista.addbotonEliminarListener(new CalculateListener());
        this.Vista.addbotonConsultarListener(new CalculateListener());
        this.Vista.addbotonModificarListener(new CalculateListener());
        
        Vista.setVisible(true);
        Vista.setLocationRelativeTo(null);
        JOptionPane.showMessageDialog(null, 
                 "INSTRUCCIONES\n" +
"DESPUES DE COLOCAR TU CEDULA DA CLICK EN EL BOTON BUSCAR\n "+
"BOTON AGREGAR  : PODRAS AGREGAR LOS RECURSOS PARA EL PRESTAMO ESCRIBIENDO SU NOMBRE, \n"+
" SI QUIERES AGREGAR MAS DE UN RECURSO TIENES QUE REPETIR EL PROCESO CUANTOS RECURSOS QUIERAS AGREGAR\n" +
"BOTON CONSULTAR :  AQUI PODRAS CONSULTAR LOS PRESTAMOS Y SUS ESTADOS\n" +
"BOTON ELIMINAR  :  AQUI PODRAS ELIMINAR LOS RECURSOS QUE YA HAZ ESCOGIDO ESCRIBIENDO SU NOMBRE\n"
       +"ESTA OPCION SE PIENSA COMO UN CARRITO DE COMPRAS \n" +
"BOTON MODIFICAR  :  ESTA OPCION SIRVE CUANDO EL USUARIO VAYA A DEVOLVER LOS RECURSOS DEL SU PRESTAMO\n"
                         + "A SU VEZ QUE MODIFICAMOS EL ESTADO DEL PRESTAMO DE ABIERTO, A CERRADO\n"
                         + "O PARCIALMENTE CERRADO");
    }
    
    class CalculateListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            String cc = cedula.getText();
            
            if(e.getActionCommand().equalsIgnoreCase("BUSCAR")){
                nombreUsuario.setText(coleccionUsuario.get(cc));

            }
            if(e.getActionCommand().equalsIgnoreCase("AGREGAR")){
                Vista.setVisible(false);
                AgregarPrestamo vista = new AgregarPrestamo();
                recurso recursos = new recurso();
                ControladorAgregarPrestamo controlador = new ControladorAgregarPrestamo(recursos, vista, cc,ArrayListPrestamos1);
                
                System.out.println("le di agregar");
                
            }
            if(e.getActionCommand().equalsIgnoreCase("CONSULTAR")){
                Vista.setVisible(false);
                ConsultarPrestamo vista = new ConsultarPrestamo();
                prestamo prestamos = new prestamo();
                ControladorConsultarPrestamo controlador = new ControladorConsultarPrestamo(vista, prestamos);
                
            }
            if(e.getActionCommand().equalsIgnoreCase("ELIMINAR")){
                Vista.setVisible(false);
                EliminarPrestamo vista = new EliminarPrestamo();
                recurso recursos = new recurso();
                ControladorEliminarPrestamo controlador = new ControladorEliminarPrestamo(recursos, vista, ArrayListPrestamos1);
            }
            if(e.getActionCommand().equalsIgnoreCase("MODIFICAR")){
                Vista.setVisible(false);
                ModificarPrestamo vista = new ModificarPrestamo();
                recurso recursos = new recurso();
                prestamo prestamos = new prestamo();
                ControladorModificarPrestamo controlador = new ControladorModificarPrestamo(recursos, prestamos, vista, cc);
    
            }
            if(e.getActionCommand().equalsIgnoreCase("FINALIZAR PRESTAMO")){
                ArrayListPrestamos1.add("Estado : Abierto");
                coleccionPrestamo.put(cc,ArrayListPrestamos1);
                ControladorVentanaPrincipal.mostrar();
                Vista.setVisible(false);
                System.out.println("le di finalizar");
                System.out.println(coleccionPrestamo.get(cc));
                
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

    public ArrayList<String> getArrayListPrestamos() {
        return ArrayListPrestamos1;
    }

    public static void setArrayListPrestamos(ArrayList<String> nombreArray) {
        ArrayListPrestamos1 = nombreArray;
    }
    
    
}
