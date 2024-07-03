/* 
✏️  Actividad: Ejercicio de Días de la Semana
En esta actividad, escribirás un programa que solicite al usuario 
ingresar un número del 1 al 7, que representará un día de la semana. Luego, 
el programa mostrará en pantalla el nombre correspondiente a ese día. 
Utilizaremos la estructura "switch" para implementar este programa. 
*/

import java.util.Scanner;

public class EjercicioDiasDeLaSemana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("-----------------------------------------------------------");
        System.out.println("***************EJERCICIO DIAS DE LA SEMANA*****************");
        System.out.println("-----------------------------------------------------------");
        System.out.print("Ingrese un número del 1 al 7 [1:L,2:M,3:M,4:J,5:V,6:S,7:D]: ");
        int numeroDia = scanner.nextInt();
        switch (numeroDia) {
            case 1:
                System.out.println("El nombre del día ingresado es LUNES");
                break;
            case 2:
                System.out.println("El nombre del día ingresado es MARTES");
                break;
            case 3:
                System.out.println("El nombre del día ingresado es MIERCOLES");
                break;
            case 4:
                System.out.println("El nombre del día ingresado es JUEVES");    
                break; 
            case 5:
                System.out.println("El nombre del día ingresado es VIERNES");    
                break;   
            case 6:
                System.out.println("El nombre del día ingresado es SABADO");            
                break;         
            case 7:
                System.out.println("El nombre del día ingresado es DOMINGO");
                break; 
            default:
            System.out.println("El número ingresado no es válido");
                break;
        }
        scanner.close();
    }
}
