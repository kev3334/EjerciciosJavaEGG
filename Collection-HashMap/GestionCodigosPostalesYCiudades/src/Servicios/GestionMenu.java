package Servicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GestionMenu {
    private GestionCodigosPostales gestor;
    private Scanner scanner = new Scanner(System.in);

    public GestionMenu() {
        gestor = new GestionCodigosPostales();
    }

    public void mostrarMenu(){
        int opcion;
        do {
            System.out.println("╔═══════════════════════════════════════╗");
            System.out.println("║       GESTOR DE CODIGOS POSTALES      ║");
            System.out.println("╚═══════════════════════════════════════╝");
            System.out.println("1. Mostrar los datos existentes en el HashMap.");
            System.out.println("2. Agregar nueva Ciudad con su Código Postal.");
            System.out.println("3. Buscar Ciudad por su Código Postal.");
            System.out.println("4. Eliminar Ciudad del HashMap.");
            System.out.println("5. Actualizar Ciudad por Código Postal.");
            System.out.println("6. Salir de la Aplicación.");
            opcion = getNumero("una opción [1-6]: ");
            switch (opcion) {
                case 1:
                    gestor.mostrarListado();
                    break;
                case 2:
                    String codigo = getTexto("el Código Postal: ");
                    String ciudad = getTexto("el nombre de la ciudad: ");
                    gestor.agregarCiudad(codigo,ciudad);
                    break;
                case 3:
                    String codigoBuscar = getTexto("el Cógigo Postal de la ciudad que desea buscar: ");
                    gestor.buscarCiudad(codigoBuscar);
                    break;
                case 4:
                    String codigoEliminar = getTexto("el Cógigo Postal de la ciudad que desea eliminar: ");
                    gestor.eliminarCiudad(codigoEliminar);
                    break;
                case 5:
                    gestor.mostrarListado();
                    String codigoActualizar = getTexto("el Cógigo Postal de la ciudad que desea actualizar: ");
                    String ciudadActualizar = getTexto("el nombre de la nueva ciudad: ");
                    gestor.actualizarCiudad(codigoActualizar,ciudadActualizar);
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

    private int getNumero(String mensaje){
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

    public GestionCodigosPostales getGestor() {
        return gestor;
    }
}
