package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quadratic Equation: ");
        System.out.println("Enter a: \t");
        double a = sc.nextDouble();
        System.out.println("Enter b: \t");
        double b = sc.nextDouble();
        System.out.println("Enter c: \t");
        double c = sc.nextDouble();

        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
        double delta = quadraticEquation.getDiscriminant();
        if (delta < 0){
            System.out.println("The equation has no real root.");
        }
        else if (delta == 0){
            System.out.println("The equation has double root: " + quadraticEquation.doubleRoot());
        }
        else {
            System.out.println("The equation has 2 root: ");
            System.out.println( "X1" + quadraticEquation.root1());
            System.out.println("X2" + quadraticEquation.root2());

        }

    }

}
