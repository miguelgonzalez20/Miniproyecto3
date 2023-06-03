
package modelo;

import java.util.HashMap;
import java.util.Map;

public class prestamo {
    
    //ATRIBUTOS
    private static Map<String,String> coleccionPrestamos = new HashMap<>();
    private String cedula;
    
    //CONSTRUCTOR
    public prestamo(){ 
    }
    
    //METODOS
    public static Map<String, String> getColeccionPrestamos() {
        return coleccionPrestamos;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
}
