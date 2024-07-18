/*
Escribe un programa que solicite al usuario un número entero y muestre la tabla de multiplicar
de ese número utilizando un bucle while. El programa debe seguir solicitando números hasta que 
el usuario ingrese un valor igual a cero, en cuyo caso debería salir del bucle.
*/

import java.util.Scanner;

public class TablaDeMultiplicar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("-----------------------------------------------------------");
        System.out.println("***************TABLA DE MULTIPLICAR JAVA*******************");
        System.out.println("-----------------------------------------------------------");
        System.out.print("Ingrese un número entero: ");
        int numeroUsuario = scanner.nextInt();
        while(numeroUsuario!=0){
            for(int i=0; i<12;i++){
                System.out.println(numeroUsuario+" x "+(i+1)+" = "+(numeroUsuario*(i+1)));
            }
                System.out.print("\nIngrese un número entero: ");
            numeroUsuario = scanner.nextInt();
    
        }
        scanner.close();
        
    }
}