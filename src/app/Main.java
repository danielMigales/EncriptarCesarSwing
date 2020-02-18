package app;

import cesarui.CesarGUI;
import javax.swing.SwingUtilities;

public class Main {

//ESTO ES LO PRIMERO QUE SE DEBE HACER PARA CREAR LA INTERFAZ
    
    public static void main(String args[]) {
        
        SwingUtilities.invokeLater(new Runnable() { //CLASE ANONIMA INTERFACE RUNNABLE
            
            @Override
            public void run() {
                new CesarGUI().setVisible(true);
            }
        });
     
}
}


    
