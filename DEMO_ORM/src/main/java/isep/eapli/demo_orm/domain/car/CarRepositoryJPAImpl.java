package isep.eapli.demo_orm.domain.car;

import isep.eapli.demo_orm.domain.JpaRepository;

public class CarRepositoryJPAImpl
        extends JpaRepository<Car, Long>
        implements CarRepository {

        @Override
        protected String persistenceUnitName() {
            return "DEMO_ORMPU";
        }
}
