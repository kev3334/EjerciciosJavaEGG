import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner miScanner = new Scanner(System.in);
        System.out.println("Ingrese el primer número: ");
        double numero1 = miScanner.nextInt();
        System.out.println("Ingrese el segundo número: ");
        double numero2 = miScanner.nextInt();
        System.out.println("\n*************Calculadora******************");
        System.out.println("\n1.Sumar\n2.Restar\n3.Multiplicar\n4.Dividir\nIngrese una opción del 1 al 4");
        int operacion= miScanner.nextInt();
        double resultado;
        switch (operacion) {
            case 1:
                resultado= numero1+numero2;
                System.out.println("El resultado es: "+resultado);
                break;
            case 2:
                resultado= numero1-numero2;
                System.out.println("El resultado es: "+resultado);
                break;
            case 3:
                resultado= numero1*numero2;
                System.out.println("El resultado es: "+resultado);
                break;
            case 4:
                resultado= numero1/numero2;
                System.out.println("El resultado es: "+resultado);
                break;                        
            default:
                System.out.println("La opción ingresada no es válida");
                break;
        }
        miScanner.close();
    }
}
