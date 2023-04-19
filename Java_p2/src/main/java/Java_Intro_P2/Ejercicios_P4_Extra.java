package Java_Intro_P2;

import java.util.Objects;
import java.util.Scanner;



public class Ejercicios_P4_Extra {
    public static void main(String[] args) {
        Scanner readme = new Scanner(System.in);
        int opc;
        var respuesta = "N";
        do {
            System.out.println("Ingrese n° de ejercicio de la guia: ");
            opc = readme.nextInt();
            switch (opc){
                case 1:
                    int suma=0;
                    int tama;
                    System.out.println("Ingrese cantidad de numeros para el vector: ");
                    tama = readme.nextInt();
                    Integer[] vectorN = new Integer[tama];
                    for (int i = 0; i < vectorN.length; i++) {
                        System.out.println("Ingrese el " + (i+1) + "° elemento del vector");
                        vectorN[i]= readme.nextInt();
                        suma += vectorN[i];
                    }
                    imprimeVector(vectorN);
                    System.out.println("La suma de los elementos es: " + suma);
                    System.out.println("Desea salir? S/N");
                    respuesta = readme.next();
                    break;
                case 2:
                    int ent;
                    System.out.println("Ingrese cantidad de elementos para los vectores: ");
                    ent = readme.nextInt();
                    Integer[] vect1 = new Integer[ent];
                    Integer[] vect2 = new Integer[ent];
                    vect1 = rellenaVect(vect1);
                    vect2 = rellenaVect(vect2);
                    imprimeVector(vect1);
                    imprimeVector(vect2);
                    igualaVectores(vect1,vect2);
                    System.out.println("Desea salir? S/N");
                    respuesta = readme.next();
                    break;
                case 3:
                    int Nent;
                    System.out.println("Ingrese cantidad de numeros para el vector: ");
                    Nent = readme.nextInt();
                    Integer[] vect = new Integer [Nent];
                    vect = rellenaVect(vect);
                    imprimeVector(vect);
                    System.out.println("Desea salir? S/N");
                    respuesta = readme.next();
                    break;
                case 4:
                    Double[][] Alumnos = new Double [10][6];
                    int aprob = 0, desaprob = 0;
                    for (int i = 0; i < 10; i++) {
                        Alumnos[i][0] = (double) i+1;
                        System.out.print("Ingrese notas en orden. Primer trabajo practico, Segundo trabajo practico, Primer integrador y Segundo integrador, del " + (i+1) + "° alumno: ");
                        Alumnos[i][1] = readme.nextDouble();
                        Alumnos[i][2] = readme.nextDouble();
                        Alumnos[i][3] = readme.nextDouble();
                        Alumnos[i][4] = readme.nextDouble();
                        Alumnos[i][5] = Alumnos[i][2]*0.1 + Alumnos[i][3]*0.15 + Alumnos[i][4]*0.25 + Alumnos[i][4]*0.5;
                    }
                    imprimeMatriz(Alumnos);
                    for (int i = 0; i < 10; i++) {
                        if (Alumnos[i][5]>=7){
                            aprob++;
                        } else {
                            desaprob++;
                        }                        
                    }
                    System.out.println("Aprobaron: " + aprob + " y Desaprobaron: " + desaprob);
                    System.out.println("Desea salir? S/N");
                    respuesta = readme.next();
                    break;
                case 5:
                    int Nmatriz,Mmatriz,sumatotal=0;
                    System.out.println("Tamaño de matriz NxM: ");
                    System.out.print("Filas: ");
                    Nmatriz = readme.nextInt();
                    System.out.print("Columnas: ");
                    Mmatriz = readme.nextInt();
                    Integer[][] MatrizA = new Integer [Nmatriz][Mmatriz];
                    for (int i = 0; i < Nmatriz; i++) {
                        for (int j = 0; j < Mmatriz; j++) {
                            MatrizA[i][j]=(int)Math.floor(Math.random()*10);
                            sumatotal+=MatrizA[i][j];
                        }
                    }
                    imprimeMatriz(MatrizA);
                    System.out.println("La suma total de los elementos de la matriz es: " + sumatotal);
                    System.out.println("Desea salir? S/N");
                    respuesta = readme.next();
                    break;
                case 6:
                    String[][] sopa = new String[20][20];
                    boolean sale = true;
                    String palabras = "N";
                    System.out.println("Sopa de letras...");
                    sopa = espacioSopa(sopa);
                    for (int i = 0; i < 5; i++) {
                        do{
                            System.out.println("Ingrese una palabra de 3 a 5 letras: ");
                            palabras = readme.next();
                            if (palabras.length()>2 && palabras.length()<6){
                                break;
                            } else {
                                System.out.println("La palabra debe tener entre 3 y 5 caracteres.");
                            }
                        } while(sale);
                        sopa = rellenaSopa(sopa,palabras);
                    }
                    imprimeMatriz(sopa);
                    /*for (String[] sopa1 : sopa) {
                        for (int j = 0; j < sopa.length; j++) {
                            System.out.print(sopa1[j] + " ");
                        }
                        System.out.println("");
                    }*/
                    System.out.println("Desea salir? S/N");
                    respuesta = readme.next();
                    break;
                case 7:
                    int nprim;
                    System.out.println("Ingrese N");
                    nprim = readme.nextInt();
                    int[] vecFibo = new int[nprim];
                    vecFibo = RellenaFibo(vecFibo);
                    System.out.print("[ ");
                    for (int i = 0; i < vecFibo.length; i++) {
                        System.out.print(vecFibo[i] + " ");
                    }
                    System.out.println("]");
                    System.out.println("Desea salir? S/N");
                    respuesta = readme.next();
                    break;
            }                
        } while (!respuesta.equalsIgnoreCase("S"));
    }
    
