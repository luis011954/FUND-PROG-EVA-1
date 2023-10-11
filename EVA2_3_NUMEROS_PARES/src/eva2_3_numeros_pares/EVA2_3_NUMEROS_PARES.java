/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_3_numeros_pares;

import java.util.Scanner;

/**
 *
 * @author clitx
 */
public class EVA2_3_NUMEROS_PARES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        
        int valor;
        int residuo;
        
        System.out.println("Introduce el valor: ");
        valor = input.nextInt();
        
        residuo = valor % 2;
        
        if(residuo == 0)
            System.out.println("El numero es par");
        else{
            System.out.println("El numero es inpar");
        }
        
        
        
    }
    
}
