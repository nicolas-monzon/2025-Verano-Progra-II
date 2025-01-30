package org.example.model;

public class Direccion {

    private String calle;
    private int altura;
    private boolean unidireccional;

    public Direccion() {
        System.out.println("Se creó una dirección");
    }

    public Direccion(String calle) {
        this.calle = calle;
        System.out.println("Se creó una dirección");
    }

    public int distancia(int alturaOrigen) {
        return alturaOrigen - altura;
    }

    public static int distancia2(Direccion d1, Direccion d2) {
        return d1.distancia(d2.altura);
    }

}
