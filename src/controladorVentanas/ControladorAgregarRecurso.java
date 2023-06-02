/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladorVentanas;

import Vista.AgregarRecurso;
import Vista.AgregarUsuario;
import static controladorVentanas.ControladorVentanaPrincipal.ventana;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;
import modelo.recurso;
import modelo.usuario;

/**
 *
 * @author Miguel
 */
public class ControladorAgregarRecurso {
    
    public static AgregarRecurso ventana = new AgregarRecurso();
    private JTextField nombreAutor;
    
    String nombre;
    private AgregarRecurso Vista;
    private recurso modelo;
     
    //METODO CONSTRUCTOR
    public ControladorAgregarRecurso(recurso modelo, AgregarRecurso Vista){
        this.modelo = modelo;
        this.Vista = Vista;
        this.nombreAutor = this.Vista.getNombreAutor();
                
        Vista.setVisible(true);
        Vista.setLocationRelativeTo(null);
       
        this.Vista.addbotonFinalizarListener(new CalculateListener());
    }
    
    class CalculateListener implements ActionListener{
         String palabra;
         String nombre;
         String tipoUsuario;
         String nombreRecurso;
         String cedula;
         int IntCedula;
         
        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getActionCommand().equalsIgnoreCase("AGREGAR")){
                nombre = nombreAutor.getText();
                tipoUsuario = Vista.obtenerElementoSeleccionado();
                
                
                palabra = nombre + " " + tipoUsuario;
                cedula = Vista.p1();
                IntCedula = Integer.parseInt(cedula);
                
                modelo.coleccion.put(IntCedula,palabra);
                System.out.println(modelo.coleccion);
                System.out.println("LE DI A ACEPTAR");
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
