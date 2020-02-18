package algoritmo;

import java.util.ArrayList;

public class Algoritmo {

    public static String codificarCesar(String texto, int clave, String alfabeto) {

        char inputChar;
        int charValue;
        int newCharValue;
        texto = texto.toUpperCase(); //CONVIERTE EL STRING A MAYUSCULAS
        StringBuilder encriptado = new StringBuilder();
        //La clase StringBuilder sirve para almacenar cadenas de caracteres.
        //Su tamaño y contenido pueden modificarse.
        //Debe crearse con alguno de sus costructores asociados.
        //Un StringBuilder está indexado. Cada uno de sus caracteres tiene un índice: 0 para el primero.

        for (int i = 0; i < texto.length(); i++) { //Recorremos el string texto

            //guarda en un char cada letra de esa palabra
            inputChar = texto.charAt(i);
            //nos da el indice de la letra del alfabeto
            charValue = alfabeto.indexOf(inputChar);
            //aplica la formula devolviendo una letra
            newCharValue = (charValue + clave) % alfabeto.length();

            if (newCharValue < 0) {
                newCharValue += alfabeto.length();
            }
            //agrega al string cada letra nueva
            encriptado.append(alfabeto.charAt(newCharValue));
        }
        return encriptado.toString();
    }

    public static String deCodificarCesar(String texto, int clave, String alfabeto) {
        char inputChar;
        int charValue;
        int newCharValue;
        texto = texto.toUpperCase();
        StringBuilder encriptado = new StringBuilder();

        for (int i = 0; i < texto.length(); i++) {
            inputChar = texto.charAt(i);
            charValue = alfabeto.indexOf(inputChar);
            newCharValue = (charValue - clave) % alfabeto.length();

            if (newCharValue < 0) {
                newCharValue += alfabeto.length();
            }

            encriptado.append(alfabeto.charAt(newCharValue));
        }
        return encriptado.toString();
    }

    private ArrayList<String> decodificarCesarBruto(String texto, String alfabeto) {

        char inputChar;
        int charValue;
        int newCharValue;
        texto = texto.toUpperCase();
        StringBuilder encriptado = new StringBuilder();
        ArrayList<String> resultado = new ArrayList<>();

        for (int clave = 1; clave < alfabeto.length(); clave++) {
            for (int i = 0; i < texto.length(); i++) {
                //Devuelve el carácter asociado a la posición indice
                inputChar = texto.charAt(i);
                //Analiza la cadena y encuentra el primer índice que coincide con el valor deseado
                charValue = alfabeto.indexOf(inputChar);
                //formula
                newCharValue = (charValue + clave) % alfabeto.length();

                if (newCharValue < 0) {
                    newCharValue += alfabeto.length();
                }
                //Añade al final del StringBuilder
                encriptado.append(alfabeto.charAt(newCharValue));
            }
            resultado.add(encriptado.toString());
            encriptado.setLength(0);
        }
        return resultado;
    }
}
