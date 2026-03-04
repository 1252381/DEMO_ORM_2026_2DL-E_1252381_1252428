package isep.eapli.demo_orm.domain.cargroup;

import java.util.List;

/**
 *
 * @author eapli
 */
public class CarGroupController {

    public CarGroup registerCarGroup(String name, int doorNumber,
                                     String classification) {
        CarGroup group1 = new CarGroup(name, doorNumber, classification);
        CarGroupRepository repo = new CarGroupRepositoryJPAImpl();
        return repo.add(group1);
    }

    public List<CarGroup> listCarGroups() {
        CarGroupRepository repo = new CarGroupRepositoryJPAImpl();

        return repo.findAll();
	}

	public CarGroup searchCarGroup(long id) {
        CarGroupRepository repo = new CarGroupRepositoryJPAImpl();

        return repo.findById(id);
	}

}
