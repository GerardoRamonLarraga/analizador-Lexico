
package tarea;

import com.jtattoo.plaf.acryl.AcrylLookAndFeel; //tema

import TAREA.Interfaz;        
        
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.UIManager;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
 
         try {
             AcrylLookAndFeel.setTheme("Large-Font");
              System.out.println(AcrylLookAndFeel.getThemes());
           UIManager.setLookAndFeel(new AcrylLookAndFeel());
         
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            ex.printStackTrace();
        }
         Interfaz interfaz = new Interfaz();
         interfaz.setVisible(true);
    }
        
    }//cierra main
    
