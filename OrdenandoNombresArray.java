/* Ordenando Nombres Alfabéticamente
Desarrolla un programa que pida al usuario ingresar 4 nombres. Estos nombres serán ordenados
alfabéticamente y posteriormente impresos en la consola. Es esencial emplear exclusivamente 
las herramientas aprendidas hasta el momento. */
import java.util.Scanner;

public class OrdenandoNombresArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] listaNombres = new String[4];
        System.out.println("-----------------------------------------------------------");
        System.out.println("******************ORDENADOR DE NOMBRES*********************");
        System.out.println("-----------------------------------------------------------");
        for(int i=0; i<listaNombres.length;i++){
            System.out.print("Ingrese el nombre número "+(i+1)+": ");
            listaNombres[i] = scanner.next();
        }
        String cambio;
        for(int j=0; j<listaNombres.length;j++){
            for(int k=j+1; k<listaNombres.length;k++){
                if(listaNombres[j].compareTo(listaNombres[k])>0 ){
                    cambio=listaNombres[j];
                    listaNombres[j]=listaNombres[k];
                    listaNombres[k]=cambio;
                }
            }
        }
        System.out.println("\nLos nombres ordenados alfabeticamente son: ");
        for(int i=0; i<listaNombres.length;i++){
            System.out.println((i+1)+". "+listaNombres[i]);
        }
        scanner.close();
    }
}
