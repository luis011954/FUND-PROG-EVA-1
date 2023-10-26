/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_6_and_or_operadores;

import java.util.Scanner;

/**
 *
 * @author clitx
 */
public class EVA2_6_AND_OR_OPERADORES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        //TODO code application logic here
        //CAPTURA LA CALIFIACION
        
        int califa;
        System.out.println("Introduce la calificacion: ");
        califa = input.nextInt();
        
        //VAMOS A EVALUAR:
        if ((califa >= 0) && (califa <= 100)){
            System.out.println("La calificacion "+ califa +" es valida!!");
            if (califa >= 70){
                System.out.println("Acreditadas!!");
            }
        }else{
            System.out.println("La calificacion "+ califa + " NO es valida!!");
        }
        
        }
            
        
        
    }
    

