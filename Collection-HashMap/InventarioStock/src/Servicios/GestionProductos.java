package Servicios;

import java.util.HashMap;

public class GestionProductos {
    private HashMap<String, Integer> listaProductos;

    public GestionProductos() {
        listaProductos = new HashMap<>();
    }

    public HashMap<String, Integer> getListaProductos() {
        return listaProductos;
    }

    public void agregarProducto(String nombre,Integer cantidad){
        if(!existeProducto(nombre)){
            listaProductos.put(nombre,cantidad);
            System.out.println("Se agregó el nuevo producto al inventario.");
        }else{
            System.out.println("El producto ya existe en el inventario, no se admiten duplicados");
        }
    }

    public void actualizarStock(String nombre, Integer nuevostock){
        if(existeProducto(nombre)){
            listaProductos.replace(nombre, nuevostock);
            System.out.println("Se actualizó el stock del producto.");
        }else{
            System.out.println("El producto no se encuentra en el inventario: ");
        }
    }

    public int obtenerStock (String nombre){
        return listaProductos.getOrDefault(nombre, -1);
    }

    public boolean existeProducto(String nombre){
        return listaProductos.containsKey(nombre);
    }

    public void mostrarInventario(){
        if(!listaProductos.isEmpty()){
            System.out.println("-------------------------------");
            System.out.printf("%-20s %-10s\n","| PRODUCTO", "| STOCK");
            System.out.println("-------------------------------");
            for(String s : listaProductos.keySet()){
                System.out.printf("%-20s %-10s\n","| "+s, "| "+listaProductos.get(s).toString());
            }
            //listaProductos.get(s)
            System.out.println("-------------------------------");
        }else{
            System.out.println("\nEl inventario está vacío. No hay productos registrados");
        }
    }
}
