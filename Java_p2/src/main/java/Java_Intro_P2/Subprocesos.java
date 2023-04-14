
package Java_Intro_P2;

import java.util.Scanner;

/*
 * Guia de Subprogramas
 */
public class Subprocesos {
    public static void main(String[] args) {
        Scanner readme = new Scanner (System.in);
        int opc;
        System.out.println("Ingrese un ejercicio de la guia: 11/12");
        opc = readme.nextInt();
        switch (opc){
            case 11:
                String frase, codificado;
                System.out.println("Ingrese una frase");
                frase = readme.nextLine();
                codificado = codificador(frase);
                System.out.println(codificado);
                break;
            case 12:
                int num1, num2;
                System.out.println("Ingrese dos numeros: ");
                num1 = readme.nextInt();
                num2 = readme.nextInt();
                EsMultiplo(num1,num2);
                break;
            default:
                System.out.println("Saliendo del programa");
                break;
        }
        
    }
    
    public static void EsMultiplo (int n, int m){
        if (n%m == 0){
            System.out.println(n + " es multiplo de " + m);
        } else {
            System.out.println(n + " no es multiplo de " + m);
        }
    }
    
    public static String codificador(String cadena){
    String ret = "";
        for (int i = 0; i < cadena.length()-1; i++) {
            switch (cadena.substring(i,i+1)){
                case "a":
                case "A":
                    ret = ret.concat("@");
                    break;
                case "e":
                case "E":
                    ret = ret.concat("#");
                    break;
                case "i":
                case "I":
                    ret = ret.concat("$");
                    break;
                case "o":
                case "O":
                    ret = ret.concat("%");
                    break;
                case "u":
                case "U":
                    ret = ret.concat("*");
                    break;
                default:
                    ret = ret.concat(cadena.substring(i,i+1));
                    break;  
            }
        }
        return ret;
    }
}




