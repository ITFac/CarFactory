package com.techsys.carfactory;

import com.techsys.carfactory.car.DunlopTire;
import com.techsys.carfactory.car.OnePointFiveEngine;
import com.techsys.carfactory.car.SomeTire;
import com.techsys.carfactory.car.Swift;
import com.techsys.carfactory.icar.Car;

import java.sql.SQLOutput;

public class Demo {


    public static void main(String[] args) {


        Car car = new Swift();
        car.setEngine(new OnePointFiveEngine());

        car.pushTire(new DunlopTire());
        car.pushTire(new DunlopTire());
        car.pushTire(new SomeTire());
        car.pushTire(new SomeTire());

        car.describe();


        System.out.println("This is awesome!!!!");
        System.out.println("This is goooddddd!!!!!!! Really Gooooood");
    }

}
