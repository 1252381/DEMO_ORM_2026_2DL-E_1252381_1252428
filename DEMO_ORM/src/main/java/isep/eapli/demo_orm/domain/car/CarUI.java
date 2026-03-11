package isep.eapli.demo_orm.domain.car;

import isep.eapli.demo_orm.util.Console;
import isep.eapli.demo_orm.domain.cargroup.CarGroup;

public class CarUI {
    private final CarController controller = new CarController();

    public void registerCar() {
        String plate = Console.readLine("License Plate:");
        int yM = Console.readInteger("Manufacture Year:");
        int yA = Console.readInteger("Acquisition Year:");
        String color = Console.readLine("Color:");
        String engine = Console.readLine("Engine Capacity:");

        System.out.println("Available Groups:");
        for (CarGroup cg : controller.getAvailableGroups()) {
            System.out.println(cg.getId() + " - " + cg.getName());
        }
        Long groupId = (long) Console.readInteger("Group ID:");

        Car car = controller.registerCar(plate, yM, yA, color, engine, groupId);
        System.out.println("Car registered: " + car);
    }

    public void listCars() {
        for (Car c : controller.listCars()) {
            System.out.println(c.toString());
        }
    }

    public void searchCar() {
        Long id = (long) Console.readInteger("Give ID:");
        Car c = controller.searchCar(id);
        System.out.println(c != null ? c.toString() : "No car with that ID.");
    }
}