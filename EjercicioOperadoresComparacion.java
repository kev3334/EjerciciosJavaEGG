/* 2. Pide al usuario que ingrese otros 2 números, y realiza las siguientes validaciones:
A. Si el número 1 es mayor al número 2 y si el número 3 es mayor al número 4.
B. Si el número 1 es mayor al número 2 o si el número 3 es mayor al número 4. */

import java.util.Scanner;

public class EjercicioOperadoresComparacion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nIngrese el primer número: ");
        int valor1 = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int valor2 = scanner.nextInt();
        System.out.print("Ingrese el tercer número: ");
        int valor3 = scanner.nextInt();
        System.out.print("Ingrese el cuerto número: ");
        int valor4 = scanner.nextInt();
        //String validacion1 = (valor1>valor2 && valor3 > valor4) ? "Validación Exitosa" : "No se cumple la validación";
        //System.out.println(validacion1);
        String validacion2 = (valor1>valor2 || valor3 > valor4) ? "Validación Exitosa" : "No se cumple la validación";
        System.out.println(validacion2);
        scanner.close();
        
    }
}
