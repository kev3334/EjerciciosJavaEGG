/*
✏️  Actividad: Conversión de Mayúsculas y Minúsculas
Escribe un programa que pida al usuario ingresar una cadena de texto y muestre en 
pantalla la misma cadena, pero con todos los caracteres en mayúsculas o minúsculas. 
Utiliza los métodos toUpperCase() y toLowerCase() de la clase String para realizar la conversión.
*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class ConversionMayusculasMinusculas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.println("-----------------------------------------------------------");
            System.out.println("*************CONVERSIÓN MAYÚSCULAS-MINÚSCULAS**************");
            System.out.println("-----------------------------------------------------------");
            System.out.print("Ingrese el texto que quiere convertir: ");
            String textoUsuario = scanner.nextLine();
            System.out.println("\nCONVERTIR A: ");
            System.out.println("1. Mayúsculas");
            System.out.println("2. Minúsculas");
            System.out.print("Ingrese una opción [1 o 2]: ");
            int opcionUsuario = scanner.nextInt();
            String resultado = switch (opcionUsuario){
                case 1->"Resultado: El texto convertido a Mayúsculas es "+textoUsuario.toUpperCase();
                case 2->"Resultado: El texto convertido a Minúsculas es "+textoUsuario.toLowerCase();
                default -> "El valor ingresado no es válido";
            };
            System.out.println(resultado);
        } catch (InputMismatchException e) {
            System.out.println("El valor ingresado no es válido");
            System.out.println("Error: "+e.getMessage());
        } catch (Exception e){
            System.out.println("Error encontrado : "+e.getMessage());
        }
        
        scanner.close();
    }
}
