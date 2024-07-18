/*
✏️ Actividad: Suma de números
Pídele al usuario que introduzca una cadena que represente un número entero
y luego otra cadena que represente un número decimal. Convierte cada cadena
al tipo de dato correspondiente utilizando los métodos valueOf,
suma sus valores e imprímelos por consola.
*/

import java.util.Scanner;

public class SumaDeNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("-----------------------------------------------------------");
        System.out.println("*************SUMA DE NÚMEROS FORMATO TEXTO*****************");
        System.out.println("-----------------------------------------------------------");
        System.out.print("Ingrese un texto que represente un número entero: ");
        String numeroTexto = scanner.nextLine();
        System.out.print("Ingrese un texto que represente un número decimal: ");
        String decimalTexto = scanner.nextLine();
        int numeroUsuario = Integer.valueOf(numeroTexto);
        double decimalUsuario = Double.valueOf(decimalTexto);
        double sumaFinal = numeroUsuario+decimalUsuario;
        System.out.println("La suma final es: "+sumaFinal);
        scanner.close();


    }
}
