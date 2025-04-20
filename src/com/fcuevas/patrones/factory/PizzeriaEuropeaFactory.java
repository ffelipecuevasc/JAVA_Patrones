package com.fcuevas.patrones.factory;

import com.fcuevas.patrones.factory.variedades.*;

public class PizzeriaEuropeaFactory extends PizzeriaAbstractFactory{

    @Override
    public PizzaProducto crearPizza(String tipo) {
        PizzaProducto producto = null;
        switch (tipo){
            case "4 Quesos":
                producto = new PizzaEuropea4Quesos();
                break;
            case "Margarita":
                producto = new PizzaEuropeaMargarita();
                break;
            case "Napolitana":
                producto = new PizzaEuropeaNapolitana();
                break;
        }
        return producto;
    }
}
