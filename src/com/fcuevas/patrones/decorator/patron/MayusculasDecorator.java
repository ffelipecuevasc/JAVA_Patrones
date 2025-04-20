package com.fcuevas.patrones.decorator.patron;

import com.fcuevas.patrones.decorator.IFormateable;

public class MayusculasDecorator extends TextoDecorator{

    public MayusculasDecorator(IFormateable texto) {
        super(texto);
    }

    @Override
    public String darFormato() {
        return this.textoFormateable.darFormato().toUpperCase();
    }
}
