/* 
✏️  Actividad: Conversión de Cadena a Entero
Escribe un programa que solicite al usuario ingresar una cadena de caracteres que represente 
un número entero. Utiliza el método Integer.parseInt() para convertir la cadena en un número entero.
Implementa un bloque "try-catch" para manejar la excepción en caso de que la cadena ingresada 
no pueda ser convertida en un número entero. En caso de que se produzca la excepción, 
muestra un mensaje apropiado en la pantalla. 
*/

import java.util.Scanner;

public class ConversionCadenaAEntero {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("-----------------------------------------------------------");
            System.out.println("***************CONVERSIÓN CADENA A ENTERO******************");
            System.out.println("-----------------------------------------------------------");
            System.out.print("Ingrese un número entero [Formato Texto]: ");
            String numeroUsuario = scanner.nextLine();
            int numeroConvertido = Integer.parseInt(numeroUsuario);
            System.out.println("El número que ha ingresado es [Formato Número]: "+numeroConvertido);
        } catch (NumberFormatException e) {
            System.out.println("Error en el formateo. El valor ingresado no corresponde a un número entero");
            System.out.println("Error: "+e.getMessage());
        } catch (Exception e){
            System.out.println("Error al realizar la conversión");
            System.out.println("Error: "+e.getMessage());
        }
        scanner.close();
    }
}
