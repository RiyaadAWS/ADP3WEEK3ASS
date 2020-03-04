
package com.ryklief;

import com.ryklief.Body;

public class extras extends Body {
    private String color;
    private String type;

    public String getColor() {
        return color;
    }

    public String getType() {
        return type;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void engineColor() {

        System.out.println("light grey");
    }

    @Override
    public void engineType()       {

        System.out.println("k20");
    }



}