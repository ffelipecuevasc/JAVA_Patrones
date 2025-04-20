package com.fcuevas.patrones.decorator;

import com.fcuevas.patrones.decorator.patron.MayusculasDecorator;
import com.fcuevas.patrones.decorator.patron.RevertirDecorator;
import com.fcuevas.patrones.decorator.patron.SubrayadoDecorator;

public class PrincipalDecorator {
    public static void main(String[] args) {

        /*DECORATOR
         * Es un patrón de diseño estructural que permite agregar funcionalidades extra a un objeto,
         *  sin modificar su clase original, envolviéndolo en un objeto decorador.
         *
         * Imagina que tienes un pastel básico, y le puedes ir agregando capas: chocolate, frutas, crema, etc.
         * Cada capa decoradora envuelve al pastel y le añade algo más, pero el pastel base sigue siendo el mismo.
         * Eso es el patrón Decorator.
         *
         * ¿Para qué sirve?
         * - Para extender el comportamiento de objetos de forma flexible.
         * - Para evitar crear muchas subclases solo para agregar pequeñas funciones nuevas.
         * - Para seguir el principio de abierto/cerrado: abierto a extender, cerrado a modificar.
         * */

        IFormateable texto = new Texto("Hola Felipe, buen dia.");

        MayusculasDecorator may = new MayusculasDecorator(texto);
        RevertirDecorator rev = new RevertirDecorator(may);
        SubrayadoDecorator sub = new SubrayadoDecorator(rev);

        System.out.println(sub.darFormato());
    }
}
