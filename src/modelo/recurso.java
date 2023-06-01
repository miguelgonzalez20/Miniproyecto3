
package modelo;

import java.util.HashMap;
import java.util.Map;


public class recurso {
    
    public static Map<Integer,String> coleccion = new HashMap<>();
    
    private String nombreRecurso;
    private String autor;
    private String categoria;

    public recurso(String nombreRecurso, String autor, String categoria) {
        this.nombreRecurso = nombreRecurso;
        this.autor = autor;
        this.categoria = categoria;
    }

    public String getNombreRecurso() {
        return nombreRecurso;
    }

    public String getAutor() {
        return autor;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setNombreRecurso(String nombreRecurso) {
        this.nombreRecurso = nombreRecurso;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    
}
