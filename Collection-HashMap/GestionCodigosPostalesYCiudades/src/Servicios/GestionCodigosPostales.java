package Servicios;

import java.util.HashMap;

public class GestionCodigosPostales {
    private HashMap<String,String> listaCodigosCiudades;

    public GestionCodigosPostales() {
        listaCodigosCiudades = new HashMap<>();
        listaCodigosCiudades.put("15001","lima");
        listaCodigosCiudades.put("04001", "arequipa");
        listaCodigosCiudades.put("13001", "trujillo");
        listaCodigosCiudades.put("14001", "chiclayo");
        listaCodigosCiudades.put("08001", "cusco");
        listaCodigosCiudades.put("07001", "callao");
        listaCodigosCiudades.put("20001", "piura");
        listaCodigosCiudades.put("12001", "huancayo");
        listaCodigosCiudades.put("21001", "puno");
        listaCodigosCiudades.put("16001", "iquitos");
    }

    public HashMap<String, String> getListaCodigosCiudades() {
        return listaCodigosCiudades;
    }

    public void mostrarListado(){
        if(!listaCodigosCiudades.isEmpty()){
            System.out.println("-----------------------------------------");
            System.out.printf("%-20s %-20s\n","| Código Postal","| Ciudad");
            System.out.println("-----------------------------------------");
            for(String s : listaCodigosCiudades.keySet()){
                System.out.printf("%-20s %-20s\n","| "+s,"| "+listaCodigosCiudades.get(s));
            }
            System.out.println("-----------------------------------------");
        }else{
            System.out.println("Listado sin registros");
        }
    }

    public void agregarCiudad(String codigo, String ciudad){
        listaCodigosCiudades.put(codigo,ciudad);
    }

    public void buscarCiudad(String codigo){
        boolean encontrado = false;
        for(String s : listaCodigosCiudades.keySet()){
            if(codigo.equals(s)){
                encontrado = true;
                System.out.println("La ciudad es: "+listaCodigosCiudades.get(s));
                break;
            }
        }
        System.out.println( encontrado ? "" : "El Código Postal ingresado no se encuentra registrado");
    }

    public void eliminarCiudad(String codigo){
        boolean encontrado = false;
        for(String s : listaCodigosCiudades.keySet()){
            if(codigo.equals(s)){
                encontrado=true;
                listaCodigosCiudades.remove(codigo);
                break;
            }
        }
        System.out.println( encontrado ? "Se eliminó la Ciudad" : "No se encontró el código postal ingresado");
    }

    public void actualizarCiudad(String codigo, String nuevaCiudad){
        boolean encontrado = false;
        for(String s : listaCodigosCiudades.keySet()){
            if(codigo.equals(s)){
                encontrado = true;
                listaCodigosCiudades.replace(codigo,nuevaCiudad);
                break;
            }
        }
        System.out.println( encontrado ? "Se actualizó la Ciudad" : "No se encontró el código postal ingresado");
    }

}
