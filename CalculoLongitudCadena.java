/* 
4. Calculando la Longitud de Cadenas sin Espacios:
En esta actividad, se solicita al usuario ingresar una cadena de texto y calcular su longitud, 
pero esta vez sin contar los espacios en blanco. Para lograr esto, se utilizará el método length() 
de la clase String y se realizará un proceso adicional para excluir los espacios de la cuenta. 
*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculoLongitudCadena {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.println("-----------------------------------------------------------");
            System.out.println("*************CÁLCULO DE LONGITUD DE CADENAS****************");
            System.out.println("-----------------------------------------------------------");
            System.out.print("\nIngrese un texto o una frase que desea calcular su longitud: ");
            String textoUsuario = scanner.nextLine();
            System.out.println("\nRESULTADO: ");
            System.out.println("\nPalabra\tTamaño ");
            System.out.println("-------\t------ ");
            textoUsuario = textoUsuario.trim();
            String[] palabrasTexto;
            int tamanio=0,totalTamanio=0;
            palabrasTexto = textoUsuario.split(" ");
            for (int i=0;i<palabrasTexto.length;i++){
                System.out.println((i+1)+". "+palabrasTexto[i]+"     ["+palabrasTexto[i].length()+"]");
                tamanio=palabrasTexto[i].length();
                totalTamanio+=tamanio;
            }
            System.out.println("\nEl tamaño total del texto ingresado sin contar los espacios es: "+totalTamanio);
        } catch (InputMismatchException e) {
            System.out.println("El valor ingresado no es válido");
            System.out.println("Error: "+e.getMessage());
        } catch(Exception e){
            System.out.println("ERROR ENCONTRADO: "+e.getMessage());
        }
        scanner.close();
    }
}
