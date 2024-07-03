/* 
1. Verificación de Contraseña:
En este ejercicio, escribirás un programa que pida al usuario una contraseña y verificará 
si coincide con una contraseña predefinida. Si la contraseña ingresada es correcta, se mostrará 
un mensaje de "Acceso concedido". En caso contrario, se mostrará un mensaje de "Acceso denegado".
 */

import java.util.Scanner;

public class VerificacionEdadControl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String contraseniaBase= "javaegg";
        System.out.println("-----------------------------------------------------------");
        System.out.println("*****************VERIFICACION CONTRASEÑA*******************");
        System.out.println("-----------------------------------------------------------");
        System.out.print("Ingrese la contraseña: ");
        String contraseniaUsuario = scanner.nextLine();
        if(contraseniaUsuario.equals(contraseniaBase)){
            System.out.println("\n\t\t\tACCESO CONCEDIDO!");
        }else{
            System.out.println("\n\t\t\tACCESO DENEGADO!");
        }
        scanner.close();
    }
}
