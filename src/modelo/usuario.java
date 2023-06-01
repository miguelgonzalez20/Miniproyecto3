/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Miguel
 */
public class usuario {
    //ATRIBUTOS
    public static Map<Integer,String> coleccion = new HashMap<>();
    
    private String nombre;
    private int cc;
    private String tipo;
    
    
    public usuario(){
        
    }
    
    public static String hashMapToString(HashMap<?, ?> hashMap) {
        StringBuilder sb = new StringBuilder();

        for (Map.Entry<?, ?> entry : hashMap.entrySet()) {
            sb.append(entry.getKey()).append(": ").append(entry.getValue()).append(", ");
        }

        // Eliminar la última coma y espacio
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 2);
        }

        return sb.toString();
    }
    
    public usuario(String nombre, int cc, String tipo) {
        this.nombre = nombre;
        this.cc = cc;
        this.tipo = tipo;
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
    
    
    
}


