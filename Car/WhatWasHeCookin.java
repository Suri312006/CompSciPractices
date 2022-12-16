package Car;

public class WhatWasHeCookin {
    public static void main(String[] lmao){
        Car acura = new Car("acura", 50, 10, 4000, 20);
        Car fordTruck = new Car("Ford Truck", 10, 30);

        acura.drive(600);
        System.out.println(acura);

        fordTruck.refuelFriend(acura, 10, 50);
        System.out.print(acura);
        System.out.print(fordTruck);

        acura.drive(300);
        System.out.println(acura);

        acura.refuel(10);

        fordTruck.refuelFriend(acura, -2, 100);

        fordTruck.refuelFriend(acura, 5, 100);

        System.out.print(acura);
        System.out.println(fordTruck);

        fordTruck.refuel(40);

        fordTruck.refuelFriend(acura, 5, 100);
        System.out.println(acura);
        System.out.print(fordTruck);
    }

}
