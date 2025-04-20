package com.fcuevas.patrones.composite;

import java.util.ArrayList;
import java.util.List;

public class Directorio extends Componente{

    private List<Componente> hijos;

    public Directorio(String nombre) {
        super(nombre);
        this.hijos = new ArrayList<Componente>();
    }

    public Directorio agregarComponente(Componente c){
        this.hijos.add(c);
        return this;
    }

    public void eliminarComponente(Componente c){
        this.hijos.remove(c);
    }

    @Override
    public String mostrar(int nivel) {
        StringBuilder sb = new StringBuilder("\t".repeat(nivel));
        sb.append(nombre).append("/").append("\n");
        for(Componente hijo : hijos){
            sb.append(hijo.mostrar(nivel+1));
            if(hijo instanceof Archivo) sb.append("\n");
        }
        return sb.toString();
    }
}
