/* 
Pide al usuario que ingrese el valor de la base y de la altura de un rectángulo.
Almacena estos valores en variables previamente declaradas llamadas baseRectangulo y alturaRectangulo, respectivamente.
Calcula y almacena el perímetro del rectángulo utilizando la fórmula: Perímetro = 2 × base + 2 × altura.
Muestra el resultado del perímetro por consola junto con un mensaje adecuado.
Calcula y almacena el área del rectángulo utilizando la fórmula: Área = base × altura.
Muestra el resultado del área por consola junto con un mensaje adecuado.

💡 Recuerda: Al declarar las variables, ten en cuenta si los valores ingresados por el usuario pueden ser decimales. 
En tal caso, debes utilizar variables de tipo flotante o doble para garantizar una precisión decimal adecuada.

*/

import java.util.Scanner;

public class CalculoAreaPerimetro {
    public static void main(String[] args) {
        float baseRectangulo,alturaRectangulo,perimetroRectangulo,areaRectangulo;
        Scanner scanner = new Scanner(System.in);

        System.out.println("------------------------------------------------------------");
        System.out.println("***************CALCULADORA AREA Y PERIMETRO*****************");
        System.out.println("------------------------------------------------------------");
        System.out.print("Ingrese el valor de la base del rectángulo: ");
        baseRectangulo = scanner.nextFloat();
        System.out.print("Ingrese el valor de la altura del rectángulo: ");
        alturaRectangulo = scanner.nextFloat();
        perimetroRectangulo = 2*(baseRectangulo+alturaRectangulo);
        areaRectangulo = baseRectangulo*alturaRectangulo;
        System.out.println("El perímetro del rectángulo es: "+perimetroRectangulo);
        System.out.println("El área del rectándulo es: "+areaRectangulo);

        scanner.close();

    }
}
