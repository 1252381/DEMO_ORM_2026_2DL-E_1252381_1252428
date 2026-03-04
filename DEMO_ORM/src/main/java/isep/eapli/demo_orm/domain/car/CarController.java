package isep.eapli.demo_orm.domain.car;

import isep.eapli.demo_orm.domain.cargroup.*;
import java.util.List;

public class CarController {
    private final CarRepository carRepo = new CarRepositoryJPAImpl();
    private final CarGroupRepository groupRepo = new CarGroupRepositoryJPAImpl();

    public Car registerCar(String plate, int yearM, int yearA, String color, String engine, Long groupId) {
        CarGroup group = groupRepo.findById(groupId);
        if (group == null) throw new IllegalArgumentException("Car Group not found");

        Car car = new Car(plate, yearM, yearA, color, engine, group);
        return carRepo.add(car);
    }

    public List<Car> listCars() {
        return carRepo.findAll();
    }

    public Car searchCar(Long id) {
        return carRepo.findById(id);
    }

    public List<CarGroup> getAvailableGroups() {
        return groupRepo.findAll();
    }
}
