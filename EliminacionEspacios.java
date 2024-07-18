/* 
2. Eliminación de Espacios en Blanco

Crea un programa que solicite al usuario ingresar una frase con espacios en blanco 
al principio y al final. Utiliza el método trim() de la clase String para eliminar 
los espacios en blanco y luego muestra la frase resultante en pantalla.
*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class EliminacionEspacios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.println("-----------------------------------------------------------");
            System.out.println("*****************ELIMINACIÓN DE ESPACIOS*******************");
            System.out.println("-----------------------------------------------------------");
            System.out.print("\nIngrese un texto o una frase: ");
            String textoUsuario = scanner.nextLine();
            System.out.println("\nRESULTADO: ");
            System.out.println("TEXTO INICIAL: \""+textoUsuario+"\"");
            System.out.println("TEXTO FINAL: \""+textoUsuario.trim()+"\"");
        } catch (InputMismatchException e) {
            System.out.println("El valor ingresado no es válido");
            System.out.println("Error: "+e.getMessage());
        } catch(Exception e){
            System.out.println("ERROR ENCONTRADO: "+e.getMessage());
        }
        scanner.close();

    }
}
