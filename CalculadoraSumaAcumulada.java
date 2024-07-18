/*
Calculadora de suma acumulada
Crea un programa que solicite al usuario ingresar una serie de números
enteros positivos. Utiliza un bucle do-while para ir acumulando la suma
de los números ingresados. Después de cada entrada de número, pregunta
al usuario si desea ingresar otro número. Si el usuario responde afirmativamente,
continúa solicitando números; de lo contrario, muestra la suma acumulada
de todos los números ingresados y termina el programa.
*/

import java.util.Scanner;

public class CalculadoraSumaAcumulada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("-----------------------------------------------------------");
        System.out.println("**************CALCULADORA DE SUMA ACUMULADA****************");
        System.out.println("-----------------------------------------------------------");
        int opcionUsuario=0;
        int numeroUsuario;
        int sumaNumeros=0;
        do{
            System.out.print("\nIngresar un nuevo número entero y positivo: ");
            numeroUsuario = scanner.nextInt();
            sumaNumeros+=numeroUsuario;
            System.out.println("Desea ingresar otro número\n1. Sí\n2. No");
            System.out.print("Ingrese una opción 1 o 2: ");
            opcionUsuario = scanner.nextInt();
        }while(opcionUsuario==1);
        System.out.println("\nResultados: ");
        System.out.println("La suma total de los números ingresados son: "+sumaNumeros);
        scanner.close();
    }
}
