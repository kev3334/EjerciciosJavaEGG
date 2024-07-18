/* 
✏️  Actividad: Calculando la raíz cuadrada
Escribe un programa que pida al usuario un número positivo y calcule su raíz cuadrada utilizando
el método sqrt() de la clase Math. Si el número ingresado es negativo, muestra un mensaje adecuado en pantalla.
*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculandoRaizCuadrada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            try {
                System.out.println("-----------------------------------------------------------");
                System.out.println("*****************CALCULANDO RAIZ***********************");
                System.out.println("-----------------------------------------------------------");
                System.out.print("Ingrese un número POSITIVO sobre el cual quiere calcular la raiz: ");
                double numeroBase = scanner.nextDouble();
                System.out.print("Ingrese un índice de la raiz a calcular (P.E. para calcular la raiz cuadrada debe ingresar índice 2) : ");
                double numeroIndice = scanner.nextDouble();
                //System.out.println("El resultado de la operación raiz de base "+numeroBase+" e índice "+numeroIndice+" es: "+Math.pow(numeroBase, (1/numeroIndice)));
                String resultado = (numeroBase > 0) ? "El resultado de la operación raiz de base "+numeroBase+" e índice "+numeroIndice+" es: "+Math.pow(numeroBase, (1/numeroIndice)) : "El valor ingresado no es un número positivo.";
                System.out.println("RESULTADO: "+resultado);
            } catch (InputMismatchException error) {
                System.out.println("El valor ingresado no es válido");
                System.out.println("Error: "+error.getMessage());
            } catch(ArithmeticException errorae){
                System.err.println("Operación No Válida");
                System.out.println("Error: "+errorae.getMessage());
            } catch (Exception e){
                System.out.println("Eror : "+e.getMessage());
            }
            scanner.close();
    }
}
