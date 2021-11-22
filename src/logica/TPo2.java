
package logica;

import igu.Principal;

public class TPo2 {

    public static void main(String[] args) {
        Controladora control = new Controladora();
        
        Principal pantalla = new Principal(control);
        pantalla.setVisible(true);
        pantalla.setLocationRelativeTo(null);
                
    }
    
}
