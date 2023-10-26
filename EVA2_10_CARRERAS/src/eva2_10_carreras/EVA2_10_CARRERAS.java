/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_10_carreras;

import java.awt.BorderLayout;
import java.util.Scanner;

/**
 *
 * @author clitx
 */
public class EVA2_10_CARRERAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        String carrera , ISC, INF, LA, ARQ, IND, IDI, IGE;
        System.out.println("Introduce las siglas de tu carrera en mayusculas");
        carrera = input.nextLine();
        switch (carrera){
            case "ISC":
                System.out.println("ingenieria en sistmas computacionales");
                break;
            case "INF":
                System.out.println("ingenieria en informatica");
                break;
            case "LA":
                System.out.println("licenciatura en administracion");
                break;
            case "ARQ":
                System.out.println("arquitectura");
                break;
            case "IND":
                System.out.println("ingenieria industrial");
                break;
            case "IDI":
                System.out.println("ingenieria en diseño industrial");
                break;
            case "IGE":
                System.out.println("ingenieria en gestion de empresas");
                break;
            default :
                System.out.println("las siglas" + carrera+ "no son validas");
        }
                
            
    }
    
}
