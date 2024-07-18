/*
✏️ Actividad: Contando los espacios en blanco en una cadena
Pídele al usuario que introduzca una cadena. Crea un bucle que recorra cada carácter
en la cadena y utiliza Character.isWhitespace() para contar el número de espacios en
blanco en la cadena. Muestra el recuento al usuario.
*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class ContandoEspacioDeCadena {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("-----------------------------------------------------------");
        System.out.println("*************CONTADOR DE ESPACIOS DE CADENA****************");
        System.out.println("-----------------------------------------------------------");
        
        try {
            System.out.print("Ingrese un texto o frase: ");
            String textoUsuario = scanner.nextLine();
            int contadorEspacios=0;
            for(int i=0; i<textoUsuario.length() ;i++){
                if(Character.isWhitespace(textoUsuario.charAt(i))){
                    contadorEspacios++;
                }
            }
            System.out.println("El número de espacios en el texto ingresado es: "+contadorEspacios);
            
        } catch (InputMismatchException e) {
            System.out.println("El formato del valor ingresado no es correcto." +e.getMessage());
        } catch (Exception e){
            System.out.println("Error encontrado: "+e.getMessage());
        }

        scanner.close();

    }
}
