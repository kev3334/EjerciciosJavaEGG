package Servicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GestionMenu {
    private GestionProductos gestor;
    private static Scanner scanner = new Scanner(System.in);

    public GestionMenu() {
        gestor = new GestionProductos();
    }

    public void mostrarMenu(){
        int opcion;
        do {
            System.out.println("╔══════════════════════════════════════════╗");
            System.out.println("║       GESTOR DE STOCK DE INVENTARIO      ║");
            System.out.println("╚══════════════════════════════════════════╝");
            System.out.println("1. Agregar producto al Inventario.");
            System.out.println("2. Verificar producto en Stock.");
            System.out.println("3. Obtener la cantidad en Stock de un producto.");
            System.out.println("4. Actualizar la cantidad de productos en Stock.");
            System.out.println("5. Mostrar Inventario.");
            System.out.println("6. Salir de la Aplicación.");
            opcion = getNumero("una opción [1-6]: ");
            switch (opcion) {
                case 1:
                    String nombreProducto = getTexto("el nombre del producto: ");
                    Integer cantidad;
                    do{
                        cantidad = getNumero("la cantidad en stock del producto: ");
                        if(cantidad<1)
                            System.out.println("Debe ingresar una cantidad mayor a cero.");
                    }while(cantidad<1);
                    gestor.agregarProducto(nombreProducto,cantidad);
                    break;
                case 2:
                    String nombreVerificar = getTexto("el nombre del producto a consultar: ");
                    System.out.println(gestor.existeProducto(nombreVerificar) ? "El producto "+nombreVerificar+" Sí " +
                            "se encuentra en el Inventario." : "El producto ingresado no se " +
                            "encuentra registrado en el Inventario.");
                    break;
                case 3:
                    String nombreProductoStock = getTexto("el nombre del producto que desea obtener su stock actual: ");
                    int cantidadStock= gestor.obtenerStock(nombreProductoStock);
                    System.out.println(cantidadStock == -1 ? "El producto no existe en el Inventario" :
                            "La cantidad de Stock del producto es: "+cantidadStock);
                    break;
                case 4:
                    String nombre = getTexto("el nombre del producto que desea actualizar el stock: ");
                    Integer nuevoStock;
                    do{
                        nuevoStock= getNumero("el nuevo valor del stock: ");
                        if(nuevoStock<1){
                            System.out.println("Debe ingresar una cantidad mayor a cero.");
                        }
                    }while(nuevoStock<1);
                    gestor.actualizarStock(nombre, nuevoStock);
                    break;
                case 5:
                    gestor.mostrarInventario();
                    break;
                case 6:
                    System.out.println("Sesión Finalizada.");
                    break;
                default:
                    System.out.println("El valor ingresado no es válido.");
                    break;
            }
        }while(opcion!=6);
    }



    public static int getNumero(String mensaje){
        boolean valido;
        int opcion=1;
        do {
            try {
                System.out.print("Ingrese "+mensaje);
                opcion = scanner.nextInt();
                valido = true;
                //scanner.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Error: Debe ingresar un número entero. Debe volver a intentarlo.");
                valido = false;
                scanner.nextLine();
            } catch (Exception e) {
                System.out.println("Error: Valor ingresado no válido.Debe volver a intentarlo.");
                valido = false;
                scanner.nextLine();
            }

        }while(!valido);
        scanner.nextLine();
        return opcion;
    }

    private String getTexto(String mensaje){
        boolean valido;
        String texto="";

        do {
            try {
                System.out.print("Ingrese "+ mensaje);
                texto=scanner.nextLine();
                valido = true;
                //scanner.nextLine();
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println("Error: Texto ingresado no válido.Debe volver a intentarlo.");
                valido = false;
                scanner.nextLine();
            }
        }while(!valido);
        return texto.toLowerCase().trim();

    }
}
