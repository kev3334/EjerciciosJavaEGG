package main.servicios;

import main.modelo.Reserva;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GestionMenuServicio {
    private static Scanner scanner = new Scanner(System.in);
    private SistemaGestionReservas gestor = new SistemaGestionReservas();

    public void mostrarMenu(){
        int opcion;
        do{
            System.out.println("╔═══════════════════════════════════════════╗");
            System.out.println("║       SISTEMA DE GESTIÓN DE RESERVAS      ║");
            System.out.println("╚═══════════════════════════════════════════╝");
            System.out.println("1. Agregar una nueva reserva.");
            System.out.println("2. Buscar una reserva.");
            System.out.println("3. Actualizar los datos de una reserva.");
            System.out.println("4. Eliminar una reserva");
            System.out.println("5. Mostrar el estado actual del Sistema de Gestión de Reservas.");
            System.out.println("6. Salir de la Aplicación.");
            opcion = getNumero("una opción [1-6]: ");
            switch (opcion){
                case 1:
                    String idNuevaReserva = getTexto("el identificador de la reserva: ");
                    String dateNuevaReserva = getTexto("la fecha de la reserva con el sgte formato (DD/MM/AAAA): ");
                    String nameNuevaReserva = getTexto("el nombre de la persona responsable de la reserva: ");
                    gestor.agregarReserva(idNuevaReserva, new Reserva(idNuevaReserva, dateNuevaReserva, nameNuevaReserva));
                    break;
                case 2:
                    String idBuscar = getTexto("el identificador de la reserva a buscar: ");
                    Reserva reservaBuscada = gestor.obtenerReserva(idBuscar);
                    System.out.println(reservaBuscada==null ? "No hay reserva registrada con ese identificador." : "Reserva encontrada: "+reservaBuscada);
                    break;
                case 3:
                    String idActualizar = getTexto("el identificador de la reserva a actualizar: ");
                    String dateActualizar = getTexto("la fecha de la nueva reserva con el sgte formato (DD/MM/AAAA): ");
                    String nameActualizar = getTexto("el nombre de la persona responsable de la nueva reserva: ");
                    gestor.actualizarReserva(idActualizar, new Reserva(idActualizar, dateActualizar, nameActualizar));
                    break;
                case 4:
                    String idEliminar = getTexto("el identificador de la reserva a eliminar: ");
                    gestor.eliminarReserva(idEliminar);
                    break;
                case 5:
                    gestor.mostrarEstadoSistema();
                    break;
                case 6:
                    System.out.println("Finalizando Sesión ....");
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
