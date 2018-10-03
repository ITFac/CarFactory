package com.techsys.carfactory.icar;

public abstract class Tire implements Descriptor {

    String made;

    public void describe() {
        System.out.println(made);
    }

    public void setMade(String made) {
        this.made = made;
    }
}
