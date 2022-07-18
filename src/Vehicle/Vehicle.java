package Vehicle;

import java.util.Objects;

import Vehicle.Parts.Engine;

public abstract class Vehicle {

    private long id;
    private String manufacturer;
    private String model;
    private Engine engine;
    private String type;

    public Vehicle(String manufacturer, String model, Engine engine, String type) {
        super();
        this.manufacturer = manufacturer;
        this.model = model;
        this.engine = engine;
        this.type = type;
    }

    public abstract void move(String direction);

    public abstract void noise(float decibels);

    public abstract void light(String light);

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getManufacturer() {
        return this.manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Engine getEngine() {
        return this.engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "{" +
                " id='" + getId() + "'" +
                ", manufacturer='" + getManufacturer() + "'" +
                ", model='" + getModel() + "'" +
                ", engine='" + getEngine() + "'" +
                ", type='" + getType() + "'" +
                "}";
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Vehicle)) {
            return false;
        }
        Vehicle vehicle = (Vehicle) o;
        return id == vehicle.id && Objects.equals(manufacturer, vehicle.manufacturer)
                && Objects.equals(model, vehicle.model) && Objects.equals(engine, vehicle.engine)
                && Objects.equals(type, vehicle.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, manufacturer, model, engine, type);
    }

}
