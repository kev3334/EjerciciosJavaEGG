/* Actividad:  Número de dígitos
Escribe un programa que te pida que ingreses un número entero y utilice un bucle while
 para calcular la cantidad de dígitos de ese número. Por ejemplo, el número 4578 
 tiene 4 dígitos. El programa debe tener en cuenta que el 0 tiene una cifra y 
 también contar las cifras de números negativos. */

import java.util.InputMismatchException;
import java.util.Scanner;

public class ContadorDigitos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("-----------------------------------------------------------");
        System.out.println("******************CONTADOR DE DÍGITOS**********************");
        System.out.println("-----------------------------------------------------------");
        try {
            System.out.print("\nIngresar un nuevo número: ");
            int numeroUsuario=scanner.nextInt();
            int resultadoDivision = (numeroUsuario/10);
            int cantidadDigitos=1;
            if(resultadoDivision==0){
                cantidadDigitos=1;
            }else{
                while(resultadoDivision!=0){
                    resultadoDivision = (resultadoDivision/10);
                    cantidadDigitos++;
                }
            }
            System.out.println("\nLa cantidad de digitos es: "+cantidadDigitos);
        } catch (InputMismatchException e) {
            System.out.println("Error: "+e.getMessage());
        }
        scanner.close();
    }
}
