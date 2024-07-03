/* 
3. Determinación de Edades
En este ejercicio, desarrollarás un programa que solicite al usuario su edad y determine en qué categoría se encuentra. 
Las categorías son las siguientes:
Si la edad es menor de 18 años, mostrar el mensaje "Eres menor de edad".
Si la edad está entre 18 y 64 años (inclusive), mostrar el mensaje "Eres adulto".
Si la edad es igual o mayor a 65 años, mostrar el mensaje "Eres un adulto mayor".
El programa deberá mostrar el mensaje correspondiente según la categoría de edad en la que se encuentre el usuario.
 */

import java.util.Scanner;

public class DeterminacionDeEdades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("------------------------------------------------------------");
        System.out.println("***********DETERMINACIÓN DE CATEGORÍA DE EDADES*************");
        System.out.println("------------------------------------------------------------");
        System.out.print("Ingrese el su edad: ");
        int edadUsuario = scanner.nextInt();
        if (edadUsuario>0){
            if(edadUsuario<18){
                System.out.println("\nEres menor de edad.");
            }else if (edadUsuario>=18 && edadUsuario<=64){
                System.out.println("\nEres adulto.");
            }else{
                System.out.println("\nEres un adulto mayor.");
            }
        }else{
            System.out.println("\nLa edad ingresada no es válida.");
        }
        scanner.close();

    }
}
