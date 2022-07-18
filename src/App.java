import java.util.List;
import Vehicle.Boat;
import Vehicle.Car;
import Vehicle.Motorbike;
import Vehicle.Vehicle;
import Vehicle.Parts.Engine;

public class App {
    public static void main(String[] args) throws Exception {
        Engine electricEngine = new Engine("ELECTRIC");
        Engine combustionEngine = new Engine("COMBUSTION");
        Vehicle tesla = new Car("Tesla", "Model X", electricEngine);
        Vehicle kawasaki = new Motorbike("Kawasaki", "Ninja", combustionEngine);
        Vehicle beneteau = new Boat("Beneteau", "Oceanis", combustionEngine);
        Garage garage = new Garage();
        garage.add(tesla);
        garage.add(kawasaki);
        garage.add(beneteau);
        List<String> bills = garage.getBills();

        for (var bill : bills) {
            System.out.println(bill);

        }
    }
}