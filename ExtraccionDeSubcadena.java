/*
✏️  Actividad:Extracción de Subcadena
Escribe un programa que solicite al usuario ingresar una frase y dos números enteros, 
que representen un índice inicial y un índice final. Utiliza el método substring() de la clase String 
para extraer la subcadena que se encuentra entre los índices ingresados por el usuario, 
y muestra la subcadena resultante en pantalla.
*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExtraccionDeSubcadena {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("-----------------------------------------------------------");
            System.out.println("*****************EXTRACCIÓN DE SUBCADENA*******************");
            System.out.println("-----------------------------------------------------------");
            System.out.println("\t\t\tEJEMPLO");
            System.out.println("\tTEXTO--->\"FELIZ\"\tSUBCADENA-->\"LIZ\"");
            System.out.println("\tINDICE INICIAL-> L [2]   INDICE FINAL-> Z [4]\n");
            System.out.print("Ingrese el texto o frase sobre el cual desea extraer la subcadena: ");
            String textoUsuario = scanner.nextLine();
            System.out.print("Ingrese el número entero que represente el índice inicial de la subcadena que desea extraer: ");
            int indiceInicial = scanner.nextInt();
            System.out.print("Ingrese el número entero que represente el índice final de la subcadena que desea extraer: ");
            int indiceFinal = scanner.nextInt();
            String subcadena = textoUsuario.substring(indiceInicial, indiceFinal+1);
            System.out.println("RESULTADO: La subcadena solicitada es "+subcadena);
        
        } catch (InputMismatchException e) {
            System.out.println("El valor ingresado no es válido");
            System.out.println("Error: "+e.getMessage());
        }catch (Exception e){
            System.out.println("Error encontrado.");
            System.out.println("Error: "+e.getMessage());
        }
        scanner.close();
    }
}
