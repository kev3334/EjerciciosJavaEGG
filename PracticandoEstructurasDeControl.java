/* ✏️  Actividad: Practicando con estructuras de control
En este ejercicio de calificación, tu tarea es escribir un programa que solicite al usuario ingresar un número entre 0 y 100. Luego, 
el programa validará el número ingresado y mostrará la calificación correspondiente según la siguiente escala:
Si la puntuación está entre 90 y 100, se mostrará "A".
Si la puntuación está entre 80 y 89, se mostrará "B".
Si la puntuación está entre 70 y 79, se mostrará "C".
Si la puntuación está entre 60 y 69, se mostrará "D".
Si la puntuación es menor a 60, se mostrará "F".
Si el usuario ingresa un número que no está dentro del rango establecido (es decir, fuera del intervalo de 0 a 100), 
el programa debe informar al usuario que el número ingresado está fuera del rango válido.
El programa mostrará en la consola el valor de la calificación obtenida.
Realiza varias pruebas de tu programa, para asegurarte que la lógica implementada sea la correcta.  */

import java.util.Scanner;

public class PracticandoEstructurasDeControl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("-----------------------------------------------------------");
        System.out.println("*****************CALCULA TU CALIFICACIÓN*******************");
        System.out.println("-----------------------------------------------------------");
        System.out.print("Ingrese el un número entre 0 y 100: ");
        int numeroIngresado = scanner.nextInt();
        if (numeroIngresado>=0 && numeroIngresado<=100){
            if(numeroIngresado>=90 && numeroIngresado<=100){
                System.out.println("Su calificación es A");
            }else if (numeroIngresado>=80 && numeroIngresado<=89){
                System.out.println("Su calificación es B");
            }else if (numeroIngresado>=70 && numeroIngresado<=79){
                System.out.println("Su calificación es C");
            }else if (numeroIngresado>=60 && numeroIngresado<=69){
                System.out.println("Su calificación es D");
            }else{
                System.out.println("Su calificación es F");
            }
        }else{
            System.out.println("El número ingresado está fuera del rango válido (0 a 100)");
        }

        scanner.close();
    }
}
