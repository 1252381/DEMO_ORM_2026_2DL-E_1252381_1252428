package isep.eapli.demo_orm.domain.cargroup;

import isep.eapli.demo_orm.util.Console;

/**
 *
 * @author mcn
 */
public class CarGroupUI {

    private final CarGroupController controller = new CarGroupController();

    public void registerCG() {
        System.out.println("*** Register Car Group ***\n");
        String name = Console.readLine("Name:");
        int doors = Console.readInteger("Number of doors:");
        String classification = Console.readLine("Class:");
        CarGroup carGroup = controller.
                registerCarGroup(name, doors, classification);
        System.out.println("Car Group: " + carGroup);
    }

    public void listGAs() {
        System.out.println("*** List of Car Groups ***");
        for (CarGroup cg : controller.listCarGroups()) {
            System.out.println(cg.toString());
        }
    }

    public void searchGAPorID() {
        System.out.println("*** Search for Car Group ***");
        long id = (long) Console.readInteger("Give ID: ");
        CarGroup cg = controller.searchCarGroup(id);
        if (cg != null) {
            System.out.println(cg.toString());
        } else {
            System.out.println("No car group found with that ID.");
        }
    }
}