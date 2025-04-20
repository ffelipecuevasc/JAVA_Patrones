package com.fcuevas.patrones.observer;

public class PrincipalObserver {
    public static void main(String[] args) {
        Corporacion google = new Corporacion("Google", 1000);
        google.agregarObservadores(observable -> {
            System.out.println("John: " + observable);
        });

        google.agregarObservadores(observable -> {
            System.out.println("Andrés: " + observable);
        });

        google.agregarObservadores(observable -> {
            System.out.println("Maria: " + observable);
        });
        google.modificarPrecio(2000);
        google.modificarPrecio(2500);
    }
}
