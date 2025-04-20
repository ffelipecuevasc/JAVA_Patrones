package com.fcuevas.patrones.factory;

import java.util.ArrayList;
import java.util.List;

public abstract class PizzaProducto {
    protected String nombre;
    protected String masa;
    protected String salsa;
    protected List<String> ingredientes;

    public PizzaProducto(){
        this.ingredientes = new ArrayList<String>();
    }

    public void preparar(){
        System.out.println("\t- Preparando nombre de la pizza = " + this.nombre);
        System.out.println("\t- Seleccionando la masa de la pizza = " + this.masa);
        System.out.println("\t- Agregando la salsa a la pizza = " + this.salsa);
        this.ingredientes.forEach(System.out::println);
    }

    public void empacar(){
        System.out.println("\t- Colocando la pizza en una caja para despacho.");
    }

    public abstract void cocinar();
    public abstract void cortar();

    @Override
    public String toString() {
        return "PizzaProducto{" +
                "nombre='" + nombre + '\'' +
                ", masa='" + masa + '\'' +
                ", salsa='" + salsa + '\'' +
                ", ingredientes=" + ingredientes +
                '}';
    }
}
