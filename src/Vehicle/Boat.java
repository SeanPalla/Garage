package Vehicle;

import Vehicle.Parts.Engine;

public class Boat extends Vehicle {

    // private String fuelType;
    // private String hullMaterial;

    public Boat(String manufacturer, String model, Engine engine) {
        super(manufacturer, model, engine, "Boat");
        // TODO Auto-generated constructor stub
    }

    @Override
    public void move(String direction) {
        System.out.println("Boat moves " + direction);
        // TODO Auto-generated method stub

    }

    @Override
    public void noise(float decibels) {
        System.out.println("noise level: " + decibels);
        // TODO Auto-generated method stub

    }

    @Override
    public void light(String light) {
        System.out.println("Boat activates light " + light);
        // TODO Auto-generated method stub

    }

}
