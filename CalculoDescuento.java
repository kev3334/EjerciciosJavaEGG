/* 
2. Cálculo de Descuento:
En este ejercicio, desarrollarás un programa que solicitará al usuario el precio de un producto 
y determinará si tiene derecho a un descuento. Si el precio es igual o mayor a $100, 
se aplicará un descuento del 10% y se mostrará el nuevo precio con descuento. De lo contrario, 
se mostrará el precio original sin descuento. 
*/

import java.util.Scanner;

public class CalculoDescuento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("-----------------------------------------------------------");
        System.out.println("****************CALCULADORA DE DESCUENTOS******************");
        System.out.println("-----------------------------------------------------------");
        System.out.print("Ingrese el precio del producto: ");
        double precioProducto = scanner.nextDouble();
        double descuentoProducto=0;

        if(precioProducto>0){
            if (precioProducto>=100){
                descuentoProducto=0.10*precioProducto;
            }
        }else{
            System.out.println("El precio ingresado no es válido.");
        }
        System.out.println("Precio del producto: "+precioProducto+" soles.");
        System.out.println("Descuento: "+descuentoProducto+" soles.");
        System.out.println("Precio final del producto: "+(precioProducto-descuentoProducto)+" soles.");
        scanner.close();

        
    }
}
