import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        Scanner miScanner = new Scanner(System.in);
        System.out.println("Ingrese la tamaño de la base del triangulo");
        int tamanio = miScanner.nextInt();
        int limite=tamanio/2;
        String cadena ="*";
        String espacio =" ";
        for (int i=0; i<(tamanio/2)+1; i++){
            
            for(int j=(limite); j>0 ; j--){
                System.out.print(espacio);
            }
            for (int k=0; k<(i+(i+1)); k++){
                //cadena="*"+cadena;
                System.out.print(cadena);
            }
            System.out.println("\n");
            limite--;
        }
        miScanner.close();
    }
}
