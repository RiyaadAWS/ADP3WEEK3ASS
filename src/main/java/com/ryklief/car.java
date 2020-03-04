package com.ryklief;




public class car extends extras {



    public static void main(String[] args) {

        // Create a  object
        car myCar = new car();
        myCar.setColor("blue");
        extras extra = new extras();
        extra.setType("SUV");
        Body engine = new Body();


        System.out.println(extra.getType() + "\t" + myCar.getColor());

        myCar.engineColor();
        extra.engineType();
        engine.engineType();


    }
}