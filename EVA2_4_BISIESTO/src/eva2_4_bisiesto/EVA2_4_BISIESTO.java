/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_4_bisiesto;

import java.util.Scanner;

/**
 *
 * @author clitx
 */
public class EVA2_4_BISIESTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int year;
        int residuo;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Introduce el año a evaluar: ");
        year = input.nextInt();
        residuo = year % 4;
        
        if (residuo == 0) {
            residuo = year % 100;
            if (residuo == 0){
                residuo = year % 400;
                if (residuo == 0) {
                    System.out.println("Es bisiesto");
                } else {
                    System.out.println("No es bisiesto");
                }
            } else {
                System.out.println("Es bisiesto");
            }
        }else {
            System.out.println("No es año bisiesto");
        }
        
    }
    
}
