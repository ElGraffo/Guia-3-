
package Java_Intro_P2;

import java.math.BigInteger;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;


public class Ejercicios_Extra {
    public static void main(String[] args) throws InterruptedException {
        Scanner readme = new Scanner(System.in);
        int ejerc;
        var respuesta = "N";
        
        do {
            System.out.println("Ingrese ejercicio de la guia (15 para Salir): ");
            ejerc = readme.nextInt();
            switch (ejerc){
                case 1: 
                    long min, minfin = 0, horas = 0, dias = 0;                  /*Dado un tiempo en minutos, calcular su equivalente en días y horas.*/
                    System.out.println("Ingrese cantidad de minutos");        /*Por ejemplo, si el usuario ingresa 1600 minutos,*/
                    min = readme.nextLong();                                    /*el sistema debe calcular su equivalente: 1 día, 2 horas. */
                    if (min > 60){
                        horas = min / 60;
                        minfin = min - (horas * 60);
                    } else {
                        minfin = min;
                    }
                    if (horas > 23){
                        dias = horas / 24;
                        horas = horas - (dias * 24);
                    }
                    if (horas > 0){
                        if (dias > 0){
                            System.out.println("Ese tiempo es equivalente a: " + dias + " día/s, " + horas + " hora/s y " + minfin + " minuto/s.");
                        } else {
                            System.out.println("Ese tiempo es equivalente a: " + horas + " hora/s " + minfin + " minuto/s.");
                        }
                    } else {
                        System.out.println("Ese tiempo es equivalente a: " + minfin + " minuto/s.");
                    }
                    System.out.println("Desea salir? S/N");
                    respuesta = readme.next();
                    break;
                case 2:
                    int A = 5,B = 4,C = 9,D = 2,aux;                                        /*Declarar cuatro variables de tipo entero A, B, C y D y asignarle un*/
                    System.out.println("Los valores iniciales son: ");                    /*valor diferente a cada una. A continuación, realizar las instrucciones*/
                    System.out.println("A: " + A + " B: " + B + " C: " + C + " D: " + D);   /*necesarias para que: B tome el valor de C, C tome el valor de A, A tome*/
                    System.out.println("Intercambiando... ");                             /*el valor de D y D tome el valor de B. Mostrar los valores iniciales y*/
                    TimeUnit.SECONDS.sleep(1);                                        /*los valores finales de cada variable. Utilizar sólo una variable auxiliar.*/
                    aux = B;
                    B = C;
                    C = A;
                    A = D;
                    D = aux;
                    System.out.println("Intercambiados: ");
                    System.out.println("A: " + A + " B: " + B + " C: " + C + " D: " + D);
                    System.out.println("Desea salir? S/N");
                    respuesta = readme.next();
                    break;
                case 3:
                    var letra = "";                                             /*Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si*/
                    System.out.println("Ingrese una letra");                  /*se trata de una vocal. Caso contrario mostrar un mensaje. Nota:*/
                        letra = readme.next();                                  /*investigar la función equals() de la clase String.*/
                    letra = letra.toLowerCase();
                    switch (letra){
                        case "a":
                        case "e":
                        case "i":
                        case "o":
                        case "u":
                            System.out.println("Es una vocal");
                            break;
                        default:
                            System.out.println("No es una vocal");
                            break;
                    }
                    System.out.println("Desea salir? S/N");
                    respuesta = readme.next();
                    break;
                case 4:
                    int num;                                                    /*Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10*/
                    System.out.println("Ingrese un numero");                  /*y se muestre su equivalente en romano.*/
                    num = readme.nextInt();
                    switch (num){
                        case 1:
                            System.out.println("El numero es: 'I'");
                            break;
                        case 2:
                            System.out.println("El numero es: 'II'");
                            break;
                        case 3:
                            System.out.println("El numero es: 'III'");
                            break;
                        case 4:
                            System.out.println("El numero es: 'IV'");
                            break;
                        case 5:
                            System.out.println("El numero es: 'V'");
                            break;
                        case 6:
                            System.out.println("El numero es: 'VI'");
                            break;
                        case 7:
                            System.out.println("El numero es: 'VII'");
                            break;
                        case 8:
                            System.out.println("El numero es: 'VIII'");
                            break;
                        case 9:
                            System.out.println("El numero es: 'IX'");
                            break;
                        case 10:
                            System.out.println("El numero es: 'X'");
                            break;
                        default:
                            System.out.println("Numero fuera de rango");
                            break;
                    }
                    System.out.println("Desea salir? S/N");
                    respuesta = readme.next();
                    break;
                case 5:
                    var socio = "";                                                     /*Una obra social tiene tres clases de socios:*/
                    double costo, pago;                                                 /*Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50%*/
                    System.out.println("Ingrese tipo de socio (A/B/C): ");            /*de descuento en todos los tipos de tratamientos.*/
                    socio = readme.next();                                              /*Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35%*/
                    System.out.println("Ingrese costo de tratamiento en pesos: ");    /*de descuento para los mismos tratamientos que los socios del tipo A.*/
                    costo = readme.nextDouble();                                        /*Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos tratamientos.*/
                    socio = socio.toUpperCase();                                        /*Solicite una letra (carácter) que representa la clase de un socio, y luego un valor real que */
                    switch (socio) {                                                    /*represente el costo del tratamiento (previo al descuento) y determine el importe en efectivo a pagar por dicho socio.*/
                        case "A":
                            pago = costo * 0.5;
                            System.out.println("El valor a abonar por el tratamiento es: $ " + pago);
                            break;
                        case "B":
                            pago = costo * 0.35;
                            System.out.println("El valor a abonar por el tratamiento es: $ " + pago);
                            break;
                        case "C":
                            pago = costo;
                            System.out.println("El valor a abonar por el tratamiento es: $ " + pago);
                            break;
                        default:
                            System.out.println("Fuera de rango");
                            break;
                    }        
                    System.out.println("Desea salir? S/N");
                    respuesta = readme.next();
                    break;
                case 6:
                    float altura, acump = 0, acumg = 0;                         /*Leer la altura de N personas y determinar el promedio*/
                    int acumpeques = 0, acumgral = 0;                           /*de estaturas que se encuentran por debajo de 1.60 mts.*/
                    var salida = "";                                            /*y el promedio de estaturas en general.*/
                    do {
                        System.out.println("Ingrese altura: ");
                        altura = readme.nextFloat();
                        if (altura > 1.60){
                            acumpeques++;
                            acump = acump + altura;
                        }
                        acumgral++;
                        acumg = acumg + altura;
                        System.out.println("Finalizar ingresos? S/N");
                        salida = readme.next();
                    } while (!"S".equalsIgnoreCase(salida));
                    System.out.println("El promedio de estaturas debajo de 1.60 es : " + (acump / acumpeques));
                    System.out.println("El promedio de estaturas general es: " + (acumg / acumgral));
                    System.out.println("Desea salir? S/N");
                    respuesta = readme.next();
                    break;
                case 7:
                    int mientras, numero, acumnum =0;                               /*Realice un programa que calcule y visualice el valor máximo,*/
                    int cantidad, minimo, maximo, cant;                             /*el valor mínimo y el promedio de n números (n>0). El valor*/
                    System.out.println("1.- While.");                             /*de n se solicitará al principio del programa y los números serán*/
                    System.out.println("2.- do While.");                          /*introducidos por el usuario. Realice dos versiones del programa,*/
                    mientras = readme.nextInt();                                    /*una usando el bucle “while” y otra con el bucle “do - while”.*/
                    System.out.println("Cantidad de numeros a registrar: ");
                    cantidad = readme.nextInt();                                    
                    if (mientras == 1){
                        cant = 1;
                        System.out.println("Ingrese el " + cant + "° numero: ");
                        numero = readme.nextInt();
                        minimo = numero;
                        maximo = numero;
                        acumnum = acumnum + numero;
                        while (cant != cantidad){
                            cant++;
                            System.out.println("Ingrese el " + cant + "° numero: ");
                            numero = readme.nextInt();
                            if (numero < minimo){
                                minimo = numero;
                            }
                            if (numero > maximo){
                                maximo = numero;
                            }
                            acumnum = acumnum + numero;
                        }
                        System.out.println("El maximo es: " + maximo + ", el minimo es: " + minimo + ", y el promedio es: " + (acumnum / cantidad));
                    } else if (mientras == 2){
                        cant = 1;
                        System.out.println("Ingrese el " + cant + "° numero: ");
                        numero = readme.nextInt();
                        minimo = numero;
                        maximo = numero;
                        acumnum = acumnum + numero;
                        do {
                            cant++;
                            System.out.println("Ingrese el " + cant + "° numero: ");
                            numero = readme.nextInt();
                            if (numero < minimo){
                                minimo = numero;
                            }
                            if (numero > maximo){
                                maximo = numero;
                            }
                            acumnum = acumnum + numero;
                        } while (cant != cantidad);
                        System.out.println("El maximo es: " + maximo + ", el minimo es: " + minimo + ", y el promedio es: " + (acumnum / cantidad));
                    } else {
                        System.out.println("Valor incorrecto.");
                    }
                    System.out.println("Desea salir? S/N");
                    respuesta = readme.next();
                    break;
                case 8:
                    int acumn = 0, acumpar = 0, acumimpar = 0, x;               //Escriba un programa que lea números enteros. Si el número
                    boolean valida = true;                                      //es múltiplo de cinco debe detener la lectura y mostrar 
                    do {                                                        //la cantidad de números leídos, la cantidad de números pares
                    System.out.println("Escriba un numero: ");                //y la cantidad de números impares. Al igual que en el 
                    x = readme.nextInt();                                       //ejercicio anterior los números negativos no deben sumarse. 
                    if (x >= 0){                                                //Nota: recordar el uso de la sentencia break.
                        if (x % 5 != 0){
                            if (x % 2 == 0){
                                acumpar++;
                            } else {
                                acumimpar++;
                            }
                             acumn++;
                            } else {
                            break;
                        }                      
                    } else {
                        System.out.println("Es un numero negativo. No se cuenta.");
                    }
                    } while (valida);
                    System.out.println("La cantidad de numeros ingresados es: " + acumn + ", " + acumpar + " son pares y " + acumimpar + " son impares.");
                    System.out.println("Desea salir? S/N");
                    respuesta = readme.next();
                    break;
                case 9:
                    int dividendo, divisor, cociente = 0, residuo;              // Division con restas.
                    do {
                    System.out.println("Escriba dos numeros mayores a 1");
                    dividendo = readme.nextInt();
                    divisor = readme.nextInt();
                    if (dividendo <=1 || divisor <=1){
                        System.out.println("Me escribiste numeros menores a 1, salame");
                    }
                    } while (dividendo <= 1 || divisor <= 1);
                    residuo = dividendo;
                    while (residuo > divisor){
                        residuo = residuo - divisor;
                        cociente++;
                    }
                    System.out.println(dividendo + " / " + divisor + " = " + cociente + " con un resto de " + residuo);
                    System.out.println("Desea salir? S/N");
                    respuesta = readme.next();
                    break;
                case 10:
                    int random1, random2, resultado, ing;                       //Realice un programa para que el usuario adivine el resultado de una multiplicación entre dos números generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario si su respuesta es o no correcta. En caso que la respuesta sea incorrecta se debe permitir al usuario ingresar su respuesta nuevamente. Para realizar este ejercicio investigue como utilizar la función Math.random() de Java.
                    random1 = (int)(Math.random()*11);
                    random2 = (int)(Math.random()*11);
                    resultado = random1*random2;
                    do {
                        System.out.println("Intente adivinar el producto de 2 numeros aleatorios entre 0 y 10. (-1 para dar resultado)");
                        ing = readme.nextInt();
                        if (ing == -1){
                            System.out.println(resultado);
                        }
                        if (resultado != ing){
                            System.out.println("Resultado Incorrecto");
                        }
                    } while (resultado != ing);
                    System.out.println("Resultado correcto");
                    System.out.println("Desea salir? S/N");
                    respuesta = readme.next();
                    break;
                case 11:
                    long entero; // -2^63 + 2^63 
                    int digitos = 0; //2.147.483.647
                    System.out.println("Ingrese un numero");
                    entero = readme.nextLong();
                    while (entero > 0){
                        entero = entero / 10;
                        digitos++;
                    }
                    System.out.println("El numero tiene " + digitos + " digito/s.");
                    System.out.println("Desea salir? S/N");
                    respuesta = readme.next();
                    break;
                case 12:
                    for (int i = 0; i < 10; i++) {
                        for (int j = 0; j < 10; j++) {
                            for (int k = 0; k < 10; k++) {
                                if (i == 3){
                                    System.out.print("E-");
                                } else {
                                    System.out.print(i + "-");
                                }
                                if (j == 3){
                                    System.out.print("E-");
                                } else {
                                    System.out.print(j+"-");
                                }
                                if (k == 3){
                                    System.out.println("E");
                                } else {
                                    System.out.println(k);
                                }
                            }
                        }
                    }
                    System.out.println("Desea salir? S/N");
                    respuesta = readme.next();
                    break;
                case 13:
                    int ingresado;
                    System.out.println("Ingrese un numero");
                    ingresado = readme.nextInt();
                    for (int i = 0; i < ingresado; i++) {
                        for (int j = 1; j < i+2; j++) {
                            System.out.print(j);                            
                        }
                        System.out.println("");
                    }
                    System.out.println("Desea salir? S/N");
                    respuesta = readme.next();
                    break;
                case 14:
                    float media;
                    int nflias, mhijos, acumhijos = 0;
                    System.out.println("Ingrese cantidad de Familias");
                    nflias = readme.nextInt();
                    for (int i = 0; i < nflias; i++) {
                        System.out.println("Ingrese cantidad de hijos para la flia n° " + (i+1));
                        mhijos = readme.nextInt();
                        acumhijos = acumhijos + mhijos;
                    }
                    media = ((float) acumhijos/nflias);
                    System.out.println("Cantidad de hijos por familia: " + media);
                    System.out.println("Desea salir? S/N");
                    respuesta = readme.next();
                    break;
                case 15:
                    System.out.println("Desea salir? S/N");
                    respuesta = readme.next();
                    break;
                default:
                    System.out.println("Fuera de rango");
                    break;
            }
            
                    
        } while (ejerc != 15 && respuesta.equalsIgnoreCase("N"));
    }
}