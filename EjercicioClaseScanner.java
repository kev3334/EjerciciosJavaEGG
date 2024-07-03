/* ✏️  Actividad: Usando la Clase Scanner 
Para entender mejor el concepto de esta clase, practicarás con los siguientes ejercicios: 

1. Solicita al usuario que ingrese su nombre (cadena de texto), guárdalo en una variable e imprime el dato por consola..
2. Solicita al usuario que ingrese su edad (número), guárdalo en una variable e imprime el dato por consola..
3. Luego imprime en pantalla un mensaje que diga “Su nombres es [nombre del usuario] y su edad es [edad del usuario]”.
 */
//import java.util.Scanner;
import javax.swing.JOptionPane;

public class EjercicioClaseScanner {
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);

        //System.out.print("\nIngrese su nombre: ");
        //String nombreUsuario= scanner.nextLine();
        String nombreUsuario = JOptionPane.showInputDialog(null, "Ingresa tu nombre:");
        //System.out.println("Usuario: "+nombreUsuario);
        //System.out.print("Ingrese su edad: ");
        //int edadUsuario = scanner.nextInt();
        String edadUsuario = JOptionPane.showInputDialog(null, "Ingresa tu edad:");
        //System.out.println("Edad: "+edadUsuario+" años");
        JOptionPane.showMessageDialog(null, "Su nombres es "+nombreUsuario+" y su edad es "+edadUsuario+" años");
        //System.out.println("Su nombres es "+nombreUsuario+" y su edad es "+edadUsuario+" años");

        //scanner.close();
    }
}
