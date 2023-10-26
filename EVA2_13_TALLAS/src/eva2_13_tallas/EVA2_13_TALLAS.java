/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_13_tallas;

import java.util.Scanner;

/**
 *
 * @author clitx
 */
public class EVA2_13_TALLAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        int talla;
        System.out.println("escribe el numero de tu talla");
        talla = input.nextInt();
        
        switch (talla){
            case 29:
                System.out.println("Small");
                break;
            case 42:
                System.out.println("medium");
                break;
            case 44:
                System.out.println("large");
                break;
            case 48:
                System.out.println("xlarge");
                break;
            default :
                System.out.println("Talla no existente ");
                
        }
    }
    
}
