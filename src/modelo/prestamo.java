
package modelo;

import java.util.HashMap;
import java.util.Map;

public class prestamo {
    
    //ATRIBUTOS
    private static Map<String,String> coleccionPrestamos = new HashMap<>();
    private String cedula;
    private String cadenaRecursos;
    
    //CONSTRUCTOR
    public prestamo(){ 
    }
    
    //METODOS

    public String getCadenaRecursos() {
        return cadenaRecursos;
    }

    public void setCadenaRecursos(String cadenaRecursos) {
        this.cadenaRecursos = cadenaRecursos;
    }
    
    
    public static Map<String, String> getColeccionPrestamos() {
        return coleccionPrestamos;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
}
