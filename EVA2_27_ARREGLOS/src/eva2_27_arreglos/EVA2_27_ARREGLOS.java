/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_27_arreglos;

/**
 *
 * @author clitx
 */
public class EVA2_27_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //declaramos un arreglo que almacena 10 enteros
        //acceso a los arreglos es aleatorio.
        //se accede a los valores através de un INDICE
        //Los valores almacenados tienen una dirección:
        //el primer elemento esta en la posición 0
        //el ultimo es la posicion N - 1, donde N es el tamaño
        //del arreglo
        int[] arregloEnteros = new int[10];
        //ACCEDER VALORES EN UN ARRELGO:
        arregloEnteros[0] = 100;
        arregloEnteros[1] = 200;
        arregloEnteros[2] = 300;
        arregloEnteros[3] = 400;
        arregloEnteros[4] = 500;
        arregloEnteros[5] = 600;
        arregloEnteros[6] = 700;
        arregloEnteros[7] = 800;
        arregloEnteros[8] = 900;
        arregloEnteros[9] = 1000;
        
        System.out.println("Valores en posicion 0: " + arregloEnteros[0]);
        
        String[] arregloCade = new String[5];
        arregloCade[0] = "Hola";
        arregloCade[1] = "";
        arregloCade[2] = "Mundo";
        arregloCade[3] = "";
        arregloCade[4] = "Cruel!!!";
        
    }
    
}
