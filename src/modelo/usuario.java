/*NOMPRE DE PARTICIPANTES :Miguel Gonzales , Ana Mezu ,Vanesa Chavez . 
PROFESOR: Luis Romo.
GRUPO DE FPOE:01.
MINI PROYECTO 3.*/
package modelo;

import java.util.HashMap;
import java.util.Map;

public class usuario {
    //ATRIBUTOS
    private static Map<String,String> coleccionUsuario = new HashMap<>();
  
    //CONSTRUCTOR
    public usuario(){ 
    }
    //METODOS
    public static Map<String, String> getColeccionUsuario() {
        return coleccionUsuario;
    }
}


