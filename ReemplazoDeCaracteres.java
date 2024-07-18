/*
1. Reemplazo de Caracteres

Escribe un programa que solicite al usuario ingresar una frase y dos caracteres. 
Utiliza el método replace() de la clase String para reemplazar todas las ocurrencias 
del primer carácter con el segundo carácter en la frase ingresada por el usuario. 
Muestra la frase resultante en pantalla. 
*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class ReemplazoDeCaracteres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.println("-----------------------------------------------------------");
            System.out.println("*****************REEMPLAZO DE CARACTERES*******************");
            System.out.println("-----------------------------------------------------------");
            System.out.print("\nIngrese un texto o una frase : ");
            String textoUsuario = scanner.nextLine();
            System.out.print("Ingrese el caracter que desea reemplazar del texto: ");
            char caracterPorRetirar = scanner.nextLine().charAt(0);
            System.out.print("Ingrese el nuevo caracter que reemplazará al anterior caracter: ");
            char caracterRemplazo = scanner.next().charAt(0);
            String nuevoTextoUsuario = textoUsuario.replace(caracterPorRetirar, caracterRemplazo);
            System.out.println("\nRESULTADO: El nuevo texto modificado es \""+nuevoTextoUsuario+"\"");
        } catch (InputMismatchException e) {
            System.out.println("El valor ingresado no es válido");
            System.out.println("Error: "+e.getMessage());
        } catch (Exception e){
            System.out.println("Error encontrado: "+ e.getMessage());
        }
        scanner.close();

    }
}
