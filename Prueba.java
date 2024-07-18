import java.util.Scanner;

public class Prueba {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

        //System.out.print("Ingrese un número real: ");

        //int numeroLimite = scanner.nextInt();

        //int random = (int)(Math.random()*numeroLimite) + 1;
        int random = 4;
        double raiz = Math.sqrt(random);

        boolean esPrimo = true;

        for ( int i= 2; i<random; i++) {
            if (random % i == 0) {
                esPrimo = false;
            }
        }

        if (esPrimo && random > 1) {
            System.out.println("El número aleatorio " + random + " es primo y su raíz cuadrada es: " + raiz);
        } else {
            System.out.println("El número aleatorio " + random + " no es primo y su raíz cuadrada es " + raiz);
        }
        
        scanner.close();
    }
}
