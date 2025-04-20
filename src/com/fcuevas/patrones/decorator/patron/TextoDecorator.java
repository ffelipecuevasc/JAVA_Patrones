package com.fcuevas.patrones.decorator.patron;

import com.fcuevas.patrones.decorator.IFormateable;

public abstract class TextoDecorator implements IFormateable {

    protected IFormateable textoFormateable;

    public TextoDecorator(IFormateable texto){
        this.textoFormateable = texto;
    }
}
