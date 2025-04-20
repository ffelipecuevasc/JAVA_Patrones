package com.fcuevas.patrones.factory;

public abstract class PizzeriaAbstractFactory {

    public PizzaProducto ordenarPizza(String tipo){
        PizzaProducto pizza = crearPizza(tipo);
        System.out.println("\t- Creando la pizza = " + pizza.nombre);
        pizza.preparar();
        pizza.cocinar();
        pizza.cortar();
        pizza.empacar();
        return pizza;
    }

    public abstract PizzaProducto crearPizza(String tipo);
}
