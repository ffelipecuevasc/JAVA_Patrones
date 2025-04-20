package com.fcuevas.patrones.singleton;

public class ConexionBDSingleton {
    private static ConexionBDSingleton instancia;

    private ConexionBDSingleton(){
        System.out.println("Conectándose a alguna BD...");
    }

    public static ConexionBDSingleton getInstancia(){
        if(instancia == null) instancia = new ConexionBDSingleton();
        return instancia;
    }
}
