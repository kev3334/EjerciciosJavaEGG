package Servicios;
import Modelo.Contacto;

import java.util.ArrayList;
import java.util.HashSet;

public class GestorDeContactos {
    private ArrayList<Contacto> listaContactos = new ArrayList<>();
    private HashSet<Contacto> setContactos = new HashSet<>();

    public boolean agregarContactoArrayList(Contacto nuevoContacto){
        //no permitir contactos duplicados
        if(!listaContactos.isEmpty()){
            boolean duplicado = false;
            for(Contacto c : listaContactos){
                if (nuevoContacto.equals(c)) {
                    duplicado = true;
                    break;
                }
            }
            if(!duplicado){
                listaContactos.add(nuevoContacto);
                return true;
            }else{
                return false;
            }
        }else{
            return listaContactos.add(nuevoContacto);
        }
    }

    public boolean eliminarContactoArrayList(Contacto contacto){
        //eliminar en caso el contacto existe
        if(!listaContactos.isEmpty()){
            boolean existe = false;
            for(Contacto c : listaContactos){
                if (contacto.getNombre().equals(c.getNombre())) {
                    existe = true;
                    listaContactos.remove(c);
                    break;
                }
            }
            return existe;
        }else{
            return false;
        }
    }

    public boolean agregarContactoHashSet(Contacto nuevoContacto){
        return setContactos.add(nuevoContacto);
    }

    public boolean eliminarContactoHashSet(Contacto contacto){
        //eliminar en caso el contacto existe
        if(!setContactos.isEmpty()){
            boolean existe = false;
            for(Contacto c : setContactos){
                if (contacto.equals(c)) {
                    existe = true;
                    setContactos.remove(c);
                    break;
                }
            }
            return existe;
        }else{
            return false;
        }
    }

    public void mostrarArrayList(){
        if(!listaContactos.isEmpty()){
            System.out.println("\n------------------------------");
            System.out.println("Lista de Contactos <ArrayList>");
            System.out.println("------------------------------");
            for(Contacto c : listaContactos){
                System.out.println(c.getNombre()+" "+c.getNumeroTelefono()+" "+c.getCorreo());
            }
            System.out.println("------------------------------\n");
        }else{
            System.out.println("El ArrayList Esta vacío.");
        }
    }

    public void mostrarHashSet(){
        if(!setContactos.isEmpty()){
            System.out.println("\n------------------------------");
            System.out.println("Lista de Contactos <HashSet>");
            System.out.println("------------------------------");
            for(Contacto c : setContactos){
                System.out.println(c.getNombre()+" "+c.getNumeroTelefono()+" "+c.getCorreo());
            }
            System.out.println("------------------------------\n");
        }else{
            System.out.println("El ArrayList Esta vacío.");
        }
    }

}
