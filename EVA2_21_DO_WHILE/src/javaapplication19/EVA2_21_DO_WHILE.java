/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication19;

import java.util.Scanner;

/**
 *
 * @author clitx
 */
public class EVA2_21_DO_WHILE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int valor;
        Scanner input = new Scanner (System.in);
        //ASEGURA AL MENOS UNA VEZ LA EJECUCION DE LAS
        //INSTRUCCIONES DENTRO DEL CICLO
        do{
            System.out.println("Introduce un valor");
            valor = input.nextInt();
        }while (valor != 100);
    }
    
}
