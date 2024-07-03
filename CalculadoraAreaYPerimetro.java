/* 
Calculadora de Área y Perímetro:
Implementando el uso de la estructura "switch expression", solicita al usuario que elija entre una de las siguientes dos figuras geométricas:
Opción 1: "Circulo"
Opción 2: "Rectangulo"
Según la figura seleccionada, deberás solicitar que ingrese los valores necesarios para calcular el área o el perímetro de cada figura:
Para el Círculo: Solicita el valor del radio, ya que PI es una constante.
Para el Rectángulo: Solicita el valor de la base y de la altura.
Dentro de la opción elegida, permite al usuario seleccionar si desea conocer el área o el perímetro de dicha figura.
Realiza los cálculos necesarios y muestra el resultado por consola junto con un mensaje adecuado.
*/

import java.util.Scanner;

public class CalculadoraAreaYPerimetro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double PI = 3.141592D;
        System.out.println("-----------------------------------------------------------");
        System.out.println("******************CALCULADORA GEOMÉTRICA*******************");
        System.out.println("-----------------------------------------------------------");
        System.out.println("Opción 1: Círculo: ");
        System.out.println("Opción 2: Rectángulo: ");
        System.out.print("Ingrese una opción 1 o 2: ");
        int opcionUsuario = scanner.nextInt();
        int calculoUsuario = 0;
        double area=0, perimetro=0;
        String resultado = switch (opcionUsuario){
            case 1 ->{
                System.out.print("Ingrese el valor del radio del círculo: ");
                double radio = scanner.nextDouble();
                System.out.println("¿Que cálculo desea realizar?");
                System.out.println("Opción 1: Area: ");
                System.out.println("Opción 2: Perímetro: ");
                System.out.print("Ingrese una opción 1 o 2: ");
                calculoUsuario = scanner.nextInt();
                if (calculoUsuario==1){
                    area=PI*radio*radio;
                    yield "El Área del Círculo es: "+area;
                }else if (calculoUsuario==2){
                    perimetro=PI*2*radio;
                    yield "El Perímetro del Círculo es: "+perimetro;
                }else{
                    yield "El valor ingresado no es válido!.";
                }
            }
            case 2 ->{
                System.out.print("Ingrese el valor de la base del rectangulo: ");
                double base = scanner.nextDouble();
                System.out.print("Ingrese el valor de la altura del rectangulo: ");
                double altura = scanner.nextDouble();
                System.out.println("¿Que cálculo desea realizar?");
                System.out.println("Opción 1: Area: ");
                System.out.println("Opción 2: Perímetro: ");
                System.out.print("Ingrese una opción 1 o 2: ");
                calculoUsuario = scanner.nextInt();
                if (calculoUsuario==1){
                    area=base*altura;
                    yield "El Área del Rectángulo es: "+area;
                }else if (calculoUsuario==2){
                    perimetro=2*(base+altura);
                    yield "El Perímetro del Rectángulo es: "+perimetro;
                }else{
                    yield "El valor ingresado no es válido!.";
                }
            }
            default -> "El valor ingresado no es válido!.";
        };
        System.out.println("RESULTADO: "+resultado);
        scanner.close();
    }
}
