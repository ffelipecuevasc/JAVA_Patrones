package com.fcuevas.patrones.decorator;

public class Texto implements IFormateable{

    private String t;

    public Texto(String texto){
        this.t = texto;
    }

    public String getT() {
        return t;
    }

    @Override
    public String darFormato() {
        return getT();
    }
}
