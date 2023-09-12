/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_5_entrada_salida;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA1_5_ENTRADA_SALIDA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //1. DECLARACION DE VARIABLES
        String nombre;
        String apellidos;
        int semestre;
        Scanner input = new Scanner(System.in);
        //; fin de instrucion en Java
        //2. CAPTURA DE VARIABLES
        System.out.println("Introduce tu nombre:");
        nombre = input.nextLine();
        System.out.println("Introduce tu apellido:");
        apellidos = input.nextLine();
        System.out.println("Introduce el semestre");
        semestre = input.nextInt();
        //Java es sencible a máyusculas y minúsculas
        //es decir: es figerente System que system
        //3. MOSTRAR LOS DATOS CAPTURADOS
        System.out.println(nombre);
        System.out.println(apellidos);
        System.out.println(semestre);
        
    }

}
