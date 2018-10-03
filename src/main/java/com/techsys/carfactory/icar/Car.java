package com.techsys.carfactory.icar;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public abstract class Car implements Descriptor {

    private List<Tire> tires;
    private Engine engine;
    private String type;

    public Car(){
        this.tires = new ArrayList<Tire>();
    }

    public void describe(){
        System.out.println("This is a "+type);
        System.out.println("---------------------------");
        System.out.println("This car has folloing tires");
        System.out.println("Front Left :");
        tires.get(0).describe();
        System.out.println("Front Right :");
        tires.get(1).describe();
        System.out.println("Rear Left :");
        tires.get(2).describe();
        System.out.println("Rear Right :");
        tires.get(3).describe();
        System.out.println("---------------------------");
        System.out.println("Engine :");
        this.engine.describe();
        System.out.println("---------------------------");
    }



    public void pushTire(Tire tire) {
        this.tires.add(tire);
    }


    public void setEngine(Engine engine) {
        this.engine = engine;
    }


    public void setType(String type) {
        this.type = type;
    }
}
