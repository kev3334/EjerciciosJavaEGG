package main;

import main.servicios.GestionMenuServicio;

public class Aplication {
    public static void main(String[] args) {
        GestionMenuServicio menu = new GestionMenuServicio();
        menu.mostrarMenu();
    }
}