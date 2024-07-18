/*
Invertir un array
Escribe un programa que recorra un array de enteros y lo invierta, es decir, que el primer elemento
se convierta en el último y viceversa, luego imprime el array resultante por consola.  
El tamaño y los números  a contener pueden ser de tu elección.
IMPORTANTE: Debes invertir de forma permanente el orden de los elementos. Analiza si necesitas
hacer uso de elementos auxiliares para concluir el ejercicio.
*/


public class InvertirArray {
    public static void main(String[] args) {
        System.out.println("-----------------------------------------------------------");
        System.out.println("**********************INVERTIR ARRAY***********************");
        System.out.println("-----------------------------------------------------------");
        int[] arrayNumeros = {2,6,8,3,7,1,9,7,1,4};
        int[] arrayInvertido = new int[arrayNumeros.length];
        int indice=0;
        for(int i=arrayNumeros.length-1;i>=0;i--){
            arrayInvertido[indice]=arrayNumeros[i];
            indice++;
        }
        System.out.print("Array Inicial: ");
        for(int elemento: arrayNumeros){
            System.out.print(" "+elemento);
        }
        System.out.print("\nArray Invertido: ");
        for(int elemento: arrayInvertido){
            System.out.print(" "+elemento);
        }

    }
}
