import java.util.Scanner;

/*
* Ejercicio: “Adivinando un número” Escribe un programa que genere un número aleatorio entre 1 y 20,
* y muestra por consola un mensaje pidiéndote que adivines ese número utilizando un bucle do-while.
* El programa te indicará si el número que ingresas es mayor o menor que el número aleatorio, y seguirá pidiéndote
* que adivines hasta que lo hagas correctamente.
*
* Basándose en el ejercicio que ya has realizado, crea un método "numeroAleatorio()" que reciba por parámetro dos variables de tipo "int":
* un número máximo y un número mínimo. El método debe generar y devolver un número aleatorio dentro del rango especificado.
*
*
* */
public class AdivinaElNumero {
    public static void main(String[] args) {
        int numeroMaquina = numeroAleatorio(5,20);
        boolean acertaste=false;
        do{
            Scanner scanner = new Scanner(System.in);
            System.out.println("╔═══════════════════════════════╗");
            System.out.println("║       ADIVINA EL NÚMERO       ║");
            System.out.println("╚═══════════════════════════════╝");
            System.out.print("Ingresa el número que crees es el correcto (1-20): ");
            int numeroUsuario = 0;
            try {
                numeroUsuario = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Erro: Valor ingresado no válido.");
            }
            if(numeroUsuario==numeroMaquina){
                acertaste=true;
                System.out.println("Adivinaste el número.");
            }else if (numeroUsuario<numeroMaquina){
                System.out.println("El número que ingresaste es menor que el número que elegí");
            }else{
                System.out.println("El número que ingresaste es mayor que el número que elegí");
            }
        }while(!acertaste);
    }
    public static int numeroAleatorio(int numeroMinimo, int numeroMaximo){
        return ((int)(Math.random()*(numeroMaximo-numeroMinimo+1)))+numeroMinimo;

    }
}
