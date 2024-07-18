/*
Contador de números pares e impares
Escribe un programa que solicite al usuario ingresar una serie de números enteros.
Utiliza un bucle while para contar la cantidad de números pares e impares ingresados 
hasta que el usuario decida terminar la entrada de números. Al finalizar, 
muestra la cantidad de números pares e impares ingresados
*/

import java.util.Scanner;

public class ContadorNumerosParesImpares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("-----------------------------------------------------------");
        System.out.println("******************CONTADOR DE NUMEROS**********************");
        System.out.println("-----------------------------------------------------------");
        int opcionUsuario=0;
        int numeroUsuario;
        int contadorPares=0;
        int contadorImpares=0;
        do{
            System.out.println("\n1. Ingresar un número nuevo: ");
            System.out.println("2. Finalizar y mostrar resultados: ");
            System.out.print("Ingrese una opción 1 o 2: ");
            opcionUsuario = scanner.nextInt();
            if(opcionUsuario == 1){
                System.out.print("Ingrese el nuevo número: ");
                numeroUsuario = scanner.nextInt();
                if(numeroUsuario % 2 == 0){
                    contadorPares++;
                }else{
                    contadorImpares++;
                }
            }
        }while(opcionUsuario==1);
        System.out.println("Resultados: ");
        System.out.println("La cantidad total de números pares son: "+contadorPares);
        System.out.println("La cantidad total de números impares son: "+contadorImpares);
        scanner.close();
    }
    
}
