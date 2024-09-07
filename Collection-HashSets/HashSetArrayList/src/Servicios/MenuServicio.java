package Servicios;
import Modelo.Contacto;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuServicio {
    GestorDeContactos gestor = new GestorDeContactos();
    static Scanner scanner = new Scanner(System.in);

    public void mostrarMenu(){
        int opcion;
        do {
            System.out.println("╔════════════════════════════════╗");
            System.out.println("║       GESTOR DE CONTACTOS      ║");
            System.out.println("╚════════════════════════════════╝");
            System.out.println("1. Agregar contacto al ArrayList.");
            System.out.println("2. Eliminar contacto del ArrayList.");
            System.out.println("3. Agregar contacto al HashSet.");
            System.out.println("4. Eliminar contacto del HashSet.");
            System.out.println("5. Mostrar contactos ArrayList.");
            System.out.println("6. Mostrar contactos HashSet.");
            System.out.println("7. Salir de la Aplicación.");
            opcion = getNumero("una opción [1-5]: ");
            switch (opcion) {
                case 1:
                    String nombreContacto = getTexto("su nombre: ");
                    String numeroContacto = getTexto("su numero: ");
                    String correoContacto = getTexto("su correo: ");
                    Contacto nuevoContacto = new Contacto(nombreContacto, numeroContacto, correoContacto);
                    System.out.println((gestor.agregarContactoArrayList(nuevoContacto)) ?
                            "Se agregó el nuevo contacto exitosamente!." :
                            "No se pudo agregar el contacto debido a que ya existe");
                    gestor.mostrarArrayList();
                    break;
                case 2:
                    String nombreEliminar = getTexto("su nombre: ");
                    Contacto contactoEliminar = new Contacto(nombreEliminar, "", "");
                    System.out.println((gestor.eliminarContactoArrayList(contactoEliminar)) ?
                            "Se eliminó el contacto exitosamente!.":
                            "No se pudo eliminar el contacto debido a que no existe o el listado esta vacío");
                    gestor.mostrarArrayList();
                    break;
                case 3:
                    String nombreContact = getTexto("su nombre: ");
                    String numeroContact = getTexto("su numero: ");
                    String correoContact = getTexto("su correo: ");
                    Contacto nuevoContact = new Contacto(nombreContact, numeroContact, correoContact);
                    System.out.println((gestor.agregarContactoHashSet(nuevoContact)) ?
                            "Se agregó el nuevo contacto exitosamente!." :
                            "No se pudo agregar el contacto debido a que ya existe");
                    gestor.mostrarHashSet();
                    break;
                case 4:
                    String nombreContactoBorrar = getTexto("su nombre: ");
                    Contacto contactoHashEliminar = new Contacto(nombreContactoBorrar, "", "");
                    System.out.println((gestor.eliminarContactoHashSet(contactoHashEliminar)) ?
                            "Se eliminó el contacto exitosamente!.":
                            "No se pudo eliminar el contacto debido a que no existe o el listado esta vacío");
                    gestor.mostrarHashSet();
                    break;
                case 5:
                    gestor.mostrarArrayList();
                    break;
                case 6:
                    gestor.mostrarHashSet();
                    break;
                case 7:
                    System.out.println("Sesión Finalizada.");
                    break;
                default:
                    System.out.println("El valor ingresado no es válido.");
                    break;
            }
        }while(opcion!=7);
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
