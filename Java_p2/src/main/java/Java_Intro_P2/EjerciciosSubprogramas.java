
package Java_Intro_P2;

import java.util.Scanner;


public class EjerciciosSubprogramas {
    public static void main(String[] args) {
        Scanner readme = new Scanner (System.in);
        int opc;
        System.out.println("Ingrese n° de ejercicio de la guia: ");
        opc = readme.nextInt();
        switch (opc){
            case 1:
                int num1, num2, elecc;
                System.out.println("Ingrese 2 numeros para operar:");
                num1 = readme.nextInt();
                num2 = readme.nextInt();
                do {
                System.out.println("Ingrese operacion a realizar: 1.- Suma. 2.- Resta. 3.- Producto. 4.- Division. 5.- Salir.");
                elecc = readme.nextInt();
                switch (elecc){
                    case 1:
                        System.out.println("El resultado de la suma es: " + Suma(num1,num2));
                        break;
                    case 2:
                        System.out.println("El resultado de la resta es: " + Resta(num1,num2));
                        break;
                    case 3:
                        System.out.println("El resultado del producto es: " + Producto(num1,num2));
                        break;
                    case 4:
                        System.out.println("El resultado de la division es: " + Division(num1,num2));
                        break;
                    case 5:
                        System.out.println("Saliendo del programa..");
                        break;
                    default:
                        System.out.println("Opcion incorrecta.");
                }
                } while (elecc != 5);
                break;
            case 2:
                System.out.println("Paja de hacerla.");
                break;
            case 3:
                float euro;
                String moneda;
                System.out.print("Cantidad de Euros a convertir: ");
                euro = readme.nextFloat();
                System.out.print("A que moneda se convertira: ((D)ólares, (Y)enes o (L)ibras)");
                moneda = readme.next();
                convertidor (euro,moneda);
                break;
            case 4:
                int numero;
                System.out.println("Ingrese un numero para determinar si es primo: ");
                numero = readme.nextInt();
                if (EsPrimo(numero)){
                    System.out.println("Es primo.");
                } else {
                    System.out.println("No es primo.");
                }
                break;
            default:
                System.out.println("Saliendo de la guia.");
        }
    }
    
    // Funcion del Ej.4
    
    public static boolean EsPrimo (int num){
        boolean primo = false;
        for (int i = 2; i < num; i++) {
            if (num % i != 0){
                primo = true;
            } else {
                primo = false;
                break;
            }
        }
        return primo;
    }
    
    // Funcion del Ej.3
    
    public static void convertidor (float E, String M){
        switch (M.substring(1,1)){
            case "D":
            case "d":
                System.out.println("Al cambio actual, " + E + " euros son: " + (1.28611 * E) + " dólares estadounidenses.");
                break;
            case "Y":
            case "y":
                System.out.println("Al cambio actual, " + E + " euros son: " + (129.852 * E) + " yenes japoneses.");
                break;
            case "L":
            case "l":
                System.out.println("Al cambio actual, " + E + " euros son: " + (0.86 * E) + " libras esterlinas.");
                break;
            default:
                System.out.println("Moneda de cambio incorrecta.");
                break;            
        }
    }
    
    // Funciones del Ej.1
    
    public static int Suma (int n, int m){
        int resultado;
        resultado = n + m;
        return resultado;
    }
    public static int Resta (int n, int m){
        int resultado;
        resultado = n - m;
        return resultado;
    }
    public static long Producto (int n, int m){
        long resultado;
        resultado = n * m;
        return resultado;
    }
    public static float Division (int n, int m){
        float resultado;
        if (m != 0){
        resultado = ((float) n / m);
        } else {
            System.out.println("No se puede dividir por 0!!");
            resultado = 0;
        }
        return resultado;
    }
}
