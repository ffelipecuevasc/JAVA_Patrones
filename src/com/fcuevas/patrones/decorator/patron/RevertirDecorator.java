package com.fcuevas.patrones.decorator.patron;

import com.fcuevas.patrones.decorator.IFormateable;

public class RevertirDecorator extends TextoDecorator{

    public RevertirDecorator(IFormateable texto) {
        super(texto);
    }

    @Override
    public String darFormato() {
        StringBuilder sb = new StringBuilder(textoFormateable.darFormato());
        return sb.reverse().toString();
    }
}
