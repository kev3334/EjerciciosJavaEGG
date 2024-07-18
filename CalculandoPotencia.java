/*
✏️  Actividad: Calculando la potencia
Escribe un programa que pida al usuario dos números enteros, representando 
la base y el exponente, y calcula el resultado de elevar la base al exponente 
utilizando el método pow() de la clase Math. Muestra el resultado en pantalla.
*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculandoPotencia {
        public static void main(String[] args) {
        
            Scanner scanner = new Scanner(System.in);
            try {
                System.out.println("-----------------------------------------------------------");
                System.out.println("*****************CALCULANDO POTENCIA***********************");
                System.out.println("-----------------------------------------------------------");
                System.out.print("Ingrese un número entero que sera la base de la potencia: ");
                int numeroBase = scanner.nextInt();
                System.out.print("Ingrese un número entero que sera el exponente de la potencia: ");
                int numeroExponente = scanner.nextInt();
                System.out.println("El resultado de la operación potencia de base "+numeroBase+" y exponente "+numeroExponente+" es: "+Math.pow(numeroBase, numeroExponente));
            } catch (InputMismatchException error) {
                System.out.println("El valor ingresado no es válido");
                System.out.println("Error: "+error.getMessage());
            } catch(ArithmeticException errorae){
                System.err.println("Operación No Válida");
                System.out.println("Error: "+errorae.getMessage());
            } catch (Exception e){
                System.out.println("Eror : "+e.getMessage());
            }
            scanner.close();
        }
}
    

