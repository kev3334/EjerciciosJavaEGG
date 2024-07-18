/* 
Rellenando un arreglo de manera personalizada
-Escribe un programa en Java que realice lo siguiente:
    Solicita al usuario un tamaño para un arreglo.
    Luego, pídele que ingrese un número con el que desea rellenar el array.
    Solicita el índice hasta el cual quiere rellenar el array con el número anterior.
    El array deberá ser rellenado con el número proporcionado hasta el índice ingresado por el usuario.
-Asegúrate de validar lo siguiente:
    La primera vez que se pide al usuario un número para rellenar el arreglo, el índice inicial debe ser 0.
    Si el índice ingresado no es el índice del último elemento del arreglo, el programa debe continuar 
    pidiendo al usuario nuevos números e índices para rellenar el arreglo.
    El índice siempre debe ser menor que el tamaño total del arreglo.
Cada vez que se solicita un nuevo número para rellenar el arreglo, el índice ingresado debe ser mayor que el
último índice ingresado; a su vez, se debe rellenar el array con el nuevo número desde el índice anterior hasta el nuevo índice.
-Por último, el programa debe imprimir por consola el arreglo completo.
*/

import java.util.Arrays;
import java.util.Scanner;

public class RellenandoArreglo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("-----------------------------------------------------------");
        System.out.println("************RELLENANDO UN ARREGLO PERSONALIZADO************");
        System.out.println("-----------------------------------------------------------");
        System.out.println("\t\tArray [1,2,4,5]\t\tTamaño Array: 4");
        System.out.println("\tElementos \t\tÍndices");
        System.out.println("\t1\t\t\t0");
        System.out.println("\t2\t\t\t1");
        System.out.println("\t4\t\t\t2");
        System.out.println("\t5\t\t\t3");
        System.out.print("Ingrese el tamaño del array a crear: ");
        int tamanioArray = scanner.nextInt();
        int[] arrayNumeros = new int[tamanioArray];
        int indiceFinalRelleno=0;
        int indiceInicial=0;
        System.out.println("\nRellenando el array: ");
        do{
            System.out.print("Ingrese un número con el que desea rellenar el array: ");
            int numeroElemento = scanner.nextInt();
            boolean indiceInvalido=true;
            
            
            while(indiceInvalido){
                System.out.print("Ingrese el índice hasta el cual quiere rellenar el array con el número "+numeroElemento+": ");
                indiceFinalRelleno = scanner.nextInt();
                indiceInvalido = (indiceFinalRelleno<arrayNumeros.length && indiceFinalRelleno>indiceInicial) ? false : true;
                String mensajeError = (indiceInvalido) ? "\nEl índice supera el tamaño del array-el índice tiene que ser mayor!" : "";
                System.out.println(mensajeError);
            }
            if(arrayNumeros[0]==0){
                Arrays.fill(arrayNumeros, 0, (indiceFinalRelleno+1), numeroElemento);
                indiceInicial=indiceFinalRelleno+1;
            }else{
                Arrays.fill(arrayNumeros, indiceInicial, (indiceFinalRelleno+1), numeroElemento);
                indiceInicial=indiceFinalRelleno+1;
            }
            
        }while((indiceFinalRelleno+1)!=arrayNumeros.length);
        System.out.println("\nResultado: "+Arrays.toString(arrayNumeros));
        scanner.close();

    }   
}
