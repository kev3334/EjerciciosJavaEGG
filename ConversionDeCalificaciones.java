/* 
✏️  Actividad: Conversión de Calificaciones
En esta actividad, desarrollarás un programa que solicitará al usuario ingresar una calificación 
numérica del 1 al 5. Luego, mostrará en pantalla la calificación correspondiente en letras, 
utilizando la siguiente escala:
1: "Muy deficiente"
2: "Deficiente"
3: "Suficiente"
4: "Notable"
5: "Sobresaliente" 
*/

import java.util.Scanner;

public class ConversionDeCalificaciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("-----------------------------------------------------------");
        System.out.println("***************CONVERSIÓN DE CALIFICACIONES****************");
        System.out.println("-----------------------------------------------------------");
        System.out.print("Ingrese una calificación numérica del 1 al 5: ");
        int numeroUsuario = scanner.nextInt();
        String resultadoCalificacion = switch (numeroUsuario){
            case 1 ->"Su calificación es Muy deficiente";
            case 2 ->"Su calificación es Deficiente";
            case 3 ->"Su calificación es Suficiente";
            case 4 ->"Su calificación es Notable";
            case 5 ->"Su calificación es Sobresaliente";
            default -> "Número ingresado no válido.";
        };
        System.out.println(resultadoCalificacion);
        scanner.close();
        
    }
}
