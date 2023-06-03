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


