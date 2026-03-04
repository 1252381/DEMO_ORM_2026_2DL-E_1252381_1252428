package isep.eapli.demo_orm.domain.cargroup;

import java.util.List;

import isep.eapli.demo_orm.domain.JpaRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;


/**
 *
 * @author eapli
 */
public class CarGroupRepositoryJPAImpl
        extends JpaRepository<CarGroup, Long>
        implements CarGroupRepository {

    @Override
    protected String persistenceUnitName() {
        return "DEMO_ORMPU"; // Matches persistence.xml
    }
}