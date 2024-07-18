
/* 3. Comparación de Cadenas
Desarrolla un programa que solicite al usuario ingresar dos palabras. 
Utiliza el método equals() de la clase String para comparar si las dos palabras son iguales.
Muestra un mensaje apropiado en pantalla indicando si las palabras son iguales o diferentes.
*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class ComparacionCadenas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.println("-----------------------------------------------------------");
            System.out.println("*****************COMPARACIÓN DE CADENAS********************");
            System.out.println("-----------------------------------------------------------");
            System.out.print("\nIngrese la primera palabra a comparar: ");
            String primeraPalabra = scanner.next();
            System.out.print("\nIngrese la segunda palabra a comparar: ");
            String segundaPalabra = scanner.next();
            if(primeraPalabra.trim().toLowerCase().equals(segundaPalabra.trim().toLowerCase())){
                System.out.println("\nRESULTADO: Las palabras son iguales");
            }else{
                System.out.println("\nRESULTADO: Las palabras son diferentes");
            }
        } catch (InputMismatchException e) {
            System.out.println("El valor ingresado no es válido");
            System.out.println("Error: "+e.getMessage());
        } catch(Exception e){
            System.out.println("ERROR ENCONTRADO: "+e.getMessage());
        }
        scanner.close();
    }
}
