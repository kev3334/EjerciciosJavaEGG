/* 1. Pide al usuario que ingrese dos números, y:
A. Compara si el primer  número  ingresado  es mayor al segundo número  ingresado.
B. Verifica si el primer número ingresado  es distinto al segundo número ingresado . Muestra el resultado en consola.
C. Verifica si el primer número ingresado  es divisible por 2 . Muestra el resultado en consola. */

import java.util.Scanner;

public class ComparaNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer número: ");
        int primerNumero = scanner.nextInt();
        System.out.println("Ingrese el segundo número: ");
        //int segundoNumero = scanner.nextInt();
        //String resultadoMayor = (primerNumero > segundoNumero) ? "Es mayor": (primerNumero == segundoNumero) ? "Es igual" : "Es menor";
        //System.out.println("El primer numero "+resultadoMayor);
        //String resultadoDistinto = (primerNumero!=segundoNumero) ? "Son diferentes" : "Son iguales";
        //System.out.println("Resultado: "+resultadoDistinto);
        String resultadoDivisible = (primerNumero % 2 == 0) ? "El numero es divisible entre 2" : "El numero no es divisible entre 2";
        System.out.println(resultadoDivisible);
        scanner.close();

    }
}
