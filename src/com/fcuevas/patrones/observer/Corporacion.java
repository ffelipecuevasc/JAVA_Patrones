package com.fcuevas.patrones.observer;

public class Corporacion extends Observable{

    private String nombre;
    private Integer precio;

    public Corporacion(String nombre, Integer precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void modificarPrecio(Integer precio){
        this.precio = precio;
        notificarObservadores();
    }

    @Override
    public String toString() {
        return getNombre() +
                " nuevo precio $" +
                getPrecio();
    }
}
