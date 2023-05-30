
package controladorVentanas;
import modelo.usuario;
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
import Vista.VentanaPrincipal;
import Vista.VentanaRecursos;
import Vista.VentanaUsuarios;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.recurso;


public class Controlador implements ActionListener{
    
    //ATRIBUTOS
    private usuario usuario;
    private recurso recurso;
    
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
    private VentanaPrincipal vistaVentanaPrincipal;
    private VentanaRecursos vistaVentanaRecursos;
    private VentanaUsuarios vistaVentanaUsuarios;
    
    //METODO CONSTRUCTOR
    public Controlador (usuario usuario, recurso recurso, ActualizarUsuario vistaActualizarUsuario, AgregarPrestamo vistaAgregarPrestamo,
        AgregarRecurso vistaAgregarRecurso, AgregarUsuario vistaAgregarUsuario, EliminarPrestamo vistaEliminarPrestamo,
        EliminarRecurso vistaEliminarRecurso, EliminarUsuario vistaEliminarUsuario, ListaPrestamo vistaListaPrestamo,
        ListaRecursos vistaListaRecursos, ListaUsuarios vistaListaUsuarios, VentanaPrestamo vistaVentanaPrestamo,
         VentanaPrincipal vistaVentanaPrincipal,
        VentanaRecursos vistaVentanaRecursos, VentanaUsuarios vistaVentanaUsuarios) {
        
        this.usuario = usuario;
        this.recurso = recurso;
        
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
        
        this.vistaVentanaPrincipal = vistaVentanaPrincipal;
        this.vistaVentanaRecursos = vistaVentanaRecursos;
        this.vistaVentanaUsuarios = vistaVentanaUsuarios;
        
    };

    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
