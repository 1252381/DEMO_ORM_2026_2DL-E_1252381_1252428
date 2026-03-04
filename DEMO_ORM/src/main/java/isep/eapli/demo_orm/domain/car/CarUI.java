package isep.eapli.demo_orm.domain.car;

import isep.eapli.demo_orm.util.Console;
import isep.eapli.demo_orm.domain.cargroup.CarGroup;

public class CarUI {
    private final CarController controller = new CarController();

    public void registerCar() {
        String plate = Console.readLine("Matrícula:");
        int yM = Console.readInteger("Ano Fabrico:");
        int yA = Console.readInteger("Ano Aquisição:");
        String color = Console.readLine("Cor:");
        String engine = Console.readLine("Cilindrada:");

        System.out.println("Grupos disponíveis:");
        for (CarGroup cg : controller.getAvailableGroups()) {
            System.out.println(cg.getId() + " - " + cg.getName());
        }
        Long groupId = (long) Console.readInteger("ID do Grupo:");

        Car car = controller.registerCar(plate, yM, yA, color, engine, groupId);
        System.out.println("Carro registado: " + car);
    }

    public void listCars() {
        for (Car c : controller.listCars()) {
            System.out.println(c);
        }
    }

    public void searchCar() {
        Long id = (long) Console.readInteger("ID do Carro:");
        Car c = controller.searchCar(id);
        System.out.println(c != null ? c : "Não encontrado.");
    }
}