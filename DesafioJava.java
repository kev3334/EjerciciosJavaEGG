import java.util.Scanner;

public class DesafioJava {
    public static void main(String[] args) {
        Scanner miScanner = new Scanner(System.in);
        try{
            while(true){
                
                System.out.println("\nIngrese el número: ");
                int numero = miScanner.nextInt();

                String resultado = (numero % 2 == 0) ? "Par" : "Impar";
                System.out.println("El número es " + resultado);

            }
        }finally{
            miScanner.close();
        }
        
    }
}
