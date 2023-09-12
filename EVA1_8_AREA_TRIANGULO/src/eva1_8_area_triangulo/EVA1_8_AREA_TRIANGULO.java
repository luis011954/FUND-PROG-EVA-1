/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_8_area_triangulo;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA1_8_AREA_TRIANGULO {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double area;
        double base;
        double altura;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Introduce la base del triangulo");
        base = input.nextDouble();
        System.out.println("Introduce la altura del triangulo");
        altura = input.nextDouble();
        area=(base*altura)/2;
        System.out.println("El area es: ");
        System.out.println(area);
        
    }
    
}
