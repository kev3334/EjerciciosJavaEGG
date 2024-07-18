/*
✏️  Actividad: Calculando el valor absoluto
Escribe un programa que  pida al usuario un número entero y muestra en pantalla su valor absoluto
utilizando el método abs() de la clase Math. 
*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculandoValorAbsoluto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("-----------------------------------------------------------");
            System.out.println("***************CALCULADORA VALOR ABSOLUTO******************");
            System.out.println("-----------------------------------------------------------");
            System.out.print("Ingrese un número entero: ");
            int numeroUsuario = scanner.nextInt();
            System.out.println("El valor absoluto del número "+numeroUsuario+" es : "+Math.abs(numeroUsuario));
        } catch (InputMismatchException e) {
            System.out.println("El valor ingresado no es válido");
            System.out.println("Error: "+e.getMessage());
        } catch (Exception e){
            System.out.println("Eror : "+e.getMessage());
        }
        scanner.close();
        
    }
}
