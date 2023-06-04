
package modelo;

import java.util.HashMap;
import java.util.Map;
import javax.swing.JComboBox;


public class recurso {
    //ATRIBUTOS
    private static Map<String,String> coleccionRecurso = new HashMap<>();
    private JComboBox<String> comboBox;
    //CONSTRUCTOR
    public recurso() {
    }
    
    //METODOS
    public static Map<String, String> getColeccionRecurso() {
        return coleccionRecurso;
    }

    public JComboBox<String> getComboBox() {
        return comboBox;
    }
    
    public void agregarItem(String item){
        comboBox.addItem(item);
    }
    
}
