package com.techsys.carfactory.icar;

public abstract class Engine  implements Descriptor  {

    private  String size;

    public void describe(){
        System.out.println(size);
    }

    public void setSize(String size) {
        this.size = size;
    }
}
