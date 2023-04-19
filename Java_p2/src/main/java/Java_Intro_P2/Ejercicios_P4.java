package Java_Intro_P2;

import java.util.Scanner;

public class Ejercicios_P4 {
    public static void main(String[] args) {
        Scanner readme = new Scanner (System.in);
        int opc;
        var respuesta = "N";
        do {
            System.out.println("Ingrese n° de ejercicio de la guia: ");
            opc = readme.nextInt();
            switch (opc){
                case 1:                                                         //Realizar un algoritmo que llene un vector con los 100 primeros números
                    int[] nument = new int [100];                               //enteros y los muestre por pantalla en orden descendente.
                    for (int i = 0; i < 100; i++) {
                        nument[i] = i+1;
                    }
                    System.out.print("[");
                    for (int i = 99; i > 0 ; i--) {
                        System.out.print(nument[i] + ";");
                    }
                    System.out.print(nument[0] + "]");
                    System.out.println("");
                    System.out.println("Desea salir? S/N");
                    respuesta = readme.next();
                    break;
                case 2:                                                         //Realizar un algoritmo que llene un vector de tamaño N con valores
                    int Nval, NaBuscar, contrepe=0;                             //aleatorios y le pida al usuario un número a buscar en el vector. El 
                    System.out.println("Ingrese cantidad de valores: ");      //programa mostrará dónde se encuentra el numero y si se encuentra 
                    Nval = readme.nextInt();                                    //repetido
                    int[] vectaleat = new int [Nval];
                    for (int i = 0; i < vectaleat.length-1; i++) {
                        vectaleat[i] = (int) (Math.random()*Nval);
                    }
                    System.out.println("Ingrese un numero a buscar: ");
                    NaBuscar = readme.nextInt();
                    for (int i = 0; i < vectaleat.length-1; i++) {
                        if (vectaleat[i] == NaBuscar) {
                            contrepe++;
                            System.out.println("El numero se encuentra en la posición " + i + " del vector.");
                        }
                    }
                    if (contrepe > 1){
                        System.out.println("El numero esta repetido " + contrepe + " veces.");
                    } else if (contrepe == 0){
                        System.out.println("El numero no se encuentra en el vector.");
                        System.out.print("El vector es: [");
                        for (int i = 0; i < vectaleat.length-1; i++) {
                            System.out.print(vectaleat[i] + ";");
                        }
                        System.out.print(vectaleat[vectaleat.length-1] + "]");
                    }
                    System.out.println("Desea salir? S/N");
                    respuesta = readme.next();
                    break;
                case 3:                                                                     //Recorrer un vector de N enteros contabilizando cuántos números son de
                    int Ncant,unDig=0,dosDig=0,tresDig=0,cuatroDig=0,cincoDig=0;            //1 dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
                    float rndPow;                                                           
                    System.out.println("Ingrese cantidad de numeros para el vector");
                    Ncant = readme.nextInt();
                    int[] vectrandom = new int [Ncant];
                    for (int i = 0; i < vectrandom.length; i++) {
                        rndPow = ((float) Math.floor(Math.random()*5 + 1));
                        vectrandom[i] = (int) (Math.random()*(Math.pow(10, rndPow)));
                    }
                    for (int i = 0; i < vectrandom.length; i++) {
                        if (vectrandom[i] / 10000 > 0){
                            cincoDig++;
                        } else if (vectrandom[i] / 1000 > 0){
                            cuatroDig++;
                        } else if (vectrandom[i] / 100 > 0){
                            tresDig++;
                        } else if (vectrandom[i] / 10 > 0){
                            dosDig++;
                        } else {
                            unDig++;
                        }
                    }
                    System.out.println("Hay " + unDig + " numeros de 1 digito, " + dosDig + " de 2 digitos, " + tresDig + " de 3 digitos, " + cuatroDig + " de 4 digitos y " + cincoDig + " de 5.");
                    for (int i = 0; i < vectrandom.length; i++) {
                        System.out.print(vectrandom[i] + " ");
                    }
                    System.out.println("");
                    System.out.println("Desea salir? S/N");
                    respuesta = readme.next();
                    break; 
                case 4:
                    int [][] matr = new int [4][4];                             //Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios
                    int [][] tras = new int [4][4];                             //y muestre la traspuesta de la matriz. La matriz traspuesta de una matriz A
                    for (int i = 0; i < 4; i++) {                               //se denota por B y se obtiene cambiando sus filas por columnas (o viceversa).
                        for (int j = 0; j < 4; j++) {
                            matr[i][j] = (int) (Math.random()*10);
                            tras[j][i] = matr[i][j];
                        }
                    }
                    System.out.println("Matriz original: ");
                    for (int i = 0; i < 4; i++) {
                        for (int j = 0; j < 4; j++) {
                            System.out.print(matr[i][j] + " ");
                        }
                        System.out.println("");
                    }
                    System.out.println("-------");
                    System.out.println("Traspuesta: ");
                    for (int i = 0; i < 4; i++) {
                        for (int j = 0; j < 4; j++) {
                            System.out.print(tras[i][j] + " ");
                        }
                        System.out.println("");
                    }
                    System.out.println("Desea salir? S/N");
                    respuesta = readme.next();
                    break;
                case 5:                                                         //Realice un programa que compruebe si una matriz dada es antisimétrica. 
                    boolean esanti = true;                                      //Se dice que una matriz A es antisimétrica cuando ésta es igual a su 
                    int [][] matrA = new int [3][3];                            //propia traspuesta, pero cambiada de signo. Es decir, A es antisimétrica si 
                    int [][] matrAT= new int [3][3];                            //A = -AT. La matriz traspuesta de una matriz A se denota por AT y se 
                    System.out.println("Vamos a llenar las matrices");        //obtiene cambiando sus filas por columnas (o viceversa).
                    System.out.println("Matriz A");
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                            System.out.print("Ingrese dato para la posición " + i + ";" + j + ": ");
                            matrA[i][j] = readme.nextInt();
                        }                        
                    }
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                            matrAT[i][j] = matrA[j][i];
                        }                        
                    }
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                            if (matrA[i][j] != -matrAT[i][j]){
                                esanti = false;
                            }
                        }
                    }
                    if (esanti){
                        System.out.println("Las matrices son antisimetricas.");
                    } else {
                        System.out.println("Las matrices NO son antisimetricas.");
                    }
                    System.out.println("Desea salir? S/N");
                    respuesta = readme.next();
                    break;
                case 6:
                    boolean esmag = true;
                    int [][] mag = new int [3][3];
                    int suma=0;
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                            System.out.println("Ingrese dato para la posición (" + i + ";" +j+ "): ");
                            mag[i][j] = readme.nextInt();
                        }
                    }
                    for (int i = 0; i < 3; i++) {
                        suma+=mag[i][i];
                    }
                    for (int i = 0; i < 3; i++) {
                        if (suma!=mag[i][0]+mag[i][1]+mag[i][2]){
                            esmag=false;
                        }
                        if (suma!=mag[0][i]+mag[1][i]+mag[2][i]){
                            esmag=false;
                        }
                    }
                    if (suma!=mag[2][0]+mag[1][1]+mag[0][2]){
                            esmag=false;
                    }
                    for (int i = 0; i < 3; i++) {
                        System.out.print("| ");
                        for (int j = 0; j < 3; j++) {
                            System.out.print(mag[i][j]+" ");
                        }
                        System.out.println("|");
                    }
                    if (esmag){
                        System.out.println("Es magico");
                    } else {
                        System.out.println("No es magico");
                    }
                    System.out.println("Desea salir? S/N");
                    respuesta = readme.next();
                    break;
                default:
                    System.out.println("Desea salir? S/N");
                    respuesta = readme.next();
                    break;
            }
        } while (respuesta.equalsIgnoreCase("N"));
    }    
}
