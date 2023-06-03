
package modelo;

import java.util.HashMap;
import java.util.Map;

public class usuario {
    //ATRIBUTOS
    public static Map<String,String> coleccionUsuario = new HashMap<>();
  

    public usuario(){ 
    }

    public static Map<String, String> getColeccionUsuario() {
        return coleccionUsuario;
    }
    
    
}


