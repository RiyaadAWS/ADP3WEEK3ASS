package com.ryklief;


public class Rectangle extends shapes {

    double calcArea(double i, double v){

        return i*v;
    }

    public double myMethod(double s, double y){

        return super.calcArea(s,y);

    }

    @Override
    double calcArea(double r) {
        return super.calcArea(r);
    }

    public static void main (String [] args){
        Rectangle r = new Rectangle();



        System.out.println(r.calcArea(2.9,2.8)); //overridden
        System.out.println(r.calcArea(29)); // inheritance
        System.out.println(r.calcArea(23.0));

        System.out.println(r.myMethod(2, 3));
        shapes s = new shapes();
        s.calcArea(23,25);
        System.out.println(s);

    }
}

