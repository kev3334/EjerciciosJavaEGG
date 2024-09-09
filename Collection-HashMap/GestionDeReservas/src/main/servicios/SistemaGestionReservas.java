package main.servicios;

import main.modelo.Reserva;

import java.util.HashMap;

public class SistemaGestionReservas {
    HashMap<String, Reserva> listaReservas;

    public SistemaGestionReservas(){
        listaReservas = new HashMap<>();
    }

    public void agregarReserva(String id, Reserva reserva){
        if(!listaReservas.containsKey(id)){
            //validar no fecha duplicado
            boolean fechaduplicado = false;
            for(Reserva r : listaReservas.values() ){
                if(r.getFecha().equals(reserva.getFecha())){
                    fechaduplicado=true;
                    break;
                }
            }
            if(fechaduplicado){
                System.out.println("No se pudo registrar su reserva debido a que la reserva ya se encuentra ocupada para esta fecha.");
            }else{
                listaReservas.put(id, reserva);
                System.out.println("La reserva ha sido registrada con éxito.");
            }
        }else{
            System.out.println("La reserva ya ha sido registrada y no se admiten duplicados.");
        }
    }

    public void actualizarReserva(String id, Reserva reserva){
        if(listaReservas.containsKey(id)){
            //validar fecha no duplicada
            boolean fechaduplicado = false;
            for(Reserva r : listaReservas.values() ){
                if(r.getFecha().equals(reserva.getFecha())){
                    fechaduplicado=true;
                    break;
                }
            }
            if(fechaduplicado){
                System.out.println("No se pudo actualizar su reserva debido a que la reserva ya se encuentra ocupada para esta fecha.");
            }else{
                listaReservas.replace(id,reserva);
                System.out.println("La reserva ha sido actualizada con éxito.");
            }
        }else{
            System.out.println("No se ha podido actualizar debido a que la reserva no existe");
        }
    }

    public Reserva obtenerReserva(String id){
        return listaReservas.get(id);
    }

    public void eliminarReserva(String id){
        if(listaReservas.containsKey(id)){
            listaReservas.remove(id);
            System.out.println("Se ha eliminado la reserva.");
        }else{
            System.out.println("No se puede eliminar, debido a que no la reserva no existe");
        }
    }

    public void mostrarEstadoSistema(){
        System.out.println("------------------------------------------");
        System.out.printf("%-10s %-10s %-20s\n","| ID","| FECHA","| RESERVANTE");
        System.out.println("------------------------------------------");
        for(String s : listaReservas.keySet()){
            System.out.printf("%-10s %-10s %-20s\n","| "+s,"| "+listaReservas.get(s).getFecha(),"| "+listaReservas.get(s).getReservante());
        }
        System.out.println("------------------------------------------");
        System.out.printf("%-10s\n","| TOTAL: "+listaReservas.size());
        System.out.println("------------------------------------------");
    }
}
