/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_20_while_retiros;

import java.util.Scanner;

/**
 *
 * @author clitx
 */
public class EVA2_20_WHILE_RETIROS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int canti = 1000;
        Scanner input = new Scanner (System.in);
        
        while (canti > 0){ //MIENTRAS HAYA SALDO, SE PUEDE RETIRAR
            System.out.println("¿CUANTO DESEAS RETIRAR?");
            int retiro = input.nextInt();
            //ACUMULADOR
            //canti = canti - retiro;
            canti-=retiro;
            System.out.println("TE QUEDAN " + canti + " DE SALDO");
            
        }
    }
    
}
