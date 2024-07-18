/* 
Sumando elementos en posiciones pares
Desarrolla un programa que cree un array de tamaño 5 que almacene números enteros. Luego, 
suma los elementos ubicados en las posiciones pares del array (es decir, las posiciones 0, 2 y 4) 
y muestra por consola el resultado de la suma. Utiliza exclusivamente las herramientas aprendidas hasta el momento.
*/
public class SumandoParesArray {
    public static void main(String[] args) {
        
        int[] elementos = {3,8,6,10,9};
        int sumador=0;
        for (int i=0; i<elementos.length;i++){
            if(i % 2 == 0){
                sumador+=elementos[i];
            }
        }
        System.out.println("------------------------------------------------------");
        System.out.println("*******SUMADOR DE POSICIONES PARES DE UN ARRAY********");
        System.out.println("------------------------------------------------------");
        System.out.println("RESULTADO: La suma de elementos ubicados en una posicion par del array es: "+sumador);
    }
}
