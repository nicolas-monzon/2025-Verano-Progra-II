package org.example.model;

public class ComplejoConParteRealPositiva implements IComplejo {

    private double real;
    private double complex;

    public ComplejoConParteRealPositiva(double real, double complex) {
        this.real = real;

        if(this.real < 0) {
            throw new RuntimeException("Parte real negativa");
        }

        this.complex = complex;
    }

    public double getReal() {
        return real;
    }

    public double getComplex() {
        return complex;
    }



}
