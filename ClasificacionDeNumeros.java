/* 
✏️  Actividad: Clasificación de Números
En esta actividad, deberás escribir un programa que solicite al usuario un número y determine si es positivo, negativo o cero. 
El resultado se mostrará en pantalla. 
*/

import java.util.Scanner;

public class ClasificacionDeNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("-----------------------------------------------------------");
        System.out.println("***************CLASIFICACION DE NUMEROS*******************");
        System.out.println("-----------------------------------------------------------");
        System.out.print("Ingrese un número: ");
        int numeroIngresado = scanner.nextInt();
        String resultado;
        if(numeroIngresado>0){
            resultado="El número ingresado es Positivo.";
        }else if (numeroIngresado == 0){
            resultado = "El número ingresado es Cero.";
        }else {
            resultado = "El número ingresado es Negativo";
        }
        System.out.println("Resultado: "+resultado);

        scanner.close();

    }
}
