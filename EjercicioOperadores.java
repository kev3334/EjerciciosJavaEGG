/* Aplica lo aprendido resolviendo los siguientes ejercicios:
1. Declara dos variables, y asígnales un valor a cada una de ellas.
2. Realiza las 5 operaciones básicas posibles en Java y muestra el resultado en consola. Te animamos a mostrar el resultado dentro de un texto para que se vea ordenado el resultado, Ej: La suma de las 2 variables es : “[resultado]”;
3. Posteriormente, pide al usuario que ingrese dos números, guardarlos en variables previamente declaradas, realiza la suma de los números y muestra el resultado en la consola.
 */

import java.util.Scanner;

public class EjercicioOperadores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nIngrese el primer número: ");
        int valor1 = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int valor2 = scanner.nextInt();;
        System.out.println("\nLa suma de las 2 variables es : "+(valor1+valor2));
        System.out.println("La resta de las 2 variables es : "+(valor1-valor2));
        System.out.println("La multiplicación de las 2 variables es : "+(valor1*valor2));
        System.out.println("La división de las 2 variables es : "+(valor1/valor2));
        System.out.println("El resto de la división de las 2 variables es : "+(valor1%valor2));

        scanner.close();
    }
}
