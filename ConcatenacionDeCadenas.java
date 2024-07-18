/*
✏️  Actividad:Concatenación de Cadenas
Escribe un programa que solicite al usuario ingresar su nombre y apellido por separado, 
y luego muestre en pantalla el nombre completo utilizando el método concat() de la clase String.
*/

import java.util.Scanner;

public class ConcatenacionDeCadenas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("-----------------------------------------------------------");
        System.out.println("****************CONCATENACION DE CADENA********************");
        System.out.println("-----------------------------------------------------------");
        System.out.print("Ingrese sus nombres: ");
        String nombresUsuario = scanner.nextLine();
        System.out.print("Ingrese sus apellidos: ");
        String apellidosUsuario = scanner.nextLine();
        String nombreApellidos = nombresUsuario.concat(" ").concat(apellidosUsuario);
        System.out.println("RESULTADO: Su nombre completo es "+nombreApellidos);
        scanner.close();
    }
}
