/* 
✏️  Actividad: Selección de Figura Geométrica
Mediante una estructura switch, desarrollarás un programa que pida al usuario 
ingresar un número del 1 al 3 para seleccionar una figura geométrica: 1 para círculo, 
2 para cuadrado y 3 para triángulo. Después, solicitará al usuario los datos necesarios 
para calcular el área de la figura seleccionada. Estos datos serán:
Para el círculo: el radio.
Para el cuadrado: el lado.
Para el triángulo: la base y la altura.
Finalmente, el programa mostrará en pantalla el área correspondiente a la figura seleccionada.
*/

import java.util.Scanner;

public class SeleccionFiguraGeometrica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double PI = 3.141592D;
        System.out.println("-----------------------------------------------------------");
        System.out.println("*******************SELECCIÓN DE OPCIÓN*********************");
        System.out.println("-----------------------------------------------------------");
        System.out.println("Opción 1: Círculo: ");
        System.out.println("Opción 2: Cuadrado: ");
        System.out.println("Opción 3: Triángulo: ");
        System.out.print("Ingrese una opción del 1 al 3: ");
        int opcionUsuario = scanner.nextInt();
        double area = 0;
        String resultado = switch (opcionUsuario) {
            case 1-> {
                System.out.print("Ingrese el valor del radio del círculo: ");
                double radio = scanner.nextDouble();
                area=PI*radio*radio;
                yield "El área del círculo es "+area;
            }
            case 2 ->{
                System.out.print("Ingrese el valor del lado del cuadrado: ");
                double lado = scanner.nextDouble();
                area = lado*lado;
                yield "El área del cuadrado es "+area;
            }
            case 3 ->{
                System.out.print("Ingrese el valor de la base triangulo: ");
                double base = scanner.nextDouble();
                System.out.print("Ingrese el valor de la altura del triangulo: ");
                double altura = scanner.nextDouble();
                area = (base*altura)/2;
                yield "El área del triángulo es "+area;
            }
            default ->"La opción ingresada no es válida.";
        };
        System.out.println("Resultado: "+resultado);
        scanner.close();
    }
}
