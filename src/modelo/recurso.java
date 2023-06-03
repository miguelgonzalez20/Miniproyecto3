
package modelo;

import java.util.HashMap;
import java.util.Map;


public class recurso {
    //ATRIBUTOS
    private static Map<String,String> coleccionRecurso = new HashMap<>();
    
    //CONSTRUCTOR
    public recurso() {
    }
    
    //METODOS
    public static Map<String, String> getColeccionRecurso() {
        return coleccionRecurso;
    }
}
