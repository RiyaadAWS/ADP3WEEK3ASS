package com.ryklief;


public class shapes {

    String t;

    public shapes(){}


    public shapes(String t){

        this.t=t;

    }
    double calcArea (int x, int y){

        double z = x * y;
        return z;
    }

    double calcArea (int y){

        return y * y;
    }

    double calcArea (double r){

        return Math.PI*r*r;

    }

    public String toString(){

        return t;
    }

    public static void main (String [] args){

        shapes shape = new shapes();
        System.out.println(shape.calcArea(23));
        System.out.println(shape.calcArea(3.0));
        System.out.println(shape.calcArea(23,4));



    }

    double calcArea(double s, double y) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
