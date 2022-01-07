package com.codegym;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation() {

    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    double delta;

    public double getDiscriminant() {
        return delta = Math.pow(this.b, 2) - 4 * this.a * this.c;
    }

    double r1;
    double r2;

    public double root1() {
        return r1 = ((-this.b + Math.sqrt(delta)) / (2 * this.a));
    }

    public double root2() {
        return r2 = ((-this.b - Math.sqrt(delta)) / (2 * this.a));
    }

    public double doubleRoot() {
        return -this.b / (2 * this.a);
    }
}
