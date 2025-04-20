package com.fcuevas.patrones.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Observable {

    protected List<IObserver> observadores;

    public Observable(){
        this.observadores = new ArrayList<>();
    }

    public void agregarObservadores(IObserver observer){
        observadores.add(observer);
    }

    public void eliminarObservadores(IObserver observer){
        observadores.remove(observer);
    }

    public void notificarObservadores(){
        for(IObserver obs : this.observadores){
            obs.actualizar(this);
        }
    }
}
