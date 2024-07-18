/* 
✏️  Actividad: Redondeo de números
Escribe un programa que pida al usuario un número decimal y muestra en pantalla su valor 
redondeado utilizando el método round() de la clase Math.
*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class RedondeoDeNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("-----------------------------------------------------------");
            System.out.println("*****************REDONDEO DE NÚMEROS***********************");
            System.out.println("-----------------------------------------------------------");
            System.out.print("Ingrese un número decimal: ");
            double numeroUsuario = scanner.nextDouble();
            System.out.println("El valor redondeado del número "+numeroUsuario+" es : "+Math.round(numeroUsuario));
        } catch (InputMismatchException e) {
            System.out.println("El valor ingresado no es válido");
            System.out.println("Error: "+e.getMessage());
        } catch (Exception e){
            System.out.println("Eror : "+e.getMessage());
        }
        scanner.close();
    }
}
