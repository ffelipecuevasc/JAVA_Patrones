package com.fcuevas.patrones.factory;

public class PrincipalAbstractFactory {

    /*ABSTRACT FACTORY
     * Es un patrón de diseño creacional que permite crear familias de objetos relacionados sin especificar
     * sus clases concretas.
     *
     * Piensa en una fábrica abstracta que no fabrica objetos directamente, sino que proporciona
     * otras fábricas especializadas.
     *
     * ¿Para qué sirve?
     * - Para mantener coherencia entre productos relacionados.
     * - Para ocultar la lógica de creación del cliente.
     * - Para facilitar el cambio de familias de productos (por ejemplo, cambiar de un tema oscuro a claro en una app).
     * */

    public static void main(String[] args) {
        PizzeriaAbstractFactory pizzaAmericana = new PizzeriaAmericanaFactory();
        PizzeriaAbstractFactory pizzaEuropea = new PizzeriaEuropeaFactory();

        PizzaProducto pizza;

        pizza = pizzaAmericana.ordenarPizza("Italiana");
        System.out.println("Felipe encargó la pizza " + pizza.nombre);

        pizza = pizzaAmericana.ordenarPizza("Peperoni");
        System.out.println("Daniel encargó la pizza " + pizza.nombre);

        pizza = pizzaAmericana.ordenarPizza("Vegetariana");
        System.out.println("Camila encargó la pizza " + pizza.nombre);

        pizza = pizzaEuropea.ordenarPizza("4 Quesos");
        System.out.println("Felipe encargó la pizza " + pizza.nombre);

        pizza = pizzaEuropea.ordenarPizza("Napolitana");
        System.out.println("Daniel encargó la pizza " + pizza.nombre);

        pizza = pizzaEuropea.ordenarPizza("Margarita");
        System.out.println("Camila encargó la pizza " + pizza.nombre);

        System.out.println("Pizza = " + pizza);
    }
}
