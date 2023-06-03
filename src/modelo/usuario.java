
package modelo;

import java.util.HashMap;
import java.util.Map;

public class usuario {
    //ATRIBUTOS
    public static Map<String,String> coleccionUsuario = new HashMap<>();
    
    private String nombre;
    private int cc;
    private String tipo;
    
    
    public usuario(){
        
    }

    public String getNombre() {
        return nombre;
    }

    public int getCc() {
        return cc;
    }

    public String getTipo() {
        return tipo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public static Map<String, String> getColeccionUsuario() {
        return coleccionUsuario;
    }
    
    
}


