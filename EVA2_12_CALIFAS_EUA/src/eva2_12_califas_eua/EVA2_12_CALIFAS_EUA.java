/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_12_califas_eua;

import java.util.Scanner;

/**
 *
 * @author clitx
 */
public class EVA2_12_CALIFAS_EUA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        int califa;
        System.out.println("Introduce la calificacion");
        califa = input.nextInt();
        
        if ((califa >= 90) && (califa <= 100))
            System.out.println("sacaste una A");
            
            else if ((califa >= 80) && (califa <= 89))
                System.out.println("sacaste una B");
            
            else if ((califa >= 70) && (califa <=79))
                System.out.println("sacaste una C");
            
            else if ((califa >= 60) && (califa <= 69))
                System.out.println("sacaste una D");
        
            else if (califa < 60)
                System.out.println("sacaste una F");
        }
    }
