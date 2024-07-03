/* 
✏️  Actividad: Selección de Opción
En esta actividad, vas a desarrollar un programa que mostrará un menú con las siguientes opciones:
Opción 1: "Guardar"
Opción 2: "Cargar"
Opción 3: "Salir"
El programa solicitará al usuario que ingrese un número del 1 al 3 para seleccionar una opción. 

Utilizarás la estructura "switch" para implementar este programa y mostrar en pantalla el mensaje correspondiente a la opción seleccionada. 
*/

import java.util.Scanner;

public class SeleccionDeOpcion {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("-----------------------------------------------------------");
        System.out.println("*******************SELECCIÓN DE OPCIÓN*********************");
        System.out.println("-----------------------------------------------------------");
        System.out.println("Opción 1: \"Guardar\": ");
        System.out.println("Opción 2: \"Cargar\": ");
        System.out.println("Opción 3: \"Salir\": ");
        System.out.print("Ingrese una opción del 1 al 3: ");
        int opcionUsuario = scanner.nextInt();
        String resultado = switch(opcionUsuario){
            case 1 -> "SE GUARDÓ EXITOSAMENTE";
            case 2 -> "SE CARGÓ EXITOSAMENTE";
            case 3 -> "LA SESION HA SIDO FINALIZADA";
            default -> "El valor ingresado no es válido";
        };
        System.out.println(resultado);
        scanner.close();

    }
}
