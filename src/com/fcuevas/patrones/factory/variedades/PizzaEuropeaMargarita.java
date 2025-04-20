package com.fcuevas.patrones.factory.variedades;

import com.fcuevas.patrones.factory.PizzaProducto;

public class PizzaEuropeaMargarita extends PizzaProducto {

    public PizzaEuropeaMargarita() {
        super();
        this.nombre = "Pizza Europea Margarita";
        this.masa = "Masa Normal a la Piedra";
        this.salsa = "Salsa de Tomate Orgánico";
        this.ingredientes.add("\t\t* Queso Mozzarella");
        this.ingredientes.add("\t\t* Tomate Cherry");
        this.ingredientes.add("\t\t* Queso Chamembert");
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
