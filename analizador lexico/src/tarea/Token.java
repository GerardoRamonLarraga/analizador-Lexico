package TAREA;
import java.util.Scanner;

public class Token {
    
    private String valor;
    private Tipos tipo;
    
     /**
     * @return the valor
     */
    public String getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(String valor) {
        this.valor = valor;
    }
    

    /**
     * @return the tipo
     */
    public Tipos getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipos(Tipos tipo) {
        this.tipo = tipo;
    }
}
       
    enum Tipos{
        
        NUMERO("[0-9]+"),
        OPERADOR("[+|-|/|*]"),
        VARIABLE("[w|x|y|z|W|X|Y|Z]"),
        CONSTANTE("PI|E|e|pi]"),
        DESCONOCIDAS("[a-df-v|A-V]");
        

        //almacenar la cadena asociada a cada tipo
        public final String patron;
 
        // Constructor que asigna la cadena a cada constante enumerada
        Tipos(String Entrada) {
            this.patron = Entrada;
        }
            
 
    }
