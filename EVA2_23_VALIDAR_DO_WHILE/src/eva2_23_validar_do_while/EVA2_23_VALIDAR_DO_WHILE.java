/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_23_validar_do_while;

import java.util.Scanner;

/**
 *
 * @author clitx
 */
public class EVA2_23_VALIDAR_DO_WHILE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int valor;
        String cade;
        Scanner input = new Scanner (System.in);
        do{
            System.out.println("Introduce el valor entero: ");
            valor = input.nextInt();
        }while(true);
    }
    
}
