/*
✏️  Actividad: Contando los dígitos en un número
Pídele al usuario que introduzca un número. Convierte el número en una cadena
y luego utiliza un bucle y Character.isDigit() para contar el número de dígitos en el número.
*/

import java.util.Scanner;

public class ContandoDigitosNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("-----------------------------------------------------------");
        System.out.println("*************CONTANDO DÍGITOS DE UN NÚMERO*****************");
        System.out.println("-----------------------------------------------------------");
        System.out.print("Ingrese un número: ");
        int numeroUsuario = scanner.nextInt();
        String numeroToString = Integer.toString(numeroUsuario);
        int contadorDigitos=0;
        for (int i=0; i<numeroToString.length();i++){
            if(Character.isDigit(numeroToString.charAt(i))){
                contadorDigitos++;
            }
        }
        System.out.println("La cantidad de dígitos del número "+numeroUsuario+" es: "+contadorDigitos);
        scanner.close();
    }
}
