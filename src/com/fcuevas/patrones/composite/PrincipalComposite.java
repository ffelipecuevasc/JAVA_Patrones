package com.fcuevas.patrones.composite;

public class PrincipalComposite {

    /*COMPOSITE
     * Es un patrón de diseño estructural que permite tratar objetos individuales y grupos de objetos de la misma manera.
     * En otras palabras: permite trabajar con estructuras jerárquicas (como árboles), donde un objeto puede contener
     * otros objetos, y todos siguen una misma interfaz.
     *
     * ¿Para qué sirve?
     * - Para manejar estructuras jerárquicas como árboles.
     * - Para tratar objetos individuales y compuestos de forma uniforme.
     * */
    public static void main(String[] args) {
        Directorio doc = new Directorio("Documentos");
        Directorio java = new Directorio("Java");

        java.agregarComponente(new Archivo("patron-composite.docx"));
        Directorio stream = new Directorio("Api Stream");
        stream.agregarComponente(new Archivo("stream-map.docx"));

        java.agregarComponente(stream);

        doc.agregarComponente(java);
        doc.agregarComponente(new Archivo("cv.docx"));
        doc.agregarComponente(new Archivo("logo.jpeg"));

        System.out.println(doc.mostrar(0));
    }
}
