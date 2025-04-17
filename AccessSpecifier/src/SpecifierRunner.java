import com.tutorsdude.accessspecifier.Vehicle;

public class SpecifierRunner extends Vehicle {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        Vehicle.move();
        Vehicle.transport();

        vehicle.name = "THAR";
        System.out.println(vehicle.name);
        vehicle.brand = "Mahindra";
        System.out.println(vehicle.brand);
        vehicle.price = 1100000;
        System.out.println(vehicle.price);
        vehicle.wheels = 4;
        System.out.println(vehicle.wheels);

    }
}
