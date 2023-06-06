
package controladorVentanas.ControladorPrestamos;

import Vista.Prestamo.ModificarPrestamo;
import controladorVentanas.ControladorVentanaPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeMap;
import javax.swing.JTextField;
import modelo.prestamo;
import modelo.recurso;

public class ControladorModificarPrestamo {
    
    //ATRIBUTOS
    private ArrayList<String> ArrayRecursosPrestamo = new ArrayList<>();;
    private ArrayList<String> ArrayRecursosEntregados = new ArrayList<>();;
        
    private static ModificarPrestamo Vista;
    private recurso recursos;  // COLECCION DE RECURSOS
    private prestamo prestamos;  // COLECCCION DE PRESTAMOS
    private String cedula;
    private JTextField txtRecursos_Para_Entregar;  //Recursos pendientes para entregar
    private JTextField txtRecursos_A_Entregar;  // Recursos que tengo para entregar
    
    private HashMap<String, String> coleccionRecursos;
    private HashMap<String, ArrayList<String>> coleccionPrestamos;
    private TreeMap<String, ArrayList<String>> coleccionRecursosDevueltos;
    
    //METODO CONSTRUCTOR
    public ControladorModificarPrestamo(recurso recursos, prestamo prestamos, ModificarPrestamo Vista, String cc){
        
        this.Vista = Vista;
        this.recursos = recursos;
        this.prestamos = prestamos;
        this.cedula = cc;
        this.coleccionRecursosDevueltos = (TreeMap<String, ArrayList<String>>) prestamos.getColeccionRecursosDevueltos();
        //this.ArrayRecursosEntregados = coleccionRecursosDevueltos.get(cedula);
        
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
        String RecursosPrestamoMostrar;
        String palabra;
        
        
        
        public void actionPerformed(ActionEvent e) {
         
            if(e.getActionCommand().equalsIgnoreCase("VISUALIZAR")){
                ArrayRecursosPrestamo = coleccionPrestamos.get(cedula);
                StringBuilder stringBuilder = new StringBuilder();
                int lastIndex = ArrayRecursosPrestamo.size() - 1;
                for (int i = 0; i <lastIndex; i++) {
                    stringBuilder.append(ArrayRecursosPrestamo.get(i)).append(", ");
                }
                RecursosPrestamoMostrar = stringBuilder.toString();
                txtRecursos_Para_Entregar.setText(RecursosPrestamoMostrar);
            }
            if(e.getActionCommand().equalsIgnoreCase("ENTREGAR")){
                //ArrayRecursosEntregados = coleccionRecursosDevueltos.get(cedula);
                ArrayRecursosEntregados.add(txtRecursos_A_Entregar.getText()); //Agrego lo digitado
                coleccionRecursosDevueltos.put(cedula, ArrayRecursosEntregados); // y lo pongo en mi treemap
            }
            if(e.getActionCommand().equalsIgnoreCase("FINALIZAR")){
                ArrayRecursosPrestamo = coleccionPrestamos.get(cedula);
                int lastIndex = ArrayRecursosPrestamo.size() -1;
                ArrayRecursosPrestamo.remove(lastIndex); // Tenemos nuestro array List sin el "ESTADO"
                
                ArrayRecursosEntregados = coleccionRecursosDevueltos.get(cedula); // Tenemos los 2 arrays para comparar
                boolean sonIguales = compararArrayLists(ArrayRecursosPrestamo, ArrayRecursosEntregados);
                if(sonIguales == true){
                    ArrayRecursosPrestamo.add("Estado Cerrado");
                    coleccionPrestamos.put(cedula,ArrayRecursosPrestamo);
                }
                if(sonIguales == false){
                    ArrayRecursosPrestamo.add("Estado Parcialmente Cerrado");
                    coleccionPrestamos.put(cedula,ArrayRecursosPrestamo);
                }
                System.out.println("ARRAY DE RECURSO PRESTAMO : " + ArrayRecursosPrestamo);
                System.out.println("ARRAY DE RECURSOS DEVUELTOS : " + ArrayRecursosEntregados);
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
    
    public static boolean compararArrayLists(ArrayList<String> arrayList1, ArrayList<String> arrayList2) {
        if (arrayList1.size() != arrayList2.size()) {
            return false;
        }

        HashSet<String> set1 = new HashSet<>(arrayList1);
        HashSet<String> set2 = new HashSet<>(arrayList2);

        return set1.equals(set2);
    }
    
}
