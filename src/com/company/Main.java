package com.company;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Car,Danye> map =new HashMap<>();
        Car car = new Car(1,23456);
        Danye danye = new Danye(1997,"BMW",20000,"black");
         Car car1 = new Car(2,60986);
         Danye danye1 = new Danye(2020,"mersedes",30000,"write");
         Car car2 = new Car(3,23936746);
         Danye danye2 = new Danye(2015,"Audi",25000,"selebrity");
        map.put(car,danye);
        map.put(car1,danye1);
        map.put(car2,danye2);
        for (Map.Entry e:map.entrySet()) {
            System.out.println(e.getKey()+" "+e.getValue());
        }
    }
}