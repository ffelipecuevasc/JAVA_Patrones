package com.fcuevas.patrones.factory.variedades;

import com.fcuevas.patrones.factory.PizzaProducto;
import com.fcuevas.patrones.factory.PizzeriaEuropeaFactory;

public class PizzaEuropeaNapolitana extends PizzaProducto {

    public PizzaEuropeaNapolitana(){
        super();
        this.nombre = "Pizza Europea Napolitana";
        this.masa = "Masa Gruesa a la Piedra";
        this.salsa = "Salsa de Tomate Italiano";
        this.ingredientes.add("\t\t* Queso Mozzarella");
        this.ingredientes.add("\t\t* Tomate");
        this.ingredientes.add("\t\t* Aceitunas");
        this.ingredientes.add("\t\t* Jamón Serrano");
        this.ingredientes.add("\t\t* Choricillo");
    }

    @Override
    public void cocinar() {
        System.out.println("\t- Cocinando la pizza por 40 minutos a 110°.");
    }

    @Override
    public void cortar() {
        System.out.println("\t- Cortando la pizza en rebanadas triangulares grandes.");
    }
}
