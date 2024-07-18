/* 
Contar ocurrencias
Escribe un programa que cree un array de 50 elementos de tipo carácter, inicializándolo con una frase elegida.
Luego, solicita al usuario un carácter objetivo y cuenta cuántas veces aparece ese carácter en el array.
Finalmente, imprime el resultado por consola.
Por ejemplo, si el array contiene la siguiente frase:
a	p	r	e	n	d	i	e	n	d	o		j	a	v	a
y el usuario ingresa el carácter 'd', el programa debería devolver la siguiente salida:
El carácter "d" aparece 2 veces.
Si el usuario ingresa el carácter 'z', el programa debería devolver la siguiente salida:
El carácter "z" no aparece en la frase.
*/

import java.util.Scanner;

public class ContarOcurrencias {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("-----------------------------------------------------------");
        System.out.println("*****************CONTADOR DE OCURRENCIAS*******************");
        System.out.println("-----------------------------------------------------------");
        System.out.print("Ingrese un texto o frase: ");
        String textoUsuario = scanner.nextLine();
        char[] arrayTexto = textoUsuario.toCharArray();
        System.out.print("Ingrese el caracter que desea contar: ");
        char caracterObjetivo = scanner.next().charAt(0);
        int contador=0;
        for(char elemento:arrayTexto){
            if(elemento==caracterObjetivo){
                contador++;
            }
        }
        String resultado = (contador>0) ? "El caracter "+caracterObjetivo+" aparece "+contador+" veces." : "El carácter "+caracterObjetivo+" no aparece en la frase.";
        System.out.println(resultado);
        scanner.close();
    }
}