    //Funciones del Ej.2 y 3
    public static void igualaVectores(Integer[] vector1, Integer[] vector2){
        boolean iguales=true;
        for (int i = 0; i < vector1.length; i++) {
            if (!Objects.equals(vector1[i], vector2[i])){
                iguales=false;
                break;
            }
        }
        if (iguales){
            System.out.println("Los vectores son iguales.");
        } else {
            System.out.println("Los vectores NO son iguales.");
        }
    }
    
    public static Integer[] rellenaVect (Integer[] vector){
        for (int i = 0; i < vector.length; i++) {
            vector[i]=(int) Math.floor(Math.random()*10);
        }
        return vector;
    }
    
    //Funciones del Ej.6
    public static String [][] espacioSopa (String[][] M){
        for (String[] M1 : M) {
            for (int j = 0; j < M.length; j++) {
                if (!"".equals(M1[j])) {
                    M1[j] = String.valueOf((int) (Math.random()*10));
                }
            }
        }
        return M;
    }
    
    public static String [][] rellenaSopa (String[][] M, String p){
        int fila,columna,largo=0;
        fila = (int) Math.floor(Math.random()*20);
        columna = (int) Math.floor(Math.random()*15);
        if (p.length()+columna<20){
        if (!"".equals(M[fila][columna])){
            for (int i = columna; i < columna+p.length(); i++) {
                M[fila][i]=p.substring(largo,largo+1);
                largo++;
            }
        }
        } else {
           if (!"".equals(M[fila][columna-5])){
                for (int i = columna-5; i < columna+p.length()-5; i++) {
                    M[fila][i]=p.substring(largo,largo+1);
                    largo++;
                }
            } 
        }
        return M;
    }
    
    //Funciones del Ej.7
    public static int [] RellenaFibo (int[] v){
        for (int i = 0; i < v.length; i++) {
            v[i]=Fibonacci(i);
        }
        return v;
    }
    
    public static int Fibonacci (int N){
        if (N==0 || N==1){
            return 1;
        }
        return Fibonacci(N-2) + Fibonacci(N-1);
    }
    
    //Func extra
    public static <E> void imprimeVector(E[] Vector){
        System.out.print("[ ");
        for (E elemento : Vector) {
            System.out.print(elemento + " ");
        }
        System.out.println("]");
    }
    
    public static <E> void imprimeMatriz(E[][] Matriz){
        for(E[] element : Matriz){
            System.out.print("| ");
            for(E elemento : element){
                System.out.print(elemento + " ");
            }
            System.out.println("|");
        }
    }
}
