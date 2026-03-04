package isep.eapli;

import isep.eapli.demo_orm.domain.cargroup.CarGroup;
import isep.eapli.demo_orm.domain.cargroup.CarGroupRepository;
import isep.eapli.demo_orm.domain.cargroup.CarGroupRepositoryJPAImpl;


public class Main {
    public static void main(String[] args) {
        // 1. Create the repository
        CarGroupRepository repo = new CarGroupRepositoryJPAImpl();

        // 2. Create a new CarGroup object (using the constructor we fixed earlier!)
        CarGroup myCarGroup = new CarGroup("Luxury SUV", 5, "Class A");

        // 3. Save it to the database
        System.out.println("Saving CarGroup to the database...");
        repo.add(myCarGroup);
        System.out.println("Successfully saved!");

        // 4. Retrieve it to prove it's there
        System.out.println("Fetching all CarGroups from database:");
        for (CarGroup cg : repo.findAll()) {
            System.out.println("- Found: " + cg);
        }
    }
}