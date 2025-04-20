package com.fcuevas.patrones.factory;

import com.fcuevas.patrones.factory.variedades.PizzaAmericanaItaliana;
import com.fcuevas.patrones.factory.variedades.PizzaAmericanaPeperoni;
import com.fcuevas.patrones.factory.variedades.PizzaAmericanaVegetariana;

public class PizzeriaAmericanaFactory extends PizzeriaAbstractFactory{

    @Override
    public PizzaProducto crearPizza(String tipo) {
        PizzaProducto producto = null;
        switch (tipo){
            case "Vegetariana":
                producto = new PizzaAmericanaVegetariana();
                break;
            case "Peperoni":
                producto = new PizzaAmericanaPeperoni();
                break;
            case "Italiana":
                producto = new PizzaAmericanaItaliana();
                break;
        }
        return producto;
    }
}
