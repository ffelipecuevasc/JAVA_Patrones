package com.fcuevas.patrones.factory.variedades;

import com.fcuevas.patrones.factory.PizzaProducto;

public class PizzaAmericanaPeperoni extends PizzaProducto {

    public PizzaAmericanaPeperoni(){
        super();
        this.nombre = "Pizza Americana Peperoni";
        this.masa = "Masa Normal a la Piedra";
        this.salsa = "Salsa de Tomate";
        this.ingredientes.add("\t\t* Queso Mozzarella");
        this.ingredientes.add("\t\t* Tomate");
        this.ingredientes.add("\t\t* Peperoni");
        this.ingredientes.add("\t\t* Aceitunas");
    }

    @Override
    public void cocinar() {
        System.out.println("\t- Cocinando la pizza por 40 minutos a 110°.");
    }

    @Override
    public void cortar() {
        System.out.println("\t- Cortando la pizza en rebanadas triangulares.");
    }
}
