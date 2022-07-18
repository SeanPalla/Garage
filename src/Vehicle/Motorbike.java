package Vehicle;

import Vehicle.Parts.Engine;

public class Motorbike extends Vehicle {

    // private Float engineCC;
    // private Float mileage;

    public Motorbike(String manufacturer, String model, Engine engine) {
        super(manufacturer, model, engine, "Bike");
        // TODO Auto-generated constructor stub
    }

    @Override
    public void move(String direction) {
        System.out.println("Motorbike moves " + direction);
        // TODO Auto-generated method stub

    }

    @Override
    public void noise(float decibels) {
        System.out.println("noise level: " + decibels);
        // TODO Auto-generated method stub

    }

    @Override
    public void light(String light) {
        System.out.println("Motorbike activates light " + light);
        // TODO Auto-generated method stub

    }

}
