/* 
✏️  Actividad: Búsqueda de Caracteres
Escribe un programa que pida al usuario ingresar una palabra y un carácter, y determine si el carácter ingresado 
se encuentra en la palabra utilizando el método indexOf() de la clase String. Muestra un mensaje 
adecuado en pantalla indicando si el carácter se encuentra o no en la palabra.
*/

import java.util.InputMismatchException;
import java.util.Scanner;


public class BusquedaDeCaracteres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.println("-----------------------------------------------------------");
            System.out.println("***************BÚSQUEDA DE CARACTÉRES*****************");
            System.out.println("-----------------------------------------------------------");
            System.out.print("Ingrese una palabra: ");
            String palabraUsuario = scanner.next();
            System.out.print("Ingrese el caractér a buscar: ");
            char caracterBuscar = scanner.next().charAt(0);
            int indice = palabraUsuario.indexOf(caracterBuscar);
            if (indice>=0){
                System.out.println("El caracter ingresado \""+caracterBuscar+"\" SÍ se encuentra en la palabra "+palabraUsuario);
                System.out.println("El caracter "+caracterBuscar+" se encuentra en la posición "+(indice+1));
            }else{
                System.out.println("El caracter ingresado \""+caracterBuscar+"\" NO se encuentra en la palabra "+palabraUsuario);
            }
        } catch (InputMismatchException e) {
            System.out.println("El valor ingresado no es válido");
            System.out.println("Error: "+e.getMessage());
        } catch (Exception e ){
            System.out.println("Error Encontrado: "+e.getMessage());
        }
        
        
        scanner.close();

    }
}
