/*
2. Generación aleatoria y análisis de raíz cuadrada
Escribe un programa que cumpla con las siguientes condiciones:
Pide al usuario que ingrese un número entre 1 y 30. Este número será almacenado en una variable llamada numeroLimite .
Utiliza la clase Math para generar un número aleatorio entre 1 y el numeroLimite recibido del usuario.
Utiliza el método Math.sqrt() para calcular la raíz cuadrada del número aleatorio generado y muéstralo en pantalla.
Analiza si el número aleatorio generado es primo y muestra un mensaje en pantalla indicando si lo es o no.
Finalmente, muestra el número aleatorio generado y su raíz cuadrada en pantalla. 
*/
import java.util.InputMismatchException;
import java.util.Scanner;

public class GeneracionAleatoriaYRaiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("-----------------------------------------------------------------------");
            System.out.println("**********GENERACIÓN ALEATORIA Y ANÁLISIS DE RAÍZ CUADRADA*************");
            System.out.println("-----------------------------------------------------------------------");
            System.out.print("Ingrese un número entre 1 y 30: ");
            int numeroLimite = scanner.nextInt();
            int numeroAleatorio = (int)(Math.random()*numeroLimite+1);
            double resultadoRaiz = Math.sqrt(numeroAleatorio);
            System.out.println("Se generó un número aleatorio entre 1 y "+numeroLimite+": "+numeroAleatorio);
            System.out.println("La raiz cuadrada del numero aleatorio "+numeroAleatorio+" es: "+resultadoRaiz);
            System.out.println("-----------------------------------------------------------------------");
            System.out.println("************VALIDACIÓN NÚMERO PRIMO DEL N° ALEATORIO******************");
            System.out.println("-----------------------------------------------------------------------");
            boolean validacionPrimo = (numeroAleatorio<=1) ? false : true;
            for (int i= 2; i<=resultadoRaiz;i++){
                if(numeroAleatorio % i == 0){
                    validacionPrimo =false;
                }
            }
            String resultadoPrimo = (validacionPrimo) ? "El número es Primo" : "El número no es Primo";
            System.out.println("RESULTADO: " + resultadoPrimo);
        } catch (InputMismatchException error) {
            System.out.println("El valor ingresado no es válido");
            System.out.println("Error: " + error.getMessage());
        } catch (ArithmeticException errorae) {
            System.err.println("Operación No Válida");
            System.out.println("Error: " + errorae.getMessage());
        } catch (Exception e) {
            System.out.println("Eror : " + e.getMessage());
        }
        scanner.close();
    }
}
