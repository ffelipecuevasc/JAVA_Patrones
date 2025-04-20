package com.fcuevas.patrones.decorator.patron;

import com.fcuevas.patrones.decorator.IFormateable;

public class SubrayadoDecorator extends TextoDecorator{

    public SubrayadoDecorator(IFormateable texto) {
        super(texto);
    }

    @Override
    public String darFormato() {
        int largo = this.textoFormateable.darFormato().length();
        StringBuilder sb = new StringBuilder(this.textoFormateable.darFormato());
        sb.append("\n");
        for(int i=0;i<largo;i++) sb.append("_");
        return sb.toString();
    }
}
