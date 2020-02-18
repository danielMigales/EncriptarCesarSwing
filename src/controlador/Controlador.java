package controlador;

import algoritmo.Algoritmo;
import cesarui.CesarGUI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import util.Alfabeto;
import util.CommandName;

public class Controlador implements ActionListener {

    private final CesarGUI userInterface;

    private Controlador(CesarGUI userInterface) {
        this.userInterface = userInterface;
    }

    public static Controlador fromUserInterface(CesarGUI userInterface) {
        return new Controlador(userInterface);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        CommandName comando = CommandName.valueOf(e.getActionCommand());

        if (comando == CommandName.CODIFICAR_BTN) {
            System.out.println("Se ha clicado boton de codificar");
            codificarActionPerformed();
        } else if (comando == CommandName.DECODIFICAR_BTN) {
            System.out.println("Se ha clicado boton de decodificar");
            decodificarActionPerformed();
        }
    }

    private void codificarActionPerformed() {
        
        String texto = userInterface.getTxtAEntrada().getText();
        int clave = (int) userInterface.getjClave().getValue();
        int valorAlfabeto = userInterface.getSelAlfabeto().getSelectedIndex();
        String alfabeto = "";
        switch (valorAlfabeto) {
            case 0:
                alfabeto = Alfabeto.ESP.toString();
                break;
            case 1:
                alfabeto = Alfabeto.ENG.toString();
                break;
        }
        String resultado = Algoritmo.codificarCesar(texto, clave, alfabeto);
        userInterface.getTxtAResultado().setText(resultado);
    }

    private void decodificarActionPerformed() {

        String texto = userInterface.getTxtAEntrada().getText();
        int clave = (int) userInterface.getjClave().getValue();
        int valorAlfabeto = userInterface.getSelAlfabeto().getSelectedIndex();
        String alfabeto = "";
        switch (valorAlfabeto) {
            case 0:
                alfabeto = Alfabeto.ESP.toString();
                break;
            case 1:
                alfabeto = Alfabeto.ENG.toString();
                break;
        }
        String resultado = Algoritmo.deCodificarCesar(texto, clave, alfabeto);
        userInterface.getTxtAResultado().setText(resultado);
    }
}
