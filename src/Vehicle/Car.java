package Vehicle;

import Vehicle.Parts.Engine;

public class Car extends Vehicle {

    // private byte numOfDoors;
    // private byte numOfSeats;
    // private Float fuel;

    public Car(String manufacturer, String model, Engine engine) {
        super(manufacturer, model, engine, "CAR");
        // TODO Auto-generated constructor stub
    }

    @Override
    public void move(String direction) {
        System.out.println("Car moves " + direction);
        // TODO Auto-generated method stub

    }

    @Override
    public void noise(float decibels) {
        System.out.println("noise level: " + decibels);
        // TODO Auto-generated method stub

    }

    @Override
    public void light(String light) {
        System.out.println("car activates light " + light);
        // TODO Auto-generated method stub

    }

}
