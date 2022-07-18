import java.util.ArrayList;
import java.util.List;

import Vehicle.Boat;
import Vehicle.Car;
import Vehicle.Motorbike;
import Vehicle.Vehicle;

public class Garage {

    public static long idCounter = 1;
    private List<Vehicle> vehicles;
    private int baseRepairCost;

    public Garage() {
        this.vehicles = new ArrayList<>();
        this.baseRepairCost = 50;
    }

    public Garage(List<Vehicle> vehicles, int baseRepairCost) {
        this.vehicles = vehicles;
        this.baseRepairCost = baseRepairCost;
    }

    public void add(Vehicle vehicle) {
        for (var vehicleInGarage : vehicles) {
            if (vehicleInGarage.equals(vehicle)) {
                throw new RuntimeException("vehicle already exists");
            }
        }
        vehicle.setId(idCounter++);
        this.vehicles.add(vehicle);
    }

    public List<String> getBills() {
        List<String> bills = new ArrayList<>();
        for (var vehicle : vehicles) {
            int cost = calculateCost(vehicle);
            bills.add("the total cost of the repair is £" + cost + " for vehicle " + vehicle.toString());
        }
        return bills;

    }

    protected String getBill(Long id) {
        for (int i = 0; i < vehicles.size(); i++) {
            var current = vehicles.get(i);
            if (current.getId() == id) {
                int cost = calculateCost(current);
                return "the total cost of the repair is £" + cost;
            }
        }
        throw new RuntimeException("vehicle with this id does not exist " + id);
    }

    public String fix(long id) {
        return getBill(id);

    }

    public Vehicle remove(long id) {
        for (int i = 0; i < vehicles.size(); i++) {
            var current = vehicles.get(i);
            if (current.getId() == id) {
                return vehicles.remove(i);
            }
        }
        throw new RuntimeException("vehicle with this id does not exist" + id);
    }

    public Vehicle remove(Vehicle vehicle) {
        for (int i = 0; i < vehicles.size(); i++) {
            var current = vehicles.get(i);
            if (current.equals(vehicle)) {
                return vehicles.remove(i);
            }
        }
        throw new RuntimeException("vehicle does not exist" + vehicle.toString());
    }

    public List<Vehicle> empty() {
        var oldVehicles = vehicles;
        vehicles = new ArrayList<>();
        return oldVehicles;

    }

    public List<Vehicle> empty(String type) {
        List<Vehicle> vehiclesToRemove = new ArrayList<>();
        for (var vehicle : vehicles) {
            if (vehicle.getType().equals(type)) {
                vehiclesToRemove.add(vehicle);
            }
        }
        vehicles.removeAll(vehiclesToRemove);
        return vehiclesToRemove;
    }

    private int calculateCost(Vehicle vehicle) {
        if (vehicle instanceof Car) {
            return 3 * baseRepairCost;
        } else if (vehicle instanceof Motorbike) {
            return 2 * baseRepairCost;
        } else if (vehicle instanceof Boat) {
            return 4 * baseRepairCost;
        } else {
            return 5 * baseRepairCost;
        }
    }
}
