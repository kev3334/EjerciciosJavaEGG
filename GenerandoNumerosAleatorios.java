/*
✏️  Actividad: Generando números aleatorios
Escribe un programa que genere y muestre en pantalla un número aleatorio en el rango 
del 1 al 355  utilizando el método random() de la clase Math. Puedes utilizar el método floor() 
para redondear el número aleatorio hacia abajo.
*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class GenerandoNumerosAleatorios {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("-----------------------------------------------------------");
            System.out.println("*************GENERADOR DE NÚMEROS ALEATORIOS***************");
            System.out.println("-----------------------------------------------------------");
            System.out.println("Vamos a crear un ragno de números aleatorios para ello ingrese lo siguiente...");
            System.out.print("Ingrese el valor inicial del rango de números aleatorios: ");
            int valorInicial = scanner.nextInt();
            System.out.print("Ingrese el valor final del rango de números aleatorios: ");
            int valorFinal = scanner.nextInt();
            System.out.println("El rango de números aleatorios estará entre el "+valorInicial+" y "+valorFinal+": ");
            System.out.println("Listado de números aleatorios generado: ");
            for (int i=0;i<5;i++){
                System.out.print("\n");
                for (int j=0; j<10;j++){
                    System.out.print((int)Math.floor(Math.random()*(valorFinal-(valorInicial-1))+valorInicial)+"\t");
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("El valor ingresado no es válido");
            System.out.println("Error: "+e.getMessage());
        } catch (Exception e){
            System.out.println("Eror : "+e.getMessage());
        }
        scanner.close();
    }
}
