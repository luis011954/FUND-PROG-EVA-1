package eva2_2_if_2;

import java.util.Scanner;

/**
 *
 * @author clitx
 */
public class EVA2_2_IF_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        
        int valor1, valor2;
        
        System.out.println("Introduce el valor 1: ");
        valor1 = input.nextInt();
        System.out.println("Introduce el valor 2: ");
        valor2 = input.nextInt();
        
        if (valor1 > valor2){ //verdad, siempre es obligatorio
            System.out.println("El valor mas grande es: " +valor1);
        }else{ //cuando el resultado es falso
            if(valor1 == valor2){//VERDAD -->  AMBOS VALORES SON IGUALES
                System.out.println("Ambos valores son iguales");
            }else {
                System.out.println("El valor mas grande es: " +valor2);            }
            }
        }
    }
