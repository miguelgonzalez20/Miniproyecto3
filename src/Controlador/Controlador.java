
package Controlador;

import Modelo.modelo;
import Vista.ActualizarUsuario;
import Vista.AgregarPrestamo;
import Vista.AgregarRecurso;
import Vista.AgregarUsuario;
import Vista.EliminarPrestamo;
import Vista.EliminarRecurso;
import Vista.EliminarUsuario;
import Vista.ListaPrestamo;
import Vista.ListaRecursos;
import Vista.ListaUsuarios;
import Vista.VentanaPrestamo;
import Vista.VentanaPrestamoSiguiente;
import Vista.VentanaPrincipal;
import Vista.VentanaRecursos;
import Vista.VentanaUsuarios;


public class Controlador {
    
    //ATRIBUTOS
    private modelo modelo;
    
    private ActualizarUsuario vistaActualizarUsuario;
    
    private AgregarPrestamo vistaAgregarPrestamo;
    private AgregarRecurso vistaAgregarRecurso;
    private AgregarUsuario vistaAgregarUsuario;
    
    private EliminarPrestamo vistaEliminarPrestamo;
    private EliminarRecurso vistaEliminarRecurso;
    private EliminarUsuario vistaEliminarUsuario;
    
    private ListaPrestamo vistaListaPrestamo;
    private ListaRecursos vistaListaRecursos;
    private ListaUsuarios vistaListaUsuarios;
    
    private VentanaPrestamo vistaVentanaPrestamo;
    private VentanaPrestamoSiguiente vistaVentanaPrestamoSiguiente;
    private VentanaPrincipal vistaVentanaPrincipal;
    private VentanaRecursos vistaVentanaRecursos;
    private VentanaUsuarios vistaVentanaUsuarios;
    
    //METODO CONSTRUCTOR
    public Controlador (modelo modelo, ActualizarUsuario vistaActualizarUsuario, AgregarPrestamo vistaAgregarPrestamo,
        AgregarRecurso vistaAgregarRecurso, AgregarUsuario vistaAgregarUsuario, EliminarPrestamo vistaEliminarPrestamo,
        EliminarRecurso vistaEliminarRecurso, EliminarUsuario vistaEliminarUsuario, ListaPrestamo vistaListaPrestamo,
        ListaRecursos vistaListaRecursos, ListaUsuarios vistaListaUsuarios, VentanaPrestamo vistaVentanaPrestamo,
        VentanaPrestamoSiguiente vistaVentanaPrestamoSiguiente, VentanaPrincipal vistaVentanaPrincipal,
        VentanaRecursos vistaVentanaRecursos, VentanaUsuarios vistaVentanaUsuarios) {
        
        this.modelo = modelo;
        this.vistaActualizarUsuario = vistaActualizarUsuario;
        
        this.vistaAgregarPrestamo = vistaAgregarPrestamo;
        this.vistaAgregarRecurso = vistaAgregarRecurso;
        this.vistaAgregarUsuario = vistaAgregarUsuario;
        
        this.vistaEliminarPrestamo = vistaEliminarPrestamo;
        this.vistaEliminarRecurso = vistaEliminarRecurso;
        this.vistaEliminarUsuario = vistaEliminarUsuario;
        
        this.vistaListaPrestamo = vistaListaPrestamo;
        this.vistaListaRecursos = vistaListaRecursos;
        this.vistaListaUsuarios = vistaListaUsuarios;
        
        this.vistaVentanaPrestamo = vistaVentanaPrestamo;
        this.vistaVentanaPrestamoSiguiente = vistaVentanaPrestamoSiguiente;
        
        this.vistaVentanaPrincipal = vistaVentanaPrincipal;
        this.vistaVentanaRecursos = vistaVentanaRecursos;
        this.vistaVentanaUsuarios = vistaVentanaUsuarios;
        
    };
    
}
