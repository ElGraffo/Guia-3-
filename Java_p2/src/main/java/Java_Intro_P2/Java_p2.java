
package Java_Intro_P2;

import java.util.Scanner;



public class Java_p2 {

    public static void main(String[] args) {
        Scanner readme = new Scanner(System.in);
        var respuesta = "N";
        int num;
        do {
        System.out.println("Escribir un numero del 0 al 20");
        num = readme.nextInt();
            
            if (num > 20 || num < 0) {
                System.out.println("Numero ingresado fuera de rango");
            } else {
                System.out.print(num + " ");
                for (int i = 0; i < num; i++){
                    System.out.print("*");                       
                }
                System.out.println("");
            }
            System.out.println("Desea continuar? S/N");
            respuesta = readme.next();
        } while (respuesta.equalsIgnoreCase("S"));
    }
}
