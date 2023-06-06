
package modelo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class prestamo {
    
    //ATRIBUTOS
    private static Map< String, ArrayList<String>> coleccionPrestamos = new HashMap<>();
    private static TreeMap<String, ArrayList<String>> coleccionRecursosDevueltos = new TreeMap<>();

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
    
    //Retorna mi HashMap de prestamos
    public static Map<String, ArrayList<String>> getColeccionPrestamos() {
        return coleccionPrestamos;
    }

    public static TreeMap<String, ArrayList<String>> getColeccionRecursosDevueltos() {
        return coleccionRecursosDevueltos;
    }

    public void setColeccionRecursosDevueltos(TreeMap<String, ArrayList<String>> coleccionRecursosDevueltos) {
        this.coleccionRecursosDevueltos = coleccionRecursosDevueltos;
    }
    

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
}
