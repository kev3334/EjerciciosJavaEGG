/* 
✏️  Actividad: Resta con Manejo de Excepciones
Escribe un programa que solicite al usuario ingresar dos números. Luego, realiza la resta del primer número 
menos el segundo número. Implementa un bloque "try-catch" para manejar las excepciones que puedan surgir 
en caso de que el usuario no ingrese números. En caso de que se produzca una excepción, muestra un mensaje 
apropiado en pantalla. Si no se produce ninguna excepción, muestra el resultado de la resta. 
*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class RestaManejoDeExcepciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("-----------------------------------------------------------");
            System.out.println("*****************CALCULADORA RESTA SEGURA******************");
            System.out.println("-----------------------------------------------------------");
            System.out.print("Ingrese el primer numero: ");
            double primerNumero = scanner.nextDouble();
            System.out.print("Ingrese el segundo numero: ");
            double segundoNumero = scanner.nextDouble();
            double resultado = primerNumero-segundoNumero;
            System.out.println("El resultado de la resta es: "+resultado);
        } catch (InputMismatchException e) {
            System.out.println("El valor ingresado no es válido, solo debe ingresar números.");
            System.out.println("Error: "+e.getMessage());
        } catch (Exception e){
            System.out.println("Error al realizar la operación.");
            System.out.println("Error: "+e.getMessage());
        }
        scanner.close();
    }
}
