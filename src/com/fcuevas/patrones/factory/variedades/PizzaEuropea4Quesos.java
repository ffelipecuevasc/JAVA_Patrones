package com.fcuevas.patrones.factory.variedades;

import com.fcuevas.patrones.factory.PizzaProducto;

public class PizzaEuropea4Quesos extends PizzaProducto {

    public PizzaEuropea4Quesos() {
        super();
        this.nombre = "Pizza Europea 4 Quesos";
        this.masa = "Masa Normal a la Piedra";
        this.salsa = "Salsa de Tomate";
        this.ingredientes.add("\t\t* Queso Mozzarella");
        this.ingredientes.add("\t\t* Queso Gouda");
        this.ingredientes.add("\t\t* Queso Azul");
        this.ingredientes.add("\t\t* Queso Chamembert");
        this.ingredientes.add("\t\t* Orégano");
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
