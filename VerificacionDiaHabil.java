/*
Verificación de Día Hábil

En este ejercicio, crearás un programa que pedirá al usuario ingresar un número del 1 al 7, 
representando un día de la semana. El programa determinará si ese día es hábil o no. 
Se mostrará el resultado en pantalla. Se considera que los días hábiles son del 1 al 5 (de lunes a viernes). 
Utilizaremos la estructura "switch" para implementar este programa. ( Ten en cuenta que los días hábiles son del 1 al 5 (de lunes a viernes).) 
*/

import java.util.Scanner;

public class VerificacionDiaHabil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("-----------------------------------------------------------");
        System.out.println("****************VERIFICACIÓN DE DÍA HÁBIL******************");
        System.out.println("-----------------------------------------------------------");
        System.out.println("1. Lunes\n2. Martes\n3. Miercoles\n4. Jueves\n5. Viernes\n6. Sabado\n7. Domingo");
        System.out.print("Ingrese un número del 1 al 7: ");
        int numeroUsuario = scanner.nextInt();
        String resultado = switch (numeroUsuario){
            case 1,2,3,4,5 -> "DÍA HÁBIL";
            case 6,7 -> "DÍA NO HÁBIL";
            default -> "El número ingresado no es válido";
        };
        System.out.println("RESULTADO: "+resultado);
        scanner.close();

    }
}
