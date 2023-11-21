/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_28_uso_arreglos;

import java.util.Scanner;

/**
 *
 * @author clitx
 */
public class EVA2_28_USO_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cant;
        int[] califas;//aqui el arreglo no existe
        Scanner input = new Scanner (System.in);
        System.out.println("Cuantas calificaciones quieres capturar? ");
        cant = input.nextInt();
        //ya sabemos cuantas califas necesitamos, creamos el arreglos
        califas = new int [cant];
        for (int i = 0; i < cant; i++) {
            System.out.println("Introduce la calificacion: ");
            califas[i] = input.nextInt();
        }
        for (int i = 0; i < cant; i++) {
            System.out.print("["+ califas[i] + "]");
        }
    }
    
}
