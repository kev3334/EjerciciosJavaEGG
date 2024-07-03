/* 
Pide al usuario que ingrese su año de nacimiento y almacena el dato en una variable previamente declarada llamada añoNacimiento.
Declara una variable del tipo Constante llamado ANIOACTUAL con el año actual.
Calcula la edad actual del usuario, considerando que la cuenta sería ANIOACTUAL - añoNacimiento. Almacena el dato en una variable llamada calculoEdad.
Determina si el usuario es mayor de edad (tener 18 años o más) y muestra un mensaje apropiado.
 */

import java.util.Scanner;

public class VerificacionEdad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("-----------------------------------------------------------");
        System.out.println("***************CALCULADORA DE EDAD ACTUAL*****************");
        System.out.println("-----------------------------------------------------------");
        System.out.print("Ingrese el año de su nacimiento: ");
        int anioNacimiento = scanner.nextInt();
        final int ANIOACTUAL = 2024;
        int calculoEdad= ANIOACTUAL-anioNacimiento;
        String esMayorDeEdad = (calculoEdad>=18) ? "mayor de Edad" : "menor de Edad";
        System.out.println("Resultado: Usted es una persona "+esMayorDeEdad+" y su edad es "+calculoEdad+" años");

        scanner.close();
    }    
}
