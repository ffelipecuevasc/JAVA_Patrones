package com.fcuevas.patrones.factory.variedades;

import com.fcuevas.patrones.factory.PizzaProducto;

public class PizzaAmericanaVegetariana extends PizzaProducto {

    public PizzaAmericanaVegetariana(){
        super();
        this.nombre = "Pizza Americana Vegetariana";
        this.masa = "Masa Integral Vegana";
        this.salsa = "Salsa de Tomate Orgánico";
        this.ingredientes.add("\t\t* Queso Vegano");
        this.ingredientes.add("\t\t* Tomate Cherry");
        this.ingredientes.add("\t\t* Aceitunas");
        this.ingredientes.add("\t\t* Albahaca");
    }

    @Override
    public void cocinar() {
        System.out.println("\t- Cocinando la pizza por 25 minutos a 150°.");
    }

    @Override
    public void cortar() {
        System.out.println("\t- Cortando la pizza en rebanadas cuadradas.");
    }
}
