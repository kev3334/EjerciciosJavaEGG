/*
Generando un número aleatorio entre dos límites
Escribe un programa en el que se cree una variable de tipo array que contenga seis elementos de tipo entero.
El programa debe contar la cantidad de elementos pares presentes en el array y mostrar el resultado por
consola utilizando solo las herramientas aprendidas hasta el momento.
*/

public class ContadorElementosParesArray {

    public static void main(String[] args) {
        int[] elementos = {2,8,6,10,12,4};
        int contador=0;
        for (int i=0; i<elementos.length;i++){
            if(elementos[i] % 2 == 0){
                contador++;
            }
        }
        System.out.println("-----------------------------------------------------------");
        System.out.println("*************CONTADOR DE PARES DE UN ARRAY*****************");
        System.out.println("-----------------------------------------------------------");
        System.out.println("RESULTADO: La cantidad de elementos pares del array es: "+contador);
    }
}