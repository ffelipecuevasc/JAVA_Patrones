package com.fcuevas.patrones.singleton;

public class PrincipalSingleton {

    /*SINGLETON
     * Es un patrón de diseño que asegura que solo exista una única instancia de una clase en todo el programa,
     * y que todos accedan a esa misma instancia.
     *
     * ¿Para qué sirve?
     * Para cuando necesitas una sola instancia global de algo, como:
     * - Un logger (registro de eventos).
     * - Una configuración global del sistema.
     * - Una conexión a base de datos compartida.
     * */

    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            ConexionBDSingleton con = ConexionBDSingleton.getInstancia();
            System.out.println("con = " + con);
        }
    }
}
