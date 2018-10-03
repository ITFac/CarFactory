package com.techsys.carfactory;

import com.techsys.carfactory.car.DunlopTire;
import com.techsys.carfactory.car.OnePointFiveEngine;
import com.techsys.carfactory.car.Swift;
import com.techsys.carfactory.icar.Car;

public class Demo {


    public static void main(String[] args) {


        Car car = new Swift();
        car.setEngine(new OnePointFiveEngine());

        car.pushTire(new DunlopTire());
        car.pushTire(new DunlopTire());
        car.pushTire(new DunlopTire());
        car.pushTire(new DunlopTire());

        car.describe();


    }

}
