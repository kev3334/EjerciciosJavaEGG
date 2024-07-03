/* 
✏️  Actividad: Divisibilidad
En esta actividad, escribirás un programa que solicite al usuario un número y determine si es divisible por 5, por 3, por ambos o por ninguno. 
El resultado se mostrará en pantalla. 
*/

import java.util.Scanner;

public class Divisibilidad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("-----------------------------------------------------------");
        System.out.println("*************NUMEROS DIVISIBLES POR 3 Y/O 5 ***************");
        System.out.println("-----------------------------------------------------------");
        System.out.print("Ingrese un número: ");
        int numeroIngresado = scanner.nextInt();
        //boolean divisiblePor5 = numeroIngresado % 5 == 0;
        //boolean divisiblePor3 = numeroIngresado % 3 == 0;
        if(numeroIngresado % 5 == 0 && numeroIngresado % 3 == 0){
            System.out.println("El numero ingresado es divisible por 3 y por 5");
        }else if (numeroIngresado % 5 != 0 && numeroIngresado % 3 == 0){
            System.out.println("El número ingresado es divisible por 3");
        }else if (numeroIngresado % 5 == 0 && numeroIngresado % 3 != 0){
            System.out.println("El número ingresado es divisible por 5");
        }else {
            System.out.println("El número ingresado no es divisible por 5 ni por 3");
        }

        scanner.close();
    }    
}
