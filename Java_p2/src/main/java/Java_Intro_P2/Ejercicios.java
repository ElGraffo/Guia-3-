
package Java_Intro_P2;

import java.util.Scanner;


public class Ejercicios {
    
    public static void main(String[] args) {
        Scanner readme = new Scanner(System.in);
        int ejercicio, num, num2, opc = 0, max, acum = 0, acuminc = 0;
        var respuesta = "N";
        String frase;        
        do {
            System.out.println("Elija el ejercicio de la Guia: ");
            ejercicio = readme.nextInt();
        switch (ejercicio) {
            case 1:
                System.out.println("Ingrese un numero para determinar si es par o impar");
                num = readme.nextInt();
                if (num % 2 == 0) {
                    System.out.println("El numero es par");
                } else {
                    System.out.println("El numero es impar");
                }
                System.out.println("Desea continuar? S/N");
                respuesta = readme.next();
                break;
            case 2:
                System.out.println("Ingrese una frase");
                frase = readme.next();
                if (frase.equalsIgnoreCase("eureka")){
                    System.out.println("Correcto");
                } else {
                    System.out.println("Incorrecto");
                }
                System.out.println("Desea continuar? S/N");
                respuesta = readme.next();
                break;
            case 3:
                System.out.println("Ingrese una palabra o frase de 8 digitos");
                frase = readme.next();
                if (frase.length() == 8){
                    System.out.println("Correcto");
                } else {
                    System.out.println("Incorrecto");
                }
                System.out.println("Desea continuar? S/N");
                respuesta = readme.next();
                break;
            case 4:
                System.out.println("Ingrese una palabra o frase");
                frase = readme.next();
                if ("A".equalsIgnoreCase(frase.substring(0, 1))){
                    System.out.println("Correcto");
                } else {
                    System.out.println("Incorrecto");
                }
                System.out.println("Desea continuar? S/N");
                respuesta = readme.next();
                break;
            case 5:
                System.out.println("Ingrese un valor maximo limite positivo");
                max = readme.nextInt();
                do {
                    System.out.println("Ingrese un numero a sumarse");
                    num = readme.nextInt();
                    acum = acum + num;
                } while (acum < max);
                System.out.println("Desea continuar? S/N");
                respuesta = readme.next();
                break;
            case 6:
                System.out.println("Ingrese 2 numeros enteros positivos");
                num = readme.nextInt();
                num2 = readme.nextInt();
                do {
                    System.out.println("MENU");
                    System.out.println("1. Sumar");
                    System.out.println("2. Restar");
                    System.out.println("3. Multiplicar");
                    System.out.println("4. Dividir");
                    System.out.println("5. Salir");
                    System.out.print("Elija Opcion: ");
                    opc = readme.nextInt();
                    switch (opc){
                        case 1 -> {
                            System.out.println("La suma de los 2 numeros es: " + (num + num2));
                            continue;
                    }
                        case 2 -> {
                            System.out.println("La resta de los 2 numeros es: " + (num - num2));
                            continue;
                    }
                        case 3 -> {
                            System.out.println("El producto de los 2 numeros es: " + (num * num2));
                            continue;
                    }
                        case 4 -> {
                            System.out.println("El cociente de los 2 numeros es: " + (num / num2));
                            continue;
                    }
                        case 5 -> {
                            System.out.println("Esta seguro que desea salir del programa? S/N");
                            respuesta = readme.next();
                        if (respuesta.equalsIgnoreCase("S")) {
                        } else {
                            continue;
                        }
                    }
                        default -> System.out.println("Opcion incorrecta");
                    }
                } while (opc != 5);
                System.out.println("Desea continuar? S/N");
                respuesta = readme.next();
                break;
            case 7:
                System.out.println("Bienvenido al dispositivo RS232");
                do {
                System.out.println("Ingrese codigos");
                frase = readme.next();
                if (frase.length() <= 5 && !frase.equals("&&&&&")){
                    if ("X".equalsIgnoreCase(frase.substring(0,1)) && "O".equalsIgnoreCase(frase.substring((frase.length()-1), frase.length()))){
                        acum++;
                    } else {
                        acuminc++;
                    }
                } else if (frase.length() > 5) {
                    acuminc++;
                }
                } while (!frase.equals("&&&&&"));
                System.out.println("Informe de codigos: ");
                System.out.println("Correctos: " + acum);
                System.out.println("Incorrectos: " + acuminc);
                System.out.println("");
                System.out.println("Desea continuar? S/N");
                respuesta = readme.next();
                break;
            case 8:
                System.out.println("Ingrese N");
                num = readme.nextInt();
                for (int i = 0; i < num; i++){
                    System.out.print("*");
                }
                System.out.println("");
                for (int j = 1; j < num-1; j++){
                for (int i = 0; i < num; i++){
                    if (i == 0 || i == num-1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                    System.out.println("");
                }
                for (int i = 0; i < num; i++){
                    System.out.print("*");
                }
                System.out.println("");
                System.out.println("Desea continuar? S/N");
                respuesta = readme.next();
                break;
            default:
                System.out.println("Ingrese otra opción");
                respuesta = "S";
                break;
            }
        } while (respuesta.equalsIgnoreCase("S"));
    }
}
