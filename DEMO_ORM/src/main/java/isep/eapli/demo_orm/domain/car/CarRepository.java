package isep.eapli.demo_orm.domain.car;

import java.util.List;

public interface CarRepository {
    Car add(Car entity);
    Car findById(Long id);
    List<Car> findAll();
}
