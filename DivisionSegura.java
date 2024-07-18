/* 
✏️  Actividad: Division Segura
Escribe un programa que pida al usuario que ingrese dos números enteros y realice 
la división del primer número entre el segundo número. Implementa un bloque "try-catch" 
para manejar la excepción en caso de que se intente realizar una división por cero. 
En caso de que ocurra la excepción, muestra un mensaje apropiado en la pantalla. 
*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisionSegura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("-----------------------------------------------------------");
            System.out.println("***************CALCULADORA DIVISIÓN SEGURA*****************");
            System.out.println("-----------------------------------------------------------");
            System.out.print("Ingrese el primer numero entero: ");
            int primerNumero = scanner.nextInt();
            System.out.print("Ingrese el segundo numero entero: ");
            int segundoNumero = scanner.nextInt();
            int resultado = primerNumero/segundoNumero;
            System.out.println("El resultado de la división es: "+resultado);
        } catch (ArithmeticException e) {
            System.out.println("La división no es posible.");
            System.out.println("Mensaje de error: "+e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Los valores ingresados no son correctos");
            System.out.println("Mensaje de error: "+e.getMessage());
        } catch (Exception e){
            System.out.println("La operación no se ha podido realizar debido a un error encontrado.");
            System.out.println("Mensaje de error: "+e.getMessage());
        }
        scanner.close();

        
    }
}
