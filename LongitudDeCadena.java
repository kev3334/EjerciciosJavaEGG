/* 
✏️  Actividad: Longitud de Cadena
Escribe un programa que pida al usuario ingresar una cadena de texto y muestre 
en pantalla su longitud utilizando el método length() de la clase String.
*/
import java.util.Scanner;
public class LongitudDeCadena {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("-----------------------------------------------------------");
        System.out.println("*******************LONGITUD DE CADENA**********************");
        System.out.println("-----------------------------------------------------------");
        System.out.print("Ingrese una cadena de texto: ");
        String textoUsuario = scanner.nextLine();
        int longitudTextoUsuario = textoUsuario.length();
        System.out.println("El tamaño del texto ingresado es: "+longitudTextoUsuario);
        scanner.close();
    }
}
