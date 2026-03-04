package isep.eapli.demo_orm.domain.car;

import isep.eapli.demo_orm.domain.cargroup.CarGroup;
import jakarta.persistence.*;

@Entity
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String licensePlate;
    private int yearOfManufacture;
    private int yearOfAcquisition;
    private String color;
    private String engineDispl;

    @ManyToOne
    private CarGroup carGroup;

    public Car() {}

    public Car(String licensePlate, int yearOfManufacture, int yearOfAcquisition,
               String color, String engineDispl, CarGroup carGroup) {
        this.licensePlate = licensePlate;
        this.yearOfManufacture = yearOfManufacture;
        this.yearOfAcquisition = yearOfAcquisition;
        this.color = color;
        this.engineDispl = engineDispl;
        this.carGroup = carGroup;
    }
}
